public class AVL {
    private Noh raiz;
    private int size;
    public boolean isEmpty() {
        return this.raiz == null;
    }

    public void add(int element) {
        this.size++;
        if (isEmpty()) this.raiz = new Noh(element);
        else {

            Noh aux = this.raiz;

            while (aux != null) {

                if (element < aux.valor) {
                    if (aux.esq == null) {
                        Noh newNoh = new Noh(element);
                        aux.esq = newNoh;
                        newNoh.pai = aux;

                        Noh unbalanced = checkBalance(newNoh);
                        if (unbalanced != null) callBestRotation(unbalanced);

                        return;
                    }

                    aux = aux.esq;
                } else {
                    if (aux.dir == null) {
                        Noh newNoh = new Noh(element);
                        aux.dir = newNoh;
                        newNoh.pai = aux;

                        Noh unbalanced = checkBalance(newNoh);
                        if (unbalanced != null) callBestRotation(unbalanced);


                        return;
                    }

                    aux = aux.dir;
                }
            }
        }

    }

    public Noh checkBalance(Noh noh) {
        Noh aux = noh;

        while (aux != null) {
            if (!aux.ehBalanceado()) {
                return aux;
            } else if (aux.pai != null) {
                aux = aux.pai;
            } else {
                break;
            }
        }

        return null;
    }

    private void rebalance(Noh noh) {
        int balance = noh.balance();

        if (Math.abs(balance) > 1) {
            callBestRotation(noh);
        }
    }

    public void callBestRotation(Noh unbalanced) {
        Noh x = unbalanced;

        if (x.isLeftPending()) {
            Noh y = x.esq;

            if (y.esq != null) rotateDir(x);
            else {
                rotateEsq(y); rotateDir(x);
            }

        } else {
            Noh y = x.dir;

            if (y.dir != null) rotateEsq(x);
            else {
                rotateDir(y); rotateEsq(x);
            }
        }
    }

    public void rotateDir(Noh noh) {
        Noh novaRaiz = noh.esq;
        novaRaiz.pai = noh.pai;

        noh.esq = novaRaiz.dir;
        novaRaiz.dir = noh;

        noh.pai = novaRaiz;

        if (novaRaiz.pai != null) {
            if (novaRaiz.pai.esq == noh)
                novaRaiz.pai.esq = novaRaiz;
            else
                novaRaiz.pai.dir = novaRaiz;
        } else
            this.raiz = novaRaiz;
    }

    public void rotateEsq(Noh noh) {
        Noh novaRaiz = noh.dir;
        novaRaiz.pai = noh.pai;

        noh.dir = novaRaiz.esq;
        novaRaiz.esq = noh;

        noh.pai = novaRaiz;

        if (novaRaiz.pai != null) {
            if (novaRaiz.pai.dir == noh)
                novaRaiz.pai.dir = novaRaiz;
            else
                novaRaiz.pai.esq = novaRaiz;
        } else
            this.raiz = novaRaiz;
    }


    public void recursiveAdd(int element) {
        if (isEmpty())
            this.raiz = new Noh(element);
        else {
            recursiveAdd(this.raiz, element);
        }
        this.size++;
    }
    private void recursiveAdd(Noh noh, int element) {
        if (element < noh.valor) {
            if (noh.esq == null) {
                Noh newNode = new Noh(element);
                noh.esq = newNode;
                newNode.pai = noh;
                return;
            }
            recursiveAdd(noh.esq, element);
        } else {
            if (noh.dir == null) {
                Noh newNoh = new Noh(element);
                noh.dir = newNoh;
                newNoh.pai = noh;
                return;
            }
            recursiveAdd(noh.dir, element);
        }
    }

    public Noh buscaRec(int element) {
        return buscaRec(this.raiz, element);
    }
    private Noh buscaRec(Noh node, int element) {
        if (node == null) return null;
        if (element == node.valor) return node;
        if (element < node.valor)
            return buscaRec(node.esq, element);
        else
            return buscaRec(node.dir, element);
    }

    public Noh buscaIter(int element) {
        Noh aux = this.raiz;
        while (aux != null) {
            if (aux.valor == element) return aux;
            if (element < aux.valor) aux = aux.esq;
            if (element > aux.valor) aux = aux.dir;
        }
        return null;
    }

    public void preOrdem() {
        preOrdem(this.raiz);
    }

    private void preOrdem(Noh node) {
        if (node != null) {
            System.out.println(node.valor);
            preOrdem(node.esq);
            preOrdem(node.dir);
        }
    }
    public void emOrdem() {
        emOrdem(this.raiz);
    }
    private void emOrdem(Noh node) {
        if (node != null) {
            emOrdem(node.esq);
            System.out.println(node.valor);
            emOrdem(node.dir);
        }
    }

    public Noh min() {
        if (isEmpty()) return null;
        return min(this.raiz);
    }

    public void posOrdem() {
        posOrdem(this.raiz);
    }
    private void posOrdem(Noh noh) {
        if (noh != null) {
            posOrdem(noh.esq);
            posOrdem(noh.dir);
            System.out.println(noh.valor);
        }
    }

    private Noh min(Noh noh) {
        if (noh.esq == null) return noh;
        else return min(noh.esq);
    }

    public Noh max() {
        if (isEmpty()) return null;

        Noh noh = this.raiz;
        while(noh.dir != null)
            noh = noh.dir;

        return noh;
    }

    private Noh max(Noh noh) {
        if (noh.dir == null) return noh;
        else return max(noh.dir);
    }

    public Noh sucessor(Noh noh) {
        if (noh == null) return null;

        if (noh.dir != null)
            return min(noh.dir);
        else {
            Noh aux = noh.pai;

            while (aux != null && aux.valor < noh.valor)
                aux = aux.pai;

            return aux;
        }
    }

    public Noh busca(int element) {

        Noh aux = this.raiz;

        while (aux != null) {
            if (aux.valor == element) return aux;
            if (element < aux.valor) aux = aux.esq;
            if (element > aux.valor) aux = aux.dir;
        }

        return null;

    }

    public void remove(int value) {
        Noh remove = busca(value);
        if (remove != null) {
            remove(remove);
            this.size--;
        }

    }
    private void remove(Noh remove) {

        if (remove.ehFolha()) {
            if (remove == this.raiz)
                this.raiz = null;
            else {
                if (remove.valor < remove.pai.valor)
                    remove.pai.esq = null;
                else
                    remove.pai.dir = null;
            }
        } else if (remove.sohTemFilhoEsquerda()) {
            if (remove == this.raiz)  {
                this.raiz = remove.esq;
                this.raiz.pai = null;
            } else {
                remove.esq.pai = remove.pai;
                if (remove.valor < remove.pai.valor)
                    remove.pai.esq = remove.esq;
                else
                    remove.pai.dir = remove.esq;
            }
        } else if (remove.sohTemFilhoDireita()) {
            if (remove == this.raiz) {
                this.raiz = remove.dir;
                this.raiz.pai = null;
            } else {
                remove.dir.pai = remove.pai;
                if (remove.valor < remove.pai.valor)
                    remove.pai.esq = remove.dir;
                else
                    remove.pai.dir = remove.dir;
            }
        } else {
            Noh sucessor = sucessor(remove);
            remove.valor = sucessor.valor;
            remove(sucessor);
        }

    }
    public int size() {
        return this.size;
    }
}

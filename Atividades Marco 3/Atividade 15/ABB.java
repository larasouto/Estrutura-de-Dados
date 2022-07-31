public class ABB {
    private Noh raiz;
    private int size;
    public boolean isEmpty() {
        return this.raiz == null;
    }

    public void add(int element) {
        this.size++;
        if (isEmpty())
            this.raiz = new Noh(element);
        else {
            Noh aux = this.raiz;
            while (aux != null) {
                if (element < aux.valor) {
                    if (aux.esq == null) {
                        Noh newNoh = new Noh(element);
                        aux.esq = newNoh;
                        newNoh.pai = aux;
                        return;
                    }
                    aux = aux.esq;
                } else {
                    if
                    (aux.dir == null) {
                        Noh newNoh = new Noh(element);
                        aux.dir = newNoh;
                        newNoh.pai = aux;
                        return;
                    }
                    aux = aux.dir;
                }
            }
        }
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

    public int size() {
        return this.size;
    }
}

public class Noh {
    public int valor;
    public Noh esq;
    public Noh dir;
    public Noh pai;
    Noh (int v) {
        this.valor = v;
    }

    public boolean sohTemFilhoEsquerda() {
        return (this.esq != null && this.dir == null);
    }
    public boolean sohTemFilhoDireita() {
        return (this.esq == null && this.dir != null);
    }
    public boolean ehFolha() {
        return this.esq == null && this.dir == null;
    }

    public int altura() {
        if (this.esq == null && this.dir == null)
            return 0;
        else if (this.esq == null) {
            return 1 + this.dir.altura();
        } else if (this.dir == null) {
            return 1 + this.esq.altura();
        } else {
            return 1 + max(this.esq.altura(), this.dir.altura());
        }
    }

    private int max(int altura1, int altura2) {
        if (altura1 >= altura2)
            return altura1;
        return altura2;
    }

    public int balance() {
        int left = this.esq == null ? -1 : this.esq.altura();
        int right = this.dir == null ? -1 : this.dir.altura();
        return left - right;
    }

    public boolean isLeftPending() {
        int left = this.esq == null ? -1 : this.esq.altura();
        int right = this.dir == null ? -1 : this.dir.altura();
        return left - right >= 1;
    }

    public boolean isRightPending() {
        int left = this.esq == null ? -1 : this.esq.altura();
        int right = this.dir == null ? -1 : this.dir.altura();
        return left - right <= -1;
    }

    public boolean ehBalanceado() {
        int left = this.esq == null ? -1 : this.esq.altura();
        int right = this.dir == null ? -1 : this.dir.altura();
        return left - right >= -1 && left - right <= 1;
    }

}


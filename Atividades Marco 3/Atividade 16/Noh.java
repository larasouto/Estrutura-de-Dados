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

}


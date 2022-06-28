public class Noh {
    private Object info;
    private Noh prox;
    public Noh (Object info){
        this.info = info;
        this.prox = null;
    }
    public Object getInfo() { return info; }
    public Noh getProx() { return prox; }
    public Noh setProx(Noh n) { return this.prox = n; }
}
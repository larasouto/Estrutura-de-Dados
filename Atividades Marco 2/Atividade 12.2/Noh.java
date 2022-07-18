public class Noh {
    private Object info;
    private Noh prox;

    public Noh(Object info) {
        this.info = info;
        this.prox = null;
    }
    public Object getInfo() {
        return info;
    }
    public Noh getProx() {
        return prox;
    }
    public void setProx(Noh n) {
        this.prox = n;
    }

    public void Push(Object pop) {
    }
    public boolean isEmpty() {

        return false;
    }
    public Object Pop() {
        return null;
    }
    public void Top(Object top) {
    }
}


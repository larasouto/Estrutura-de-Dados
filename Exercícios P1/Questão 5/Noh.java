public class Noh {
    public int info;
    private Noh ant; 
    private Noh prox;
    public Noh (int info){
        this.info = info;
        this.ant = null;
        this.prox = null;
    }
    public int getInfo() { 
        return info;
    }
    public Noh getProx() { 
        return prox;
    }
    public void setProx(Noh n) { 
        this.prox = n; 
    }
    public Noh getAnt() {
        return ant;
    }
    public void setAnt(Noh n1) { 
        this.ant = n1; 
    }

    public int info() {
        return 0;
    }
}
public class Noh {
    public Object info; //este exemplo armazena números inteiros
    public Noh prox;
    public Noh (Object info){
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
}

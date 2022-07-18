public class PilhaLista implements IPilha{
    private Noh topo;
    private int numElem;
    public PilhaLista (){
        this.topo = null;
    }

    public Object Top() {
        if (topo==null) {
            System.out.println("Pilha estah vazia");
            return false;
        }
        else{
            return topo.getInfo();
        }
    }
    public boolean Push(Object info){
        Noh novo = new Noh(info);
        if (this.isEmpty())
            topo = novo;
        else {
            novo.setProx(topo);
            topo = novo;
        }
        numElem++;
        return true;
    }
    public Object Pop(){
        Object info = null;
        if (!this.isEmpty()){
            info = topo.getInfo();
            topo = topo.getProx();
            numElem--;
        }
        return info;
    }
    public boolean isEmpty() {
        if(topo==null){
            return true;
        }else{
            return false;
        }
    }
    public int size(){
        return this.numElem;
    }
    public void print(){
        for(Noh i=topo; i != null; i=i.getProx()) {
            System.out.println(i.getInfo());
        }
    }
    public void Reverse(){
        Noh p = new Noh(topo);
        for(Noh i=topo; i != null; i=i.getProx()) {
            Push(p);
        }
        while (topo!=null) {
            p.Push(this.Pop());
        }
    }
}

public class Fila implements IFila {
    private Noh inicio;
    private Noh fim;
    private int ElemFila=0;
    public Fila() {
        this.inicio = null;
        this.fim = null;
    }
    public boolean add(Object info) {
        Noh novo = new Noh(info);
        if (this.isEmpty(info))
            inicio = novo;
        else
            fim.setProx(novo);
        ElemFila++;
        fim = novo;
        return true;
    }
    public boolean remove(Object info) {
        if (!isEmpty(info)) {
            if (inicio == fim) {
                inicio = null;
                fim = null;
            } else
                inicio = inicio.getProx();
                ElemFila--;
            return true;
        }
        return false;
    }
    public int size(){
        return this.ElemFila;
    }
    public void print(){
        for(Noh i=inicio; i != null; i=i.getProx()) {
            System.out.println(i.getInfo());
        }
    }
    public boolean isEmpty(Object info) {
        if(inicio==null){
            return true;
        }else{
            return false;
        }
    }
}
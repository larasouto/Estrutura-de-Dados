public class Fila implements IFila { //tem funcionamento circular
    private int nElemFila;
    private int inicio;
    private int fim;
    private Object[] vetFila;
    public Fila (int tamFila) { //construtor
        this.nElemFila = 0;
        this.inicio = 0;
        this.vetFila = new Object[tamFila];
    }
    public boolean add(Object info){ //método que insere na fila
    if (this.nElemFila == vetFila.length) {
        System.out.println("Capacidade da fila esgotou");
        return false;
    }
    int fim = (this.inicio + this.nElemFila) % this.vetFila.length;
        this.vetFila[fim] = info;
        this.nElemFila++;
        return true;
    }

    public boolean remove() { 
        if (this.isEmpty()){ 
            System.out.println("Fila estah vazia");
            return false;
        }
        this.inicio = (this.inicio + 1) % this.vetFila.length;
        this.nElemFila--;
        return true;
    }
    public boolean isEmpty() {
        return vetFila[inicio] == null && vetFila[fim] == null;
    }
    public boolean isFull() {
        return nElemFila == vetFila.length;
    }
    public int size(){
        return this.nElemFila;
    }
    public void imprime(Object obj){
        for(int i=0;i<nElemFila;i++) {
            System.out.println(vetFila[i]);
        }
    }

}


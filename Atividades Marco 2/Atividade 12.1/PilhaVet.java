public class PilhaVet implements IPilha {

    private Object[] pilha;
    private int numElem;

    public PilhaVet(int tamanhoVetor) { //construtor
        this.pilha = new Object[tamanhoVetor];
        this.numElem = 0;
    }
    public boolean palindrome(String info) {
        String reverse = "";
        for(int i=0;i<info.length();i++){
            this.Push(info.charAt(i));
        }
        while(numElem>0){
            reverse = reverse+this.Pop();
            print(pilha);
        }
        if(info.equals(reverse)) {
            return true;
        }else{
            return false;
        }
    }
    public boolean Push(Object info) { //empilha
        if (this.numElem == pilha.length) {
            System.out.println("pilha estourou");
            return false;
        }
        this.pilha[this.numElem] = info;
        this.numElem++;
        return true;
    }
    public Object Pop() { //desempilha
        Object o = null;
        if (this.isEmpty()) {
            System.out.println("Pilha vazia");
            return null;
        }
        o = this.pilha[numElem - 1];
        this.pilha[numElem - 1] = null;
        this.numElem--;
        return o;
    }
    @Override
    public boolean isFull() {
        if (numElem == this.pilha.length) {
            return true;
        } else {
            return false;
        }
    }
    @Override
    public boolean isEmpty() {
        if (numElem == 0) {
            return true;
        } else {
            return false;
        }
    }
    public int size() {
        return this.numElem;
    }
    public void print(Object obj) {
        for (int i = 0; i < numElem; i++) {
            System.out.println(pilha[i]);
        }
    }
}



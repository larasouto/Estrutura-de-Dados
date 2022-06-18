import java.util.Random;
public class Vetor implements IVetor {
    Random rand  = new Random();
    private int[] vetorInt = new int[100000];
    private int totalInt = 0;

    public void insertion_sort() {
        for (int i = 1; i < this.totalInt; i++) {
        int chave = this.vetorInt[i];
        int j = i - 1;
        while (j >= 0 && chave < this.vetorInt[j]) {
        this.vetorInt[j + 1] = this.vetorInt[j];
        j--;
        }
        this.vetorInt[j + 1] = chave;
        }
    }
    public void selection_sort(){
        for (int i = 0; i < this.totalInt; i++) {
        int menor = i;
        for (int j = i+1; j < this.totalInt; j++)
        if (this.vetorInt[j] < this.vetorInt[menor])
        menor = j;
        int aux = vetorInt[i];
        this.vetorInt[i] = this.vetorInt[menor];
        this.vetorInt[menor] = aux;
        }
    }
    public void bubble_sort(){
        for (int i = 0; i < this.totalInt; i++)
        for (int j = 0; j < this.totalInt-1; j++)
        if (this.vetorInt[j] > this.vetorInt[j+1]) {
        int aux = this.vetorInt[j];
        this.vetorInt[j] = this.vetorInt[j+1];
        this.vetorInt[j+1] = aux;
        }
    }

    public void adiciona(int inteiro){
        this.garanteEspaco();
        if (!this.cheio()){
            this.vetorInt[this.totalInt] = inteiro;
            this.totalInt++;
        }else {
            System.out.print("Vetor cheio!");
        }    
    }
    public boolean cheio(){
        if (totalInt == this.vetorInt.length)
            return true;
        return false;
    }
    public void garanteEspaco(){
        if (this.cheio()){
        int[] novoVetor = new int[this.vetorInt.length * 2];
        for (int i=0; i < this.vetorInt.length; i++)
            novoVetor[i] = this.vetorInt[i];
        this.vetorInt = novoVetor;
        }
    }
    public boolean contem(int inteiro){
        for (int i = 0; i < this.totalInt; i++){
            if (inteiro == (this.vetorInt[i])){
                return true;
            }
        }
        return false;
    }
    public int tamanho(){
        return this.totalInt;
    }
    public boolean remove(int inteiro){
        int indice = -1;
        for(int i=0; i < totalInt; i++) //faz a busca
        if (inteiro == (this.vetorInt[i])) {
                indice = i; 
                break; 
            }
        if (indice != -1){ //achou o elemento
            for(int i=indice; i<(totalInt-1); i++)
                vetorInt[i] = vetorInt[i+1];
            totalInt--;
            return true;
        }
        return false;
        }
         
        public void imprime(Object obj){
            for(int i=0;i<totalInt;i++) {
                System.out.println(vetorInt[i]);
            }
        }
}



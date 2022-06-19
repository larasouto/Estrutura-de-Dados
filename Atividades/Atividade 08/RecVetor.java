import java.util.Random;
import java.util.concurrent.ThreadLocalRandom;

public class RecVetor {
    Random rand  = new Random();
    private int[] vetorInt = new int[1000];
    private int totalInt = 0;
    public int buscaBinariaIterativa(int[] vetor,int valor) {
        int inicio = 0;
        int fim = vetor.length-1;
        int meio;
        while (inicio <= fim) {
            meio = (inicio + fim) / 2;
            if (vetor[meio] == valor) {
                return meio;
            } else if (vetor[meio] > valor) {
                fim = meio-1;
            } else {
                inicio = meio + 1;
            }
        }
        return -1;
    }

    public int buscaBinariaRecursiva(int arr[], int i, int f, int valor) {

        if (f >= i && i <= arr.length - 1) {

            int mid = i + (f - i) / 2;

            if (arr[mid] == valor)
                return mid;

            if (arr[mid] > valor)
                return buscaBinariaRecursiva(arr, i, mid - 1, valor);

            return buscaBinariaRecursiva(arr, mid + 1, f, valor);
        }
        return -1;
    }

    public static int recMax(int[] vetor, int inicio, int fim){
        int meio,max1,max2;

        if (inicio==fim){
            return vetor[inicio];
        } else {
            meio = (inicio + fim)/2;
            max1 = recMax(vetor,inicio,meio);
            max2 = recMax(vetor,meio+1,fim);
            if(max1>max2){
                return max1;
            }
            else{
                return max2;
            }
        }
    }
    public int iterMax(){
        int max=0;
        for(int i=0;i<totalInt;i++){
            if(vetorInt[i]>max){
                max=vetorInt[i];
            }
        }
        return max;
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
    public static int randFill() {
        return (new Random()).nextInt();
    }
}



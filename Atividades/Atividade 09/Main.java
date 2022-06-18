import java.util.Random;
public class Main {
    public static void main(String[] args) {

        IVetor Vetor = new Vetor();
        Random rand  = new Random();

        long tempoI = System.currentTimeMillis();
        System.out.println("Tempo inicial Bubble = "+ tempoI);
        for(int i=0;i<10000;i++){
            Vetor.adiciona(rand.nextInt());
            Vetor.bubble_sort();
        }

        long tempoF = System.currentTimeMillis();
        System.out.println("Tempo final Bubble= "+ tempoF);
        System.out.println("Tempo total Bubble= "+(tempoF-tempoI));
        
        long tempoI2 = System.currentTimeMillis();
        System.out.println("Tempo inicial Selection= "+ tempoI2);
        for(int i=0;i<10000;i++){
            Vetor.adiciona(rand.nextInt());
            Vetor.selection_sort();
        }
        long tempoF2 = System.currentTimeMillis();

        System.out.println("Tempo final Selection= "+ tempoF2);
        System.out.println("Tempo total Selection= "+(tempoF2-tempoI2));

        long tempoI3 = System.currentTimeMillis();
        System.out.println("Tempo inicial Insertion= "+ tempoI3);
        for(int i=0;i<10000;i++){
            Vetor.adiciona(rand.nextInt());
            Vetor.insertion_sort();
        }
        long tempoF3 = System.currentTimeMillis();

        System.out.println("Tempo final Insertion= "+ tempoF3);
        System.out.println("Tempo total insertion= "+(tempoF3-tempoI3));

    }
}

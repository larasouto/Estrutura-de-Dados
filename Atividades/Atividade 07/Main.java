import java.util.Random;
public class Main {
    public static void main(String[] args) {

        RecVetor rv = new RecVetor();
        Random rand = new Random();
        int [] vetor = new int[1000];

        for (int i = 0; i < 1000; i++) {
           rv.adiciona(vetor[i] = rv.randFill());
        }

        long tempoI = System.currentTimeMillis();
        System.out.println("Tempo inicial Método Recursivo = " + tempoI);
        for (int i = 0; i < 1000; i++) {
            rv.recMax(vetor,0,rv.tamanho()-1);
        }

        long tempoF = System.currentTimeMillis();
        System.out.println("Tempo final Método Recursivo= " + tempoF);
        System.out.println("Tempo total Método Recursivo= " + (tempoF - tempoI));
        System.out.println("Maior número  Método Recursivo= " + rv.recMax(vetor,0,rv.tamanho()-1));

        long tempoI2 = System.currentTimeMillis();
        System.out.println("Tempo inicial Método Iterativo = " + tempoI2);
        for (int i = 0; i < 1000; i++) {
            rv.iterMax();
        }
        long tempoF2 = System.currentTimeMillis();
        System.out.println("Tempo final Método Iterativo= " + tempoF2);
        System.out.println("Tempo total Método Iterativo= " + (tempoF2 - tempoI2));
        System.out.println("Maior número  Método Iterativo= " + rv.iterMax());

        //rv.imprime(rv);

    }
}

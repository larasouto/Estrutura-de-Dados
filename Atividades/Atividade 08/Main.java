public class Main {
    public static void main(String[] args) {

        RecVetor rv = new RecVetor();
        int [] vetor = new int[1000];

        for (int i = 0; i < 1000; i++) {
            rv.adiciona(vetor[i] = rv.randFill());
        }

        long tempoI = System.currentTimeMillis();
        System.out.println("Tempo inicial Busca Binaria Iterativa= " + tempoI);
        System.out.println("Posicao numero da busca: "+rv.buscaBinariaIterativa(vetor,-97417129));
        long tempoF = System.currentTimeMillis();
        System.out.println("Tempo final Busca Binaria Iterativa= " + tempoF);
        System.out.println("Tempo total Busca Binaria Iterativa= " + (tempoF - tempoI));

        long tempoI2 = System.currentTimeMillis();
        System.out.println("Tempo inicial Busca Binaria Recursiva= " + tempoI2);
        System.out.println("Posicao numero da busca: "+rv.buscaBinariaRecursiva(vetor,0,rv.tamanho()-1,-97417129));
        long tempoF2 = System.currentTimeMillis();
        System.out.println("Tempo final Busca Binaria Recursiva= " + tempoF2);
        System.out.println("Tempo total Busca Binaria Recursiva= " + (tempoF2- tempoI2));

        rv.imprime(rv);
    }
}

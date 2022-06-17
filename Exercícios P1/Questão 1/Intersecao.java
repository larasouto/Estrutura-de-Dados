public class Intersecao {
    public static void main(String[] args) {
        int vet1[] = {1, 2, 3, 4, 5};
        int vet2[] = {0,0,0,5};
        int vet3[] = new int[10];
        for (int i = 0; i < vet1.length; i++) {
            for (int j = 0; j < vet2.length; j++) {
                if (vet1[i] == vet2[j]) {
                    vet3[i] = vet1[i];
                    System.out.println(vet3[i]);
                }
            }
        }
    }
}

public class Main {
    public static void main(String[] args) {
        ILista l = new LDE();

        l.insereInicio(14);
        l.insereInicio(18);
        l.insereInicio(5);
        l.insereInicio(3);
        l.insereFim(16);
        l.imprime();
        l.imprimeFim();
        System.out.println("Tamanho da lista: "+l.tamanho());
        System.out.println("Lista vazia: "+l.estahVazia(l));
        System.out.println("Pares: "+l.nPares(l));
    }
}
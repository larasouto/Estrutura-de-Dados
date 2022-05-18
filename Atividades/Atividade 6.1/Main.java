public class Main {
    public static void main(String[] args) {
        ILista l = new LDE();

        l.insereInicio(12);
        l.insereFim(16);
        l.imprime();
        l.imprimeFim();
        System.out.println("Tamanho da lista: "+l.tamanho());
        System.out.println("Lista vazia: "+l.estahVazia(l));      
    }
}
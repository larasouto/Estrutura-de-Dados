public class Main {
    public static void main(String[] args) {

        ABB arvore = new ABB();
        arvore.add(12);
        arvore.add(59);
        arvore.add(87);
        arvore.add(7);
        arvore.add(53);
        arvore.add(103);
        arvore.add(51);
        arvore.add(81);
        arvore.add(65);
        arvore.add(55);
        arvore.remove(55);
        arvore.remove(81);
        System.out.println(arvore.buscaIter(51));

        System.out.println("Impressao em ordem:");
        arvore.emOrdem();
        System.out.println("Impressao pos ordem:");
        arvore.posOrdem();
        System.out.println("Impressao pre ordem:");
        arvore.preOrdem();
    }
}
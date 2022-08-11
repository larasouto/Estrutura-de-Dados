public class Main {
    public static void main(String[] args) {

        AVL arvore = new AVL();

        arvore.add(51);
        arvore.add(57);
        arvore.add(98);
        arvore.add(19);
        arvore.add(11);
        arvore.add(45);
        arvore.add(79);

        System.out.println("Impressao em ordem:");
        arvore.emOrdem();

    }
}
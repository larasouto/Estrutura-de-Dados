public class Main{
    public static void main(String[] args) {
        IFila fil = new Fila(5);

        fil.add("Ana");
        fil.add("Joana");
        fil.add("Otavio");
        fil.add("Antonio");
        fil.add("Lara");
        fil.remove();
        fil.add("Juliana");
        fil.imprime(fil);
    }
}
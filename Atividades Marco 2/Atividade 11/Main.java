public class Main {
    public static void main(String[] args) {
        IFila f = new Fila();
        f.add("Lulu");
        f.add("Lara");
        f.remove(f);
        f.print();
        System.out.println(f.size());
    }
}
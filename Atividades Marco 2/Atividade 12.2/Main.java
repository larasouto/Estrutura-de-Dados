public class Main {
    public static void main(String[] args) {
        IPilha p = new PilhaLista();
        Object obj = p.Push("Joana");
        Object obj1 = p.Push("Jonas");
        Object obj2 = p.Push("Marco");
        //Object o1 = p.Pop();
        System.out.println(p.size());
        System.out.println(p.isEmpty());

        p.Reverse();
        p.print();
    }
}

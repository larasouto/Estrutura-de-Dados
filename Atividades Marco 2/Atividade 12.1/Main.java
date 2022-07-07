public class Main {
    public static void main(String[] args) {

        IPilha p = new PilhaVet(20);

        System.out.println(p.palindrome("radar"));
        System.out.println(p.palindrome("reviver"));
        System.out.println(p.palindrome("lua"));
    }
}

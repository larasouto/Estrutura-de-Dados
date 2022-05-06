public class Main {
    public static void main(String[] args) {
        Aluno l1 = new Aluno("Lara",20,8.5);
        Aluno l2 = new Aluno("Dom",17,7.0);
        Aluno l3 = new Aluno("João",24,5.3);
        Alunos al = new Alunos();
        al.adiciona(l1);
        al.adiciona(l2);
        System.out.println(al.contem(l3));
        System.out.println(al.contem(l1));
        System.out.println(l1);
        System.out.println(l2);
        System.out.println(al.tamanho());
    }
}

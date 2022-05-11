public class Main {
    public static void main(String[] args) {
        IAlunos elem = new Alunos();
        elem.adiciona(50);
        elem.adiciona("Um vetor que aceita de tudo");
        Aluno a = new Aluno("João", 30, 10.0);
        Aluno b = new Aluno("Joana", 25, 9.0);
        elem.adiciona(a);
        elem.adiciona(b);
        elem.remove(b);
        elem.imprime(a);
        System.out.println(elem.cheio());
        System.out.println(elem.tamanho());
    }
}

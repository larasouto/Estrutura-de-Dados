public class Main {
    public static void main(String[] args) {
        IAlunos alunos = new Alunos();
        Aluno l1 = new Aluno("Lara",20,8.5);
        Aluno l2 = new Aluno("Dom",12,7.0);
        Aluno l3 = new Aluno("João",18,5.3);
        Aluno l4 = new Aluno("Joana",14,7.0);
        Aluno l5 = new Aluno("Maria",28,7.5);
        Aluno l6 = new Aluno("Carlos",27,6.0);
        Aluno l7 = new Aluno("Andre",32,9.0);
        Aluno l8 = new Aluno("Breno",34,10.0);

        alunos.adiciona(l1);
        alunos.adiciona(l2);
        alunos.adiciona(l3);
        alunos.adiciona(l4);
        alunos.adiciona(l5);
        alunos.adiciona(l6);
        alunos.adiciona(l7);
        alunos.adiciona(l8);
        alunos.remove(l2);
        alunos.remove(l1);
        alunos.remove(l8);

        System.out.println(alunos.contem(l3));
        System.out.println(alunos.contem(l1));
        System.out.println(alunos.tamanho());
        System.out.println(alunos.cheio());
    }
}

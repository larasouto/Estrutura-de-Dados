public class Main {
    public static void main(String[] args) {
        ILista l = new LDE();
        Aluno a = new Aluno("João", 30, 10.0);
        Aluno b = new Aluno("Joana", 25, 9.0);
        l.insereInicio("Oi");
        l.insereFim(7);
        l.remove("Oi");
        l.insereInicio(a);
        l.insereFim(b);
        l.imprime();
        l.imprimeFim();
        System.out.println("Informação na lista: "+l.busca(b));
        System.out.println("Tamanho da lista: "+l.tamanho());
        System.out.println("Lista vazia: "+l.estahVazia(l));      
    }
}
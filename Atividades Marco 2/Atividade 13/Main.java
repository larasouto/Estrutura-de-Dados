public class Main {
    public static void main(String[] args) {

        MapaHashVetor mapH = new MapaHashVetor(10);

        Aluno a1 = new Aluno(1235,"Lara",10,30);
        Aluno a2 = new Aluno(1234,"Joana",8.5,30);
        Aluno a3 = new Aluno(1239,"Jonas",10,30);
        Aluno a4 = new Aluno(1238,"Otavio",9,30);
        Aluno a5 = new Aluno(1237,"Juju",10,30);

        mapH.put(a1.getMatricula(), a1);
        mapH.put(a2.getMatricula(), a2);
        mapH.put(a3.getMatricula(), a3);
        mapH.put(a4.getMatricula(), a4);
        mapH.put(a5.getMatricula(), a5);

        int size = mapH.size();
        System.out.println(size);
    }
}

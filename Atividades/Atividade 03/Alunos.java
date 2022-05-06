public class Alunos implements IAlunos {
    private Aluno[] alunos = new Aluno[5];
    private int totalAlunos = 0;

    public void adiciona(Aluno aluno){
        this.garanteEspaco();
        if (!this.cheio()){
            this.alunos[this.totalAlunos] = aluno;
            this.totalAlunos++;
        }else {
            System.out.print("Vetor cheio!");
        }    
    }
    public boolean cheio(){
        if (totalAlunos == this.alunos.length)
            return true;
        return false;
    }
    public void garanteEspaco(){
        if (this.cheio()){
        Aluno[] novoAlunos = new Aluno[this.alunos.length * 2];
        for (int i=0; i < this.alunos.length; i++)
            novoAlunos[i] = this.alunos[i];
        this.alunos = novoAlunos;
        }
    }
    public boolean contem(Aluno aluno){
        for (int i = 0; i < this.totalAlunos; i++){
            if (aluno.equals(this.alunos[i])){
                return true;
            }
        }
        return false;
    }
    public int tamanho(){
        return this.totalAlunos;
    }
    public boolean remove(Aluno aluno){
        int indice = -1;
        for(int i=0; i < totalAlunos; i++) //faz a busca
        if (aluno.equals(this.alunos[i])) {
                indice = i; 
                break; 
            }
        if (indice != -1){ //achou o elemento
            for(int i=indice; i<(totalAlunos-1); i++)
                alunos[i] = alunos[i+1];
            totalAlunos--;
            return true;
        }
        return false;
        }
}


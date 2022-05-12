public class Alunos implements IAlunos {
    private Object[] elementos = new Object[4];
    private int totalElementos = 0;

    public void adiciona(Object obj){
            this.garanteEspaco();
            if (!this.cheio()){
                this.elementos[this.totalElementos] = obj;
                this.totalElementos++;
            } else{
                System.out.print("Vetor cheio!");
            }    
    }   
    public boolean cheio(){
        if (totalElementos == this.elementos.length)
            return true;
        return false;
    }
    public void garanteEspaco(){
        if (this.cheio()){
        Object[] novoElementos = new Object[this.elementos.length * 2];
        for (int i=0; i < this.elementos.length; i++)
            novoElementos[i] = this.elementos[i];
        this.elementos = novoElementos;
    }
}
    public boolean contem(Object obj){
        for (int i = 0; i < this.totalElementos; i++){
            if (obj.equals(this.elementos[i])){
                return true;
            }
        }
        return false;
    }
    public int tamanho(){
        return this.totalElementos;
    }
    public boolean remove(Object obj){
        int indice = -1;
        for(int i=0; i < totalElementos; i++) //faz a busca
        if (obj.equals(this.elementos[i])) {
                indice = i; 
                break; 
            }
        if (indice != -1){ //achou o elemento
            for(int i=indice; i<(totalElementos-1); i++)
                elementos[i] = elementos[i+1];
            totalElementos--;
            return true;
        }
        return false;
    }
    public void imprime(Object obj){
        for(int i=0;i<totalElementos;i++) {
            System.out.println(elementos[i]);
        }
    }
}

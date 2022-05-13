public class LSE implements ILista {
    private Noh inicio;
    private int totalInfo;
    public LSE (){
        this.inicio = null;
    }
    public void insereInicio(Object info) { 
        Noh novo = new Noh(info);
        if (inicio == null)
            inicio = novo;
        else {
            novo.setProx(inicio);
            inicio = novo;
        }
        totalInfo++;
    }
    public void insereFim(Object info) { 
        Noh novo = new Noh(info);
        if (inicio == null)
            inicio = novo;
        else {
            Noh ultimo = null;
        for(Noh i=inicio; i != null; i=i.getProx())
            ultimo = i;
        ultimo.setProx(novo);
        }
        totalInfo++;
    }
    public boolean remove(Object info) { 
        Noh ant=null, p;
        p = inicio;
        while (p!=null && p.getInfo() != info){
            ant = p;
            p = p.getProx();
        }
        if (p==null){
            return false;
        }
        if (ant==null){
            inicio = p.getProx();
        }
        else{
            ant.setProx(p.getProx());
        }
        totalInfo--; 
        return true;
    }     
    public void imprime(){
        for(Noh i=inicio; i != null; i=i.getProx()) {
            System.out.println(i.info);
        } 
    }
    public int tamanho(){
        return this.totalInfo;
    }
    public boolean estahVazia(Object info) {
        if(inicio==null){
            return true;
        }else{
            return false;
        }   
    }
}





public class LDE implements ILista {
    private Noh inicio;
    private Noh fim;
    private int totalInfo;

    public LDE (){
        this.inicio = null;
        this.fim = null;
    }
    public void insereInicio(Object info) { 
        Noh novo = new Noh(info);
        if (inicio == null){
            inicio = novo;
            fim = novo;
        }
        else {
            novo.setProx(inicio);
            inicio.setAnt(novo);
            inicio = novo;
        }
        totalInfo++;
    }
    public void insereFim(Object info) { 
        Noh novo = new Noh(info);
        if (fim == null)
            fim = novo;
        else {
            novo.setAnt(fim);
            fim.setProx(novo);
            fim = novo;
        }
        totalInfo++;
    }
    public boolean busca(Object info) {
        Noh p = inicio;
        while (p!=null && p.getInfo() != info)
            p = p.getProx();
         if (p == null){
            return false;
         }
         return true;
    }

    public boolean remove(Object info) { 
        busca(info);
        Noh p = inicio;
        if (p==null){
            return false;
        }
        if(p.getAnt() == null){
            inicio = p.getProx();
            inicio.setAnt(null);
        } 
        else if (p.getProx() == null){
            p.getAnt().setProx(null);
            fim = p.getAnt();
        } else {
            p.getAnt().setProx(p.getProx());
            p.getProx().setAnt(p.getAnt());
        }
        totalInfo--;
        return true;
    }
    public void imprime(){
        for(Noh i=inicio; i != null; i=i.getProx()) {
            System.out.println(i.getInfo());
        } 
    }
    public void imprimeFim(){
        for(Noh i=fim; i != null; i=i.getAnt()) {
            System.out.println(i.getInfo());
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






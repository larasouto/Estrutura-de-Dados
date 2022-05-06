class Ponto {
    private int x; 
    private int y;
    
    public Ponto(int x,int y){
        this.x = x;
        this.y = y;
    }
    public int getX(){
        return x;
    }
    public int getY(){
        return y;
    }
    public void setX(int novoX){
        x = novoX;
    }
    public void setY(int novoY){
        y = novoY;
    }

    double distEuclidiana (Ponto p){
        int dx = x - p.x;
        int dy = y - p.y;
        return Math.sqrt(dx*dx + dy*dy);
    }
}

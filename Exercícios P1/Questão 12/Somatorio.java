public class Somatorio {
    public static int sm(int n){
        if(n==0){
           return n;
        }
        else{
            return n + sm(n-1);
        }
    }
}

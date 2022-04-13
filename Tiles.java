public class Tiles{
    public static int placeTiles(int n , int m ){
        if(n == m )
        {
            return 2;
        }
        if(n<m){
            return 1;
        }
        int vertplacement = placeTiles(n-m , m);
        int horiplacement = placeTiles(n-1 , m);
        return vertplacement + horiplacement;
    }
    public static void main(String args[]){
        int n = 4;
        int m = 2;
        System.out.print(placeTiles(n , m));

    }
}
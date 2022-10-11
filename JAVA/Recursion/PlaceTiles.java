import java.util.*;

class PlaceTiles{
    public static int placeTile(int n , int m){
         if(n== m){
            return 2;
         }
         if(n<m){
            return 1;
         }
        int vertical = placeTile(n-m , m);
        int horizontal = placeTile(n-1 , m);
        return vertical +horizontal;
    }
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();
       System.out.print( placeTile(n , m));
    }
}
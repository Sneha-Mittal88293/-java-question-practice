import java.util.*;

class MoveMaze{
    public static int moveMaze( int i , int j ,int n , int m){
        if(i == n || j == m){
            return 0;
        }
        if(i == n-1 && j == m-1){
            return 1;
        }
           
           int downPaths = moveMaze(i+1 , j , n , m);
           int rightPaths = moveMaze(i , j+1 , n , m);

           return downPaths + rightPaths;
    }
       public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();
        int totalPaths = moveMaze(0 , 0 ,n , m );
        System.out.print(totalPaths);
       }
}
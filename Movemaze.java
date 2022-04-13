public class Movemaze{
    public static int countPaths(int i , int j ,int n , int m ){
        if(i == n || j == m){
            return 0 ;
        }
        if(i == n-1 && j == m-1){
            return 1;
        }
        int downPath = countPaths(i+1 , j , n , m);
        int rightpath = countPaths(i , j+1 , n , m);
        return downPath + rightpath ;
    }
    public static void main(String args[]){
        int n = 3 , m = 3;
        System.out.print(countPaths( 0 , 0 , n, m));

    }
}
import java.util.*;

class Factorial{
    public static void fac(int n , int count){
        if(n == 0){
            System.out.print(count);
            return;
        }
        count *= n;
        fac(n-1 , count);

    }
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();

        fac(n , 1);
    }
}
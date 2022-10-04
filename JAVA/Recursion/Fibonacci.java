import java.util.*;

class Fibonacci{
    public static void fib(int n ,int a , int b){
        if(n == 0){
            return ;
        }
        int temp = b+a ;
        System.out.println(temp);
        fib(n-1 , b , temp);
    }
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        int a = 0 ; 
        int b = 1;
        System.out.println(a);
        System.out.println(b);
        fib(n-2 , a ,b);
    }
}
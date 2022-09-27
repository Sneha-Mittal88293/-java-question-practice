import java.util.*;

class Sum{

    public static int sumOfDigit(int a , int b){
        int add = a+b;
        return add;
    }
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
         int a = sc.nextInt();
         int b = sc.nextInt();

         System.out.print(sumOfDigit( a , b));
    }
}
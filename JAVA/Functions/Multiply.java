import java.util.*;

class Multiply{

    public static int calculateMultiply(int a , int b){
        int mul = a*b;
        return mul;
    }
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
         int a = sc.nextInt();
         int b = sc.nextInt();

         System.out.print("Multiply of " + a + " and " +b + " is " + calculateMultiply(a,b));
    }
}
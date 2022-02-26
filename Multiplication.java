import java.util.*;
public class Multiplication{

  // public static int multiple(int a , int b){
      //  int c = a*b;
    //    return c;
   // }

       public static int fact(int n){
           int f = 1;
            
            if(n<0){
                System.out.print("invalid");
                return 0;
            }
            for(int i = n ; i>=1 ; i--){
                f = f * i;
                
            }
           return f;
           

       }


    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int factorial = fact(a);
        System.out.print(factorial);
       // int b = sc.nextInt();

       // int mul = multiple(a , b);
        //System.out.print(mul);
    }
}
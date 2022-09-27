import java.util.*;

class CheckEven{
    public static int Even(int n){
        if(n%2 == 0){
            return 1;
            // System.out.print("even");
        }
        else{
            return 0;
            // System.out.print("odd");
        }
     }
    
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();

        if(Even(n) == 1){
            System.out.print("even");
        }
        else{
            System.out.print("odd");
        }
    }
}
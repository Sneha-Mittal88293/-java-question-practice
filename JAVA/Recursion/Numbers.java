import java.util.*;

class Numbers{
    public static void count(int n){
        if(n == 0)
            return;
        
        System.out.println(n);
         count(n-1);
        
    }
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();

        count(n);
    }
}
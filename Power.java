import java.util.*;

public class Power{
    public static int calPower(int x , int n){
        if(x == 0){
            return 0;
        }
        if(n == 0){
            return 1;
        }
        int xpown = calPower(x , n-1);
        int xpow = x * xpown ;
        return xpow;
    }

    public static void main(String args[]){
    Scanner sc = new Scanner(System.in);
    
      int x = sc.nextInt();
      int n = sc.nextInt();
     // int x = 3 ; 
      //int n = 3;
      int ans = calPower(x ,n);
      System.out.print(ans);

}
}
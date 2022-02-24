import java.util.*;
public class Prime{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        
        int n = sc.nextInt();
        boolean isprime = true;
        for (int i =2; i<=n/2 ; i++ ){
            if(n%i == 0){
              isprime = false;
              break;
                
            }
            if(isprime)
            
        }
    }
}
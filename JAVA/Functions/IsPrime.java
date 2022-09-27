import java.util.*;

class IsPrime{
    public static void checkPrime(int n){
        boolean counter=true;
        for(int i = 2 ; i<=n/2 ; i++){
            if(n%i == 0 ){
                counter = false;
                break;
                }
            }
            if(counter){
                if(n==1){
                    System.out.print("neither prime nor composite");
                }
                else{
                    System.out.print("prime number");
                }
            }
            else{
                System.out.print(" not prime");
            }
        }
    
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        checkPrime(n);
    }
}
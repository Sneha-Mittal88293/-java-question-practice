import java.util.*;

class FindPower{
    public static void power(int x , int n){
        int mul=1;
        for(int i = 1 ; i<=n ; i++){
            mul = mul*x;
        }
        System.out.print(mul);
    }
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int x = sc.nextInt();
        int n = sc.nextInt();

        power( x , n);
    }
}
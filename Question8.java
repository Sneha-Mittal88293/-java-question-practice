import java.util.* ;
public class Question8{
    public static void power(int x , int n){
        int pow =1;
        for(int i = 1 ; i<= n ; i++){
            pow = pow*x;
        }
        System.out.print(pow);
    }
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);

        int x = sc.nextInt();
        int n  = sc.nextInt();

        power(x ,n);
    }
}
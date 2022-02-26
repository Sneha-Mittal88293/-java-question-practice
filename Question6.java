import java.util.* ;
public class Question6{
    public static void infinite(int n){
        do{
            System.out.print("hello");
            
        }while(n>0);
    }

    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        
        int n = sc.nextInt();
        infinite(n);
    }
}
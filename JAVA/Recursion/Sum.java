import java.util.*;

class Sum{
    
    public static void print(int n, int count ){
        
        if(n == 0){
            System.out.print(count);
            return;
        }
       
        count += n;
        print(n-1 , count);
        }
        
    
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        print(n , 0);
    }
}
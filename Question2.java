import java.util.* ;
public class Question2{
    
    public static void even(int n){
         int store = 0;
       
       for(int i = 1 ; i<= n ; i++){
            if ((i % 2) == 0)
              store = store + i;
        }
        System.out.print(store);
    
    }

    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        

          even(n);
        
    }
}
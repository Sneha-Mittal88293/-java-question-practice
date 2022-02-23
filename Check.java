import java.util.*;

public class Check{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);

        int button = sc.nextInt();
         switch(button) {
             case 1 : System.out.println("hello");
                      break;

             case 2 : System.out.println("namaste");
                       break;

             case 3 : System.out.println("bonjor");
                      break;          
             default : System.out.println("enter invalid button");
         }
    }
}
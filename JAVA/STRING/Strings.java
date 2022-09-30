import java.util.*;

class Strings{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);

        String name = "Hello World";
        System.out.print(name);

        String b = sc.next();  //take only one word
        System.out.print(b);  
        System.out.print("take another string");
          
        String c = sc.nextLine();   //take whole sentance
         System.out.print(c);

    }
}
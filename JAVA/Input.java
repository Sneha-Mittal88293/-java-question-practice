import java.util.*;

class Input{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        String name;
        // .next take only one word
         name = sc.next();
          System.out.println(name);
        // .nextline take whole sentence
         name = sc.nextLine();
           System.out.print(name);
    }
}
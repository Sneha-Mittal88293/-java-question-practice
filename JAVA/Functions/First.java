import java.util.*;



class First{

    public static void printName(String name){
        System.out.print(name);
        return;
     }


    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);

        String name = sc.next();
        printName(name);
    }

}
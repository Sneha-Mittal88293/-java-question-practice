import java.util.*;

class SaySomething{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        switch(a){
            case 1 :
               System.out.print("hyy");
               break;
            case 2: 
               System.out.print("hello");
               break;
            case 3:
                System.out.print("hii");
                break;
            default:
               System.out.print("Wrong input");
        }
    }
}
import java.util.*;

class CheckNumber{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();

        if(a==b){
           System.out.print("Equal");
        }
        else if(a>b){
           System.out.print("Greater");
        }
        else{
          System.out.print("lesser");
        }
    }
}
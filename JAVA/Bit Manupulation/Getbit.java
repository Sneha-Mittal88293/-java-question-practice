import java.util.*;

class Getbit{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
         int pos = sc.nextInt();
         int bit = 1<<pos;

         if((bit & num) == 0 ){
            System.out.print("bit was zero");
         }
         else{
            System.out.print("bit was 1");
         }
  }
}
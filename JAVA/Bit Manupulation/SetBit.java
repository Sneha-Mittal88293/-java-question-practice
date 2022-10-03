import java.util.*;

class SetBit{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
         int pos = sc.nextInt();
         int bit = 1<<pos;

         int final_num = (bit | num);
         System.out.print(final_num);
         
  }
}
import java.util.*;

class ClearBit{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
         int pos = sc.nextInt();
         int bit = 1<<pos;

         int final_num = (num & ~(bit));
         System.out.print(final_num);
         
  }
}
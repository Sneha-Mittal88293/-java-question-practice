import java.util.*;

class UpdateBit{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
         int pos = sc.nextInt();
         int oper = sc.nextInt();

         int bit = 1<<pos;
         int new_num;

         if(oper == 1){
              new_num = (bit | num);
            
         }
         else{
             new_num = (num & ~(bit));
            
         }
         System.out.print(new_num);
         
  }
}
import java.util.*;

class UserWant{
public static void main(String args[]){
    Scanner sc = new Scanner(System.in);

    int n = sc.nextInt();
    int positive = 0;
    int negative = 0 ;
    int zero = 0;


    for(int i=1 ; i<=n; i++){
     int num = sc.nextInt();

     if(num>0){
        positive++;
     }
     else if(num<0){
        negative++;

     }
     else{
        zero++;
     }
    }
    System.out.print("positive -  " +positive +" \nnegative -   "+ negative +"\nzero -   "+ zero);
}
}
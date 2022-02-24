import java.util.*;
public class Invertedhalfpyramid{
    public static void main(String args[]){
        Scanner sc =new Scanner(System.in);
       
       int n = sc.nextInt();
       int s=1;
      for ( int i=0 ; i<n ;i++){
          for(int j=0; j<i ; j++){
              System.out.print(s + " ");
                 s++;
          }
          System.out.print("\n");
      }
       

       
       


     }
}
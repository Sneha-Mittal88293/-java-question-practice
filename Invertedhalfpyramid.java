import java.util.*;
public class Invertedhalfpyramid{
    public static void main(String args[]){
        Scanner sc =new Scanner(System.in);
       
       int n = sc.nextInt();
       
       for(int i = 0 ; i<n ; i++){
           for(int j =n ; j>=i ; j--){
               System.out.print(" ");
           }
           for(int j = n ; j>0;j-- ){
               System.out.print("*");
           }
           System.out.print("\n");
       }

       
       


     }
}
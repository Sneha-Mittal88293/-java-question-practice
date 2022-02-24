import java.util.*;
 public class Markss{
     public static void main(String args[]){
         Scanner sc = new Scanner(System.in);
         int input; 
          int marks = sc.nextInt();

          do{
              if(marks<= 100 && marks>= 90){
               System.out.print("This is Good");
              }
              else if(marks<= 89 && marks >= 60){
               System.out.print("This is also Good");
              }
              else if(marks<= 59 && marks >= 0){
               System.out.print("This is good as well");
              } 
               else{
               System.out.print("invalid "); 
               }


            input = sc.nextInt();

        }while(input == 1);
     }
 }
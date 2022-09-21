import java.util.*;

class Menu{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int n ;

       
        do{
            int marks = sc.nextInt();
            if(marks>=90){
                System.out.println("this is good");
            }
            else if(marks<=89 && marks>=60){
                System.out.println("this is also good");
            }
            else if(marks<=59 && marks>=0){
               System.out.println("this is good as well");
            }
            else{
                System.out.println("Invalid");
            }

            System.out.println("Want to continue yes (1) or no (0)");
            n = sc.nextInt();
        }while(n==1);
    }
}
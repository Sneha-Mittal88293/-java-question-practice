import java.util.*;

class Vote{
    public static int eligible(int age){
        if(age>18){
            return 1;
        }
        else 
        return 0;
    }
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);

        int age = sc.nextInt();

        int find = eligible(age);
        if(find == 1){
            System.out.print("Eligible");
        }
        else{
            System.out.print("not Eligible");
        }
    }
}
import java.util.*;

class StackHeight{
    public static int cal(int x , int n){
       if(n == 0){
        return 1;
       }
        int calPow = cal(x , n-1);
        int calP = x * calPow;
        return calP;
       
    }
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);

        int x = sc.nextInt();
        int n = sc.nextInt();

        System.out.print(cal(x, n));
    }
}
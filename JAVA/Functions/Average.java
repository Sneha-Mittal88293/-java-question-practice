import java.util.*;

class Average{
    public static float printAverage(int a , int b , int c){
        float sum = (a+b+c)/3;
        return sum;
    }
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();

       System.out.print( printAverage( a , b , c));
    }
}
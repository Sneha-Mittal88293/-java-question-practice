import java.util.*;

class Circle{
    public static double circum(int r){
        return 2*3.14*r;
    }
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);

        int r = sc.nextInt();

        System.out.print(circum(r));
    }
}
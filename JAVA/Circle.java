import java.util.*;

class Circle{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        float radius = sc.nextFloat();

        double area = 3.14*radius*radius;
        double perimeter = 2*3.14*radius;

        System.out.println("area of a circle is " + area);
        System.out.print("perimeter of a circle is " + perimeter);
    }
}
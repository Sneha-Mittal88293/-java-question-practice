import java.util.* ;
public class Question4{
    public static void circumference(int radius){
        System.out.print(2*3.14*radius);
    }
public static void main(String args[]){
    Scanner sc = new Scanner(System.in);

     int radius = sc.nextInt();

     circumference(radius);

    
}

}
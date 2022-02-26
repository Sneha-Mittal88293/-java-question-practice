import java.util.* ;
public class Question5{
    public static int vote(int age){
        if(age>18)
        return 1;
        else 
        return 0;
    }
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);

        int age = sc.nextInt();

        int person = vote(age);
        if(person == 1)
        System.out.print("eligible");
        else
        System.out.print("not eligible");
    }
}
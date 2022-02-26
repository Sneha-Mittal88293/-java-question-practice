import java.util.* ;
public class Question7{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
         
        int input = sc.nextInt();
         int positive = 0 ; int negative = 0 ; int zeroes = 0;
        while(input == 1){
            System.out.print("enter your number: ");
            int number = sc.nextInt();
            if(number>0){
            positive++;}
            else if(number<0)
            negative++;
            else
            zeroes++;
        
        input = sc.nextInt();

    }
    System.out.println("positive"+ positive);
    System.out.println("negative"+ negative);
    System.out.println("zeroes"+ zeroes);
}
}
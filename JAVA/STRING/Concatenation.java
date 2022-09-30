import java.util.*;

class Concatenation{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);

        String first = sc.nextLine();
        String second = sc.nextLine();

        System.out.print(first+second);    //concatenation
        System.out.print(second.length());   //.length


     // .charAt(); use for print alphabet
        for(int i = 0 ; i<second.length() ; i++){
           System.out.print(second.charAt(i));
        }
        

        //comparise -- .compateTo()
        System.out.print(first.compareTo(second));


    }
}
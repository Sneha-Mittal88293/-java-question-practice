import java.util.*;

class PrintReverse{
    public static void printRev(String str , int idx){
        if(idx == 0){
            System.out.print(str.charAt(idx));
            return;
        }
        System.out.print(str.charAt(idx));
        printRev(str, idx-1);
        return;

    }
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        printRev(str ,str.length()-1);

        
    }
}
import java.util.*;

class Subseq{
    public static void subseque(String str , int idx , String newString){
        if(str.length() == idx){
            System.out.println(newString);
            return;
        }
        char currChar = str.charAt(idx);

        // to be
        subseque(str , idx+1 , newString+currChar);

        //not to be
        subseque(str , idx+1 , newString);
    }
    public static void main(String args[]){
       Scanner sc = new Scanner(System.in);
       String str = sc.nextLine();

       subseque(str , 0 , "");
    }
}
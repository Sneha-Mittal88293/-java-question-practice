
import java.util.*;

class Subseq{
    public static void subseque(String str , int idx , String newString ,HashSet<String> set ){
        if(str.length() == idx){
            if(set.contains(newString)){
                return ;
            }
            else{
                System.out.println(newString);
                set.add(newString);
                return;
            }
        }
        char currChar = str.charAt(idx);

        // to be
        subseque(str , idx+1 , newString+currChar ,set);

        //not to be
        subseque(str , idx+1 , newString , set);
    }
    public static void main(String args[]){
       Scanner sc = new Scanner(System.in);
       String str = sc.nextLine();
       HashSet<String> set  = new HashSet<>();

       subseque(str , 0 , "" , set);
    }
}
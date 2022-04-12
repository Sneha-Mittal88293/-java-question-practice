import java.util.*;
public class Duplicate{
    public static boolean [] map = new boolean[26];
    public static void removeDuplicates(String str , int idx , String newString){
        if(idx == str.length()){
            System.out.print(newString);
            return;
        }
        char currChar = str.charAt(idx);
        if(map[currChar - 'a'] == false){
            newString += currChar;
            map[currChar - 'a'] = true;
           removeDuplicates(str , idx +1, newString); 
        }
        else{
            removeDuplicates(str , idx +1, newString); 
        }
    }
public static void main(String args[]){
    String str = "jdiwnabbsesjaja";
    removeDuplicates(str ,0 ,"" );
}
}
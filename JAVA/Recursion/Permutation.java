import java.util.*;
class Permutation{
    public static void permutation(String str , String newString){
       if(str.length() == 0){
        System.out.println(newString);
        return;
       }
        for(int i = 0 ; i<str.length() ; i++){
            char currChar = str.charAt(i);
            String newStr = str.substring(0 , i) + str.substring(i+1);
         permutation(newStr, newString+currChar );
        }
    }
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        String str = sc.next();
        permutation(str, "");
    }
}
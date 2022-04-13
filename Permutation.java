import java.util.* ;
public class Permutation{
    public static void printPermu(String str , String permuta ){
    if(str.length() == 0){
        System.out.println(permuta);
        return;
    }
    for(int i =0 ; i<str.length() ; i++){
        char currChar = str.charAt(i);
        String newString = str.substring(0 , i) + str.substring(i+1);
        printPermu(newString , permuta+currChar);
    }
    }
    public static void main(String args[]){
        String str = "abc";
        printPermu(str ,"");
    }
}
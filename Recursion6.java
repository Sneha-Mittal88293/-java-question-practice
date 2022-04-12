import java.util.*;
public class Recursion6{
    public static void collelement(String str , int idx , int count , String newString){
        if(idx == str.length()){
            for(int i =0 ; i<count ; i++){
                newString += 'a';
            }
            System.out.print(newString);
            return;
        }
        char currChar = str.charAt(idx);
        if(currChar == 'a'){
            count++;
            collelement(str ,idx+1 , count , newString);
        }
        else{
            newString += currChar;
            collelement(str ,idx+1 , count , newString);
        }
    }
    public static void main(String args[]){
        String str= "ajiahduiwahaiahssgaaa";
        collelement(str , 0 , 0 , "");
    }
}
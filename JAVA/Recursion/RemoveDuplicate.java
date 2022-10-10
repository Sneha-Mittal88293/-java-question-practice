import java.util.*;

class RemoveDuplicate{
    public static boolean[] map = new boolean[26];
    
    public static void removeduplicate(String str , int idx ,String newString){
        if(str.length() == idx){
            System.out.print(newString);
            return;
        }

        char currChar = str.charAt(idx);
        if(map[currChar - 'a'] == true){
            removeduplicate(str , idx+1 , newString);
        }
        else{
            newString += currChar;
            map[currChar - 'a'] = true;
            removeduplicate(str , idx+1 , newString);
        }


    }
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        removeduplicate(str , 0 , "");

    }
}
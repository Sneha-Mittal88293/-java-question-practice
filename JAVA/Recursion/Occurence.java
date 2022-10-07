
import java.util.*;

class Occurence{
     public static int first = -1;
     public static int last = -1;
    public static void find(char choice ,String str , int idx){
        if(idx == str.length()){
            System.out.print(first +" " + last);
            return;
        }
        
        char currentChar = str.charAt(idx);
        if(choice == currentChar){
            if(first == -1){
                first = idx;
            }
            else{
                last = idx;
            }

        }
        find(choice , str , idx+1);
        }
    public static void main(String args[]){
    Scanner sc = new Scanner(System.in);
    String str = sc.nextLine();


    
    find('a' , str , 0);

  }
}
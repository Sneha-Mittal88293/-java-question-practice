import java.util.*;

class FindX{
    
    public static void move(String str , int idx , char element  , int count , String newString){
          if(idx == str.length()){
            for(int i = 0 ; i<count ; i++){
             newString += "a";
        }
        System.out.print(newString);
            return;
          }
        char currentChar = str.charAt(idx);
        if(currentChar == element){
           count++;
           move(str , idx+1 , element , count , newString);
        }
        else{
            newString += currentChar;
            move(str ,idx+1 , element , count , newString);
        }

        
       
    }
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        int count = 0;
        String newString = "";
        move(str , 0 ,'a' , count , newString);

    }
}
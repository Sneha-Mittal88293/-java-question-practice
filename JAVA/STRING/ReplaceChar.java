import java.util.*;

class ReplaceChar{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);

       
        String result = " ";

        String sb = sc.next();
        System.out.print("original string " + sb);

       for(int i = 0 ; i<sb.length() ; i++){
        if(sb.charAt(i) == 'e'){

           result += 'i';
        }
        else{
            result += sb.charAt(i);
        }
       }
    
       System.out.print(result);
        
    }
}
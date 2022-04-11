import java.util.* ;
public class Occurance{
    public static int  first = -1;
    public static int  last = -1;

    public static void findOccurance(String str , int idx , char key){
        if(idx == str.length()){
            System.out.println("first occurance  - " + first);
            System.out.println("last occurance- " + last);
            return;
        }
        char currchar = str.charAt(idx);
        if(currchar == key){
            if(first == -1)
            first = idx;
            else{
                last = idx;
            }
        }
        findOccurance(str ,idx +1 ,  key);

    }

    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        String str = "aanjdewifakodejaaajiea";
        findOccurance(str ,0 ,'a');
    }
}
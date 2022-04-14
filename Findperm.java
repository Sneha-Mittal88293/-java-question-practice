public class Findperm{
    public static void printperm(String str , String perm , int idx){
        if(str.length() == 0){
            System.out.println(perm);
            return;
        }
         for(int i = 0 ; i<str.length() ; i++){
             char currChar = str.charAt(i);
                String newstring = str.substring(0 , i)+str.substring(i+1);
                printperm(newstring , perm+currChar , idx+1);
         }
    }
    public static void main(String args[]){
        String str = "ABC";
        printperm(str , "" , 0);
    }
}
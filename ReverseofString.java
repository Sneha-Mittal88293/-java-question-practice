public class ReverseofString{
    public static void revstr(String str ,  int index){
        if(index == 0){
            System.out.print(str.charAt(index));
            return;
        }
         System.out.println(str.charAt(index));
         revstr(str , index-1);
    }

public static void main(String args[]){
    Scanner sc = new Scanner(System.in);
    String str= sc.nextLine();
    revstr( str , str.length()-1);
}
}
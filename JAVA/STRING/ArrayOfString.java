import java.util.*;

class ArrayOfString{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);

        int size = sc.nextInt();
        String []array = new String[size];
        
        int tot_length = 0;

        for(int i = 0 ; i<size ;i++){
            array[i] = sc.nextLine();
            tot_length = tot_length + array[i].length();
        }

        System.out.print(tot_length);

    }
}
import java.util.*;

class StrictlyIncreasing{
    public static boolean check(int arr[] , int idx){
       if(idx == arr.length-1){
        return true;
       }
       if(arr[idx] < arr[idx+1]){
        return check(arr , idx+1);
       }
       else{
        return false;
       }
    }
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int size = sc.nextInt();
        int [] arr = new int[size];
        for(int i =0 ; i<size ; i++){
            arr[i] = sc.nextInt();
        }

       System.out.print(check(arr , 0));
    }
}
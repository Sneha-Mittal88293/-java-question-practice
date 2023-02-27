import java.util.*;

class Basics{
    public static boolean Search(int arr[][] ,int key){
        for(int i = 0 ; i<arr.length ; i++){
            for(int j =0 ; j<arr[0].length ; j++){
                if(arr[i][j] == key){
                    System.out.print("found at" +i +" , "+j);
                    return true;
                }
            }
        }
        System.out.print("not found");
        return false;

    }
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int [][] arr = new int[3][2];

        for(int i = 0 ; i<3 ; i++){
            for(int j =0 ; j<2 ; j++){
                arr[i][j] = sc.nextInt();
            }
        }
        for(int i = 0 ; i<3 ; i++){
            for(int j =0 ; j<2 ; j++){
                System.out.print(arr[i][j] + " ");
            }
            System.out.println();
        }
        Search(arr ,11);

    }
}
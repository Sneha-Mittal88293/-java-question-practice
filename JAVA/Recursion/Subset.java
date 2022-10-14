import java.util.*;

class Subset{
    public static void printSet(ArrayList<Integer> subset){
        for(int  i = 0 ; i<subset.size(); i++){
            System.out.print(subset.get(i)+ " ");
        }
            System.out.println();
    }
    public static void printSubset(int n , ArrayList<Integer> subset){
        if(n == 0){
            printSet(subset);
            return;
        }
       // for add element
        subset.add(n);
        printSubset(n-1 , subset);
        // not add element
        subset.remove(subset.size() -1);
        printSubset(n-1 , subset); 
    }
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        ArrayList<Integer> subset = new ArrayList<>();
         printSubset( n , subset);
    }
}
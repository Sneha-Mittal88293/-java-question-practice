class Recursion3{
    public static void printnatural(int n ,int sum){
        if(n == 0){
            System.out.print(sum);
            return ;
        }
        sum = sum + n;  
        printnatural(n-1 , sum);
 }
     public static void main(String args[]){
     int n = 6 ;
     printnatural(n , 0);
        
    }

}
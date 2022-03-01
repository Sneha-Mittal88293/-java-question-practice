class Recursion4{
    public static void factorial(int n ,int fact ){
        if(n == 0){
         System.out.print(fact);
         return;
        }

        fact = fact * n;
         factorial(n-1 , fact);
    }
    public static void main(String args[]){
        int n = 5 ;
        factorial(n , 1); 
    }
}
class Recursion5{
    public static void printfabo( int a , int b , int n){
        if(n == 0){
            return;
        }

        System.out.println(a);
        printfabo(b , a+b , n-1);
    }
    public static void main(String args[]){
        int n = 6 ;
        int a = 0 ;
        int b = 1; 

        printfabo( a , b, n);
    }
}
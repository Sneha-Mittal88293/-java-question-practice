import java.util.*;

class InvitePeople{
    public static int callGuest(int n){
        if(n <= 1){
            return 1;
        }

        int way1 = callGuest(n-1);
        int way2 = (n-1) * callGuest(n-2);
        return way1 + way2;
    }
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        System.out.print(callGuest(n));

    }
}
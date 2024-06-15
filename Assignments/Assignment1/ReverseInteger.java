package Assignments.Assignment1;

public class ReverseInteger {
    public static void main(String[] args) {
        int num = -123 ;
        System.out.println(reverse(num));
    }
    public static int reverse(int x) {
        long ans = 0 ;
        while(x != 0){
            int n = x % 10 ;
            x = x / 10;
            ans = (ans * 10) + n ;
        }
        if(ans > Integer.MAX_VALUE || ans < Integer.MIN_VALUE){
            return 0;
        }
        return (int) ans ;

    }
}

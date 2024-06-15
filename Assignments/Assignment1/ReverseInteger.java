package Assignments.Assignment1;

public class ReverseInteger {
    public static void main(String[] args) {
        System.out.println(reverse(-123));
    }
    public static int reverse(int x) {
        long ans = 0 ;
        long flag = 0 ;
        if(x > 0){
            while(x > 0){
                flag = ans * 10 + (int)x % 10 ;
                if(flag < Integer.MAX_VALUE && flag > Integer.MIN_VALUE ){
                    ans = flag ;
                    x = x / 10 ;
                }else{
                    ans = 0;
                    break ;
                }
            }
        }else if ( x == 0){
            ans = x ;
        }else{
            long res = Math.abs(x) ;
            while(res > 0){
                flag = ans * 10 + (int)res % 10 ;
                if(flag < Integer.MAX_VALUE && flag > Integer.MIN_VALUE ){
                    ans = flag ;
                    res = res / 10 ;
                }else{
                    ans = 0;
                    break ;
                }
            }
            if(ans != 0)
                ans = -ans ;
        }
        return (int)ans ;
    }
}

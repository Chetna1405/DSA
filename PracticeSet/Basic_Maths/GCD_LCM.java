package PracticeSet.Basic_Maths;

import java.util.Arrays;

public class GCD_LCM {
    public static void main(String[] args) {
        Long A = 375L;
        Long B = 10000L ;
        Long[] ans = lcmAndGcd(A,B);
        // 0th index - > LCM
        // 1st index - > HCF
        System.out.println(Arrays.toString(ans));
    }
    public static Long[] lcmAndGcd(Long A , Long B) {
        // code here
        Long GCD = gcd(A , B);
        Long LCM = (A * B) / GCD ;
        Long[] arr = {LCM ,GCD} ;
        return arr;

    }
    public static Long gcd(Long a , Long b){
        Long res = 1L ;
        while(a != 0 && b != 0){
            if(a > b) a = a % b ;
            else if(b > a) b = b % a ;
        }
        if(a == 0) return b ;
        if(b == 0) return a ;
        return  res;
    }
}

package Assignments.Assignment1;
//Two integers n and k are given. Our task is to print K-rounding of n. K-rounding is the minimum positive integer X, such that x ends with k or more zeros and is divisible by n.
//        Examples :
//        Input :  n = 30, k = 3.
//        Output : 3000
//        3000 is the smallest number that
//        has at-least k 0s and is divisible
//        by n.
//
//        Input : n = 375, k = 4.
//        Output : 30000

public class divisibleByn__AndHasKZeroes {
    public static void main(String[] args) {
        int n = 30 ;
        int k = 3 ;
        System.out.println(lcm(n , k));
    }
    public static int lcm(int n ,int k){
        int num10 = (int)Math.pow(10 , k);
        int hcf = gcd(n , num10);
        return num10 * n / hcf ;
    }
    public static int gcd(int a , int b){
        if(a==b) return a ;
        while(a > 0 && b > 0){
            if( a > b) a = a % b ;
            else b = b % a ;

        }
        if(b == 0 ) return a ;
        if (a == 0) return b ;
        return 1 ;
    }
}

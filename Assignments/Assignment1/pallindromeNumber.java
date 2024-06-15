package Assignments.Assignment1;

public class pallindromeNumber {
    public static void main(String[] args) {
        System.out.println(isPalindrome(-121));
    }
    public static boolean isPalindrome(int x) {
        return check(x);
    }
    public static boolean check(int n){
        if(n < 0) return false ;
        int sum = 0 ;
        int x = n ;
        while(x > 0){
            sum= sum*10+(x % 10);
            x = x / 10 ;
        }
        return (sum == n) ;

    }
}

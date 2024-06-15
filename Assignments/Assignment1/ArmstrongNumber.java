package Assignments.Assignment1;

public class ArmstrongNumber {
    public static void main(String[] args) {
        int x = 153 ;
        System.out.println(armstrongNumber(x));
    }
    public static String armstrongNumber(int n){
        int x = n ;
        int sum = 0;

        while(x > 0 ){
            sum += (int)Math.pow((x % 10) , 3);
            x = x /10;
        }
        if(sum == n ){
            return "Yes";
        }
        return "No";
    }
}

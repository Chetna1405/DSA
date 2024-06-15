package Assignments.Assignment1;

public class coPrimeArray {
    public static void main(String[] args) {
        int n = 5 ;
        int[] arr = {1,2,3,4,5};
        System.out.println(countCoPrime(arr,n));
    }
    public static int countCoPrime(int arr[], int n)
    {
        // Complete the function
        int cnt = 0 ;
        for(int i = 0; i < n-1 ; i++){
            if((gcd(arr[i] , arr[i+1])) != 1){
                cnt ++ ;
            }
        }
        return cnt ;
    }
    public static int gcd(int a , int b){
        while(a > 0 && b > 0){
            if(a> b) a =  a%b ;
            else if( b > a ) b = b % a;
            else a = a % b ;
        }
        if(a == 0) return b;
        if( b == 0 ) return a ;
        return 1 ;
    }
}

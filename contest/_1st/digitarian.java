package contest._1st;

import java.util.Arrays;
import java.util.Scanner;
//32145 // 12543
public class digitarian {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt() ;
        int[] arr = new int[(int)Math.log10(n) + 1] ;
        int i = 1 ;
            while(n > 0 ){
                int x = n % 10 ;
                n = n / 10 ;
                arr[x-1] = i ;
                i++;
            }
            int ans = 0 ;
            for(int j = arr.length-1;j >= 0 ; j--){
                ans = (ans * 10 ) + arr[j] ;
            }
        System.out.println(ans);
    }
}

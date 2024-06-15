package PracticeSet.Arrays;
import java.util.* ;
//Array Reversal Algorithm
public class ReversalAlgorithm {
   public static void main(String[] args) {
        int[] arr ={1,2,3,4,5,6};
        int k = 3 ;
        reverse(arr,0, arr.length-1); // reverse whole array
        reverse(arr, 0 , k-1); // now reverse first k digits
        reverse(arr , k ,arr.length-1); // reverse left remaining digits
        System.out.println(Arrays.toString(arr));
    }

    public static void reverse(int[] arr , int p1 , int p2) {
        while(p1 < p2) {
            int temp = arr[p1];
            arr[p1] = arr[p2];
            arr[p2] = temp;
            p1++;
            p2--;
        }

    }
}

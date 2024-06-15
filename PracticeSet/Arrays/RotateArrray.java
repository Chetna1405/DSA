package PracticeSet.Arrays;

import java.util.Arrays;

public class RotateArrray {
    public static void main(String[] args) {
        int[] arr = {1,2,3,4,5,6};
        int k = 2 ;
        rotate(arr,k);
        System.out.println(Arrays.toString(arr));
    }
    public static void rotate(int[] nums, int k) {
        k = k % nums.length ;
        reverse(nums , 0 , nums.length -1);
        reverse(nums , 0 , k -1);
        reverse(nums ,k , nums.length -1);

    }
    public static void reverse(int[] arr ,int p1 , int p2){
        while(p1 < p2){
            int temp = arr[p1];
            arr[p1] = arr[p2];
            arr[p2] = temp ;
            p1++;
            p2--;
        }
    }
}

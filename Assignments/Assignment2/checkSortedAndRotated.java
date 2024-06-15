package Assignments.Assignment2;

import java.util.Arrays;

public class checkSortedAndRotated {
    public static void main(String[] args) {
        int[] arr = {3,4,5,1,2};
        System.out.println(check(arr));
    }
    public static boolean check(int[] nums) {
        if(nums.length == 1) return true ;
        int[] b = new int[nums.length] ;
        for(int i = 0; i < nums.length ; i++){
            b[i] = nums[i];
        }
        Arrays.sort(nums);
//        System.out.println(Arrays.toString(nums));
        return compare(nums,b) ? true : rotate(b,nums);
    }
    public static boolean rotate(int[]arr,int[] b){
        for(int i = 1 ; i <= arr.length  ; i++){
            // reverse(arr,0,i-1);
            //             System.out.println(Arrays.toString(arr));

            reverse(arr,1 ,arr.length-1);
//            System.out.println(Arrays.toString(arr));

            reverse(arr,0, arr.length-1);
//            System.out.println(Arrays.toString(arr));

//            System.out.println(Arrays.toString(arr));
            if(compare(arr,b)){
                return true ;
            }
        }
        if(compare(arr,b)){
            return true ;
        }

        return false ;
    }
    public static void reverse(int[] arr  ,int p1 , int p2){
        while(p1 < p2){
            int temp = arr[p1];
            arr[p1] = arr[p2];
            arr[p2] = temp ;
            p1++;
            p2--;
        }
    }
    public static boolean compare(int[] arr ,int[] brr){
        for(int i = 0 ; i < arr.length ; i++){
            // System.out.println(arr[i]+"  "+brr[i]);
            if(arr[i] != brr[i]){
                return false ;
            }
        }
        return true ;
    }
}

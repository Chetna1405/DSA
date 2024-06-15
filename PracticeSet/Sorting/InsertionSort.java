package PracticeSet.Sorting;

import java.util.Arrays;

public class InsertionSort {
    public static void main(String[] args) {
        int[] arr = {4,5,2,7,1};

        for(int i = 1 ;i < arr.length ; i++){
            int f = i ;
            while(f > 0 && arr[f] < arr[f-1]){
                int temp = arr[f];
                arr[f] = arr[f-1];
                arr[f-1]  =temp ;
                f--;
            }
        }
        System.out.println(Arrays.toString(arr));
    }
}

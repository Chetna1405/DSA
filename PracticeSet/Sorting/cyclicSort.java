package PracticeSet.Sorting;

import java.util.Arrays;

public class cyclicSort {
    public static void main(String[] args) {
        int[] arr = {6,1,5,4,2,3};
        for(int i = 0 ; i<arr.length ; i++) {
            while(arr[i] != i+1){
                int temp = arr[arr[i] -1 ];
                arr[arr[i] -1 ] =arr[i];
                arr[i] = temp;
            }
        }
        System.out.println(Arrays.toString(arr));

    }
}

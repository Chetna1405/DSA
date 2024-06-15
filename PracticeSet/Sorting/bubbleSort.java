package PracticeSet.Sorting;

import java.util.Arrays;

public class bubbleSort {
    public static void main(String[] args) {
        int[] arr = {4,3,6,1,2};
        for(int i = 0 ;i < arr.length - 1 ; i++){
            int p = i ;
            if(arr[p] > arr[p+1]) {
                while (p < arr.length && arr[p] > arr[p + 1]) {
                    int temp = arr[p];
                    arr[p] = arr[p + 1];
                    arr[p + 1] = temp;
                    System.out.println(arr[p]);
                    p++;
                }
                System.out.println(Arrays.toString(arr));
                i = -1;
            }
        }
        System.out.println(Arrays.toString(arr));
    }
}

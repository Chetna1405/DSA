package PracticeSet.Sorting;

import java.util.Arrays;

public class bubbleSort {
    public static void main(String[] args) {
        int[] arr = {4,3,6,1,9};
        for(int i = 0 ;i < arr.length - 1 ; i++){
            for(int j = i+1 ; j < arr.length ; j++){
                if(arr[j] < arr[i]){
                    int temp = arr[j] ;
                    arr[j] = arr[i] ;
                    arr[i] = temp ;
                 }
            }
        }
        System.out.println(Arrays.toString(arr));
    }
}

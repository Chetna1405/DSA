package Assignments.Assignment2;

import java.util.Arrays;
import java.util.Scanner;

public class RotateArray {
    public static void main(String[] args) {
        int[] arr = {1,2,3,4,5};
        int n = 5 ;
        int d = 2;
        d = d % n ;
        reverse(arr, 0 ,d-1);
        reverse(arr, d ,arr.length-1);
        reverse(arr,0,arr.length-1);
        System.out.println(Arrays.toString(arr));

    }

    public static void reverse(int[] arr , int p1 , int p2) {
        while(p1 < p2){
            int temp = arr[p1];
            arr[p1] = arr[p2];
            arr[p2] = temp ;
            p1++;
            p2--;
        }
    }
}

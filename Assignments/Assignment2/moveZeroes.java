package Assignments.Assignment2;

import java.util.Arrays;

public class moveZeroes {
    public static void main(String[] args) {
        int[] arr = {0,1,0,3,12};
        move(arr);
        System.out.println(Arrays.toString(arr));
    }

    public static void move(int[] arr) {
        int pos = 0;
        for(int i = 0 ; i < arr.length ; i++){
            if(arr[i] != 0){
                arr[pos] = arr[i];
                pos++;
            }
        }
        for(int i = pos ; i < arr.length ; i++){
            arr[i] = 0;
        }
    }
}

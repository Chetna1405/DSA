package PracticeSet.Arrays;

public class SecondLargestElement {
    public static void main(String[] args) {
        int[] arr = {0 , 2 , 1, 3, 4 , 9};
        int max = Integer.MIN_VALUE;
        int secondMax =  Integer.MIN_VALUE ;
        for(int i = 0 ; i < arr.length ; i++){
            if(arr[i] != max ) {           // for duplicates
                if (arr[i] > max) {
                    secondMax = max;
                    max = arr[i];
                }else if (arr[i] > secondMax) {
                    secondMax = arr[i];
                }
            }
        }
        System.out.println("First Maximum " +max);
        System.out.println("Second Maximum " +secondMax);
    }

}

package Assignments.Assignment2;

public class thirdMaximumNumber {
    public static void main(String[] args) {
        int[] arr = {1,2,-2147483648};
        System.out.println(find(arr));
    }
    public static int find(int[] arr){
        long first = Long.MIN_VALUE;
        long second = Long.MIN_VALUE;
        long third = Long.MIN_VALUE;
        for(int i = 0;  i< arr.length ; i++){
            if(arr[i] > first ){
                third = second;
                second = first ;
                first = arr[i];
            }else if(arr[i] < first && arr[i] > second ){
                third = second ;
                second = arr[i];
            }else if(arr[i] < second && arr[i] > third ){
                third = arr[i] ;
            }else if(arr[i] == third){
                third = arr[i] ;
            }
        }

        return  third != Long.MIN_VALUE ? (int)third : (int)first;
    }
}

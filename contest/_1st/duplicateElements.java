package contest._1st;

import java.util.*;

public class duplicateElements {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        for(int i= 0 ;i < n ; i++){
            arr[i] = sc.nextInt();
        }
        List<Integer> res = find(arr);
        for(int i = 0 ; i < res.size() ; i++){
            System.out.print(res.get(i)+" ");
        }
    }

    public static List<Integer> find(int[] arr) {
        List<Integer> ls = new ArrayList<>() ;
        for(int i = 0 ; i< arr.length ; i++){
            int idx = (Math.abs(arr[i]) - 1);
            if (arr[idx] < 0){
                ls.add(Math.abs(arr[i]));
            }else{
                arr[idx] *= -1 ;
            }
        }
        Collections.sort(ls);
        return ls;
    }
    //4 3 2 7 8 2 3 1
}

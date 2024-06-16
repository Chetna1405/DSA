package PracticeSet.GreedyAlgorithm;

import java.util.Arrays;

public class AssignCookies {
    public static void main(String[] args) {
        int[] g = {3,4,2,1,5};
        int[] s = {1,3,2,4,5};
        System.out.println(findContentChildren(g,s));
    }
    public static int findContentChildren(int[] g, int[] s) {
        Arrays.sort(g);
        Arrays.sort(s);
        int left = 0 ;
        int right = 0 ;
        int c = 0 ;

        while(left < g.length && right < s.length ){
            if(g[left] <= s[right]){
                c++;
                left++;
                right++;
            }else{
                right++;
            }
        }
        return c ;
    }
}

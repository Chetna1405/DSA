package PracticeSet.GreedyAlgorithm;

import java.util.Arrays;

public class AssignCookies {
    public static void main(String[] args) {
        int[] g = {3,4,2,1,5};
        int[] s = {1,1,1};
        System.out.println(findContentChildren(g,s));
    }
    public static int findContentChildren(int[] g, int[] s) {
        Arrays.sort(g);
        Arrays.sort(s);
        int left = 0 ;
        int right = 0 ;
        while(left < g.length && right < s.length ){
            if(g[left] <= s[right]) {
                left++;
            }
                right++;

        }
        return left ;
    }
}

package PracticeSet.Basic_Maths;
import java.util.* ;
public class pascalsTriangle {
    public static void main(String[] args) {
        int n = 5 ;
        System.out.println(generate(n));
    }
    public static List<List<Integer>> generate(int numRows) {
        return find(numRows);
    }
    public static List<List<Integer>> find(int num){
        List<List<Integer>> res = new ArrayList<>();
        List<Integer> ls ;
        for(int n = 0 ; n < num ; n++){
            ls = new ArrayList<>();
            int nCr = 1 ;
            for(int r = 0 ; r <= n ; r++){
                ls.add(nCr) ;
                nCr = ((n - r) * nCr ) / (r+1);
            }
            res.add(ls);
        }
        return res ;

    }
}

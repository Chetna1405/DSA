package Assignments.Assignment1;
import java.util.* ;

public class SumOfThree_1886A {
        public static void main(String[] args) {
            Scanner sc = new Scanner(System.in);
            int t = sc.nextInt();
            for (int i = 0; i < t; i++) {
                int n = sc.nextInt();
                if (n < 7) {
                    System.out.println("No");
                } else if ((n - 5) % 3 != 0  && (n - 5) != 4) {

                    System.out.println("Yes");
                    System.out.println("1 4 " + (n - 5));

                } else if ((n - 3) % 3 != 0 ) {
                    System.out.println("Yes");
                    System.out.println("1 2 " + (n - 3));

                } else {
                    System.out.println("No");
                }
            }
        }
}

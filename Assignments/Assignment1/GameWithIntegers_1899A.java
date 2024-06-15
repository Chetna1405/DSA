package Assignments.Assignment1;

import java.util.Scanner;

public class GameWithIntegers_1899A {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while(t > 0) {
            int num = sc.nextInt();
            if (num % 3 == 0) {
                System.out.println("Second");
            } else {
                System.out.println("First");
            }
            t--;
        }
    }
}

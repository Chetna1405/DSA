package Assignments.Assignment1;

import java.util.Scanner;

public class _4AWatermelon {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int x = sc.nextInt();
        if(x >= 4 && x % 2 == 0){
            System.out.println("Yes");
        }else{
            System.out.println("No");
        }
    }
}

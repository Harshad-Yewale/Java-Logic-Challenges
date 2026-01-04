package Phase_3_Recursion.level_1;

import java.util.Scanner;

public class Q5 {

    //Q)  Print sum of first n natural numbers recursively.

    public static void main(String[] args) {
        int num;

        try (Scanner sc = new Scanner(System.in)) {
            System.out.println("Enter a Number");
            num = sc.nextInt();

            if (num < 0) {
                System.out.println("Only positive numbers are allowed");
                return;
            }

            System.out.println("Total sum of first " + num + " Natural numbers : " + printSum(num));
        }
    }

    static int printSum(int n) {

        if (n == 0) {
            return n;
        }
        n += printSum(n - 1);
        return n;
    }
}

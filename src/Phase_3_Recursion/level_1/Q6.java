package Phase_3_Recursion.level_1;

import java.math.BigInteger;
import java.util.Scanner;

public class Q6 {

    //Q) Print factorial of a number recursively.

    public static void main(String[] args) {

        int num;

        try (Scanner sc = new Scanner(System.in)) {
            System.out.println("Enter a Number:");
            num = sc.nextInt();
            System.out.println("Factorial of " + num + " is: " + fact(num));
        }
    }

    static BigInteger fact(int n) {
        if (n == 0 || n == 1) {
            return BigInteger.ONE;
        }
        return BigInteger.valueOf(n).multiply(fact(n - 1));
    }
}

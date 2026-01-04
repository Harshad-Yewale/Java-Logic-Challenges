package Phase_3_Recursion.level_1;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Q4 {

    //Q) Print only odd numbers from 1 to n recursively.

    public static void main(String[] args) {
        int num;

        try (Scanner sc = new Scanner(System.in)) {

            System.out.println("Enter a Number");
            num = sc.nextInt();

            if (num <= 0) {
                System.out.println("Only positive non zero elements are allowed");
            }
            printOdd(num);

        } catch (InputMismatchException e) {
            System.out.println("Invalid input (Numbers Only)");
        }
    }

    static void printOdd(int n) {

        if (n == 1) {
            System.out.print(1);
            return;
        }

        printOdd(n - 1);
        if (n % 2 != 0) {
            System.out.print(n + " ");
        }
    }
}

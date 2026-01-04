package Phase_3_Recursion.level_1;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Q1 {

    //Q) Print numbers from 1 to n using recursion.

    public static void main(String[] args) {

        int num;

        try (Scanner sc = new Scanner(System.in)) {
            System.out.println("Enter a Number:");
            num = sc.nextInt();
            if (num <= 0) {
                System.out.println("Only Positive non zero numbers allowed!!");
                return;
            }
            printNum(num);
            System.out.print(".\n");
        } catch (InputMismatchException e) {
            System.out.println("Invalid Input (Numbers Only)");
        }
    }

    static void printNum(int n) {

        if (n == 1) {
            System.out.print(1);
            return;
        }
        printNum(n - 1);
        System.out.print(", " + n);
    }
}

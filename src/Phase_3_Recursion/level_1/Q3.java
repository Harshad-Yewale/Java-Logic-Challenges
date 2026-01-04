package Phase_3_Recursion.level_1;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Q3 {

    //Q3) Print only even numbers from 1 to n recursively.

    public static void main(String[] args) {

        int num;
        try (Scanner sc = new Scanner(System.in)) {
            System.out.println("Enter a Number:");
            num = sc.nextInt();
            if (num <= 1) {
                System.out.println("Only Positive numbers greater then 2  are allowed!!");
                return;
            }
            printEven(num);
        } catch (InputMismatchException e) {
            System.out.println("Invalid Input (Numbers Only)");
        }
    }

    static void printEven(int n) {

        if (n < 2) {
            return;
        }
        printEven(n - 1);
        if (n % 2 == 0) {
            System.out.print(n + " ");
        }

    }
}

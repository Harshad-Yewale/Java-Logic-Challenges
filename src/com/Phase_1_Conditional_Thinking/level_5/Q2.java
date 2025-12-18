package com.Phase_1_Conditional_Thinking.level_5;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Q2 {

    //Q) Take three numbers and check if they can form a Pythagorean triplet.

    public static void main(String[] args) {
        //declare variables
        int a, b, c;
        Scanner sc = new Scanner(System.in);

        try {
            //take user input
            System.out.print("value of A : ");
            int x = sc.nextInt();
            System.out.print("value of B : ");
            int y = sc.nextInt();
            System.out.print("value of C : ");
            int z = sc.nextInt();

            if (x >= y && x >= z) {
                c = x;
                a = y;
                b = z;
            } else if (y >= z) {
                c = y;
                a = x;
                b = z;
            } else {
                c = z;
                a = x;
                b = y;
            }

            if ((c * c) == ((a * a) + (b * b))) {
                System.out.println("this numbers forms pythagorean triplet ");
                System.out.printf("%d² = %d || %d² = %d || %d² = %d\n", a, (a * a), b, (b * b), c, (c * c));
                System.out.printf("%d + %d = %d\n", (a * a), (b * b), (a * a) + (b * b));
                System.out.printf(" %d == %d", (a * a) + (b * b), (c * c));
            } else {
                System.out.println("this numbers does not form pythagorean triplet ");
                System.out.printf("%d² = %d || %d² = %d || %d² = %d\n", a, (a * a), b, (b * b), c, (c * c));
                System.out.printf("%d + %d = %d\n", (a * a), (b * b), (a * a) + (b * b));
                System.out.printf("%d != %d", (a * a) + (b * b), (c * c));
            }
        }
        catch (InputMismatchException e){
            System.out.println("Enter valid inputs (only numbers allowed)");
        }
        finally {
            sc.close();
        }
    }
}

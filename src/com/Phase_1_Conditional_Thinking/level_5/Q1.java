package com.Phase_1_Conditional_Thinking.level_5;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Q1 {

    //Q) Take coordinates (x, y) and check if the point lies on the X-axis, Y-axis, or at the origin

    public static void main(String[] args) {
        //declare variables
        int x, y;
        Scanner sc = new Scanner(System.in);

        try {
            //taking user input
            System.out.print("X : ");
            x = sc.nextInt();
            System.out.print("Y : ");
            y = sc.nextInt();


            if (x == 0 && y == 0) {
                System.out.println("Point (" + x + " , " + y + ") lies on origin");
            } else if (x == 0) {
                System.out.println("Point (" + x + " , " + y + ")lies on Y-Axis");
            } else if (y == 0) {
                System.out.println("Point (" + x + " , " + y + ") lies on X-Axis");
            } else {
                System.out.println("Point (" + x + " , " + y + ") lies on neither Axis or on origin");
            }

        } catch (InputMismatchException e) {
            System.out.println("Enter valid input (Numbers only)");
        } finally {
            sc.close();
        }

    }
}

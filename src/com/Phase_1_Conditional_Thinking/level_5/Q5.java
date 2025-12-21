package com.Phase_1_Conditional_Thinking.level_5;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Q5 {
    // Q) Take three numbers and check if they are in arithmetic progression.

    public static void main(String[] args) {


        //declare variables
        int num1,num2,num3;
        Scanner sc =new Scanner(System.in);

        try {
            //taking user Inputs
            System.out.println("Num1 : ");
            num1 = sc.nextInt();
            System.out.println("Num2 : ");
            num2 = sc.nextInt();
            System.out.println("Num3 : ");
            num3 = sc.nextInt();

            int one_TwoDifference = num1 - num2;
            int two_ThreeDifference = num2 - num3;

            if (one_TwoDifference == two_ThreeDifference) {
                System.out.println("Numbers  are in arithmetic progression Stats : ");
                System.out.printf("""
                        First Number : %4d
                        Last Number : %5d
                        Difference : %6d
                        """, num1, num3, one_TwoDifference);
            } else {
                System.out.println("Numbers are not in arithmetic progression");
            }
        }
        catch (InputMismatchException e){
            System.out.println("invalid input (Enter numbers only)");
        }
        sc.close();
    }
}

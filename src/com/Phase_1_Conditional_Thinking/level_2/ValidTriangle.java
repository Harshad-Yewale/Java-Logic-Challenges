package com.Phase_1_Conditional_Thinking.level_2;

import java.util.InputMismatchException;
import java.util.Scanner;

public class ValidTriangle {

    public static void main(String[] args) {

        //initialize variables
        int side1,side2,side3;
        Scanner sc=new Scanner(System.in);

        try {
            //taking inputs
            System.out.print("plz enter the value of side-1: ");
            side1 = sc.nextInt();
            System.out.print("\nplz enter the value of side-2: ");
            side2 = sc.nextInt();
            System.out.print("\nplz enter the value of side-3: ");
            side3 = sc.nextInt();

            //checking conditions
            if ((side1 + side2) > side3 && (side1 + side3) > side2 && (side2 + side3) > side1) {
                System.out.printf("%d %d %d forms a valid triangle", side1, side2, side3);
            } else {
                System.out.printf("%d %d %d does not form a valid triangle", side1, side2, side3);
            }
        }
        //handling exceptions
        catch (InputMismatchException e){
            System.out.println("plz enter the valid input");
        }
        sc.close();
    }
}

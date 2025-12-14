package com.Phase_1_Conditional_Thinking.level_3;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Q9 {

    //Q) Take two angles of a triangle and compute the third angle.
    public static void main(String[] args) {

        //declare variables
        int ang1, ang2, ang3;
        Scanner sc = new Scanner(System.in);

        try {
            //taking user input
            System.out.print("Enter angle 1 : ");
            ang1 = sc.nextInt();
            System.out.print("Enter angle 2 : ");
            ang2 = sc.nextInt();

            if (ang1 <= 0 || ang2 <= 0) {
                System.out.println("angles can not be zero or negative");
            } else if (ang1 + ang2 >= 180) {
                System.out.printf("Can not form a triangle because sum of  %d° and %d° is already greater then 180°", ang1, ang2);
            } else {
                ang3 = 180 - (ang1 + ang2);
                System.out.printf("the third angle will be : %d°\n", ang3);
                System.out.printf("%d° + %d° + %d°= %d°", ang1, ang2, ang3, (ang1 + ang2 + ang3));
            }
        } catch (InputMismatchException e) {
            System.out.println("plz enter a valid input (numbers only)");
        }
    }
}

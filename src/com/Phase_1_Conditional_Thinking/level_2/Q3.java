package com.Phase_1_Conditional_Thinking.level_2;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Q3 {

    //Q) take marks 1 to 100 and print the corresponding grade (A/B/C/D/F).

    public static void main(String[] args) {
        //declaring the variables
        int marks;
        Scanner sc = new Scanner(System.in);

        try {
            //taking input from the users
            System.out.println("plz enter the marks of the student: ");
            marks = sc.nextInt();

            //checking conditions
            if (marks >= 0 && marks < 30) {
                System.out.println("you are failed");
            } else if (marks >= 30 && marks < 60) {
                System.out.println("your grade is D");
            } else if (marks >= 60 && marks < 75) {
                System.out.println("your grade is C");
            } else if (marks >= 75 && marks < 85) {
                System.out.println("your grade is B");
            } else if (marks >= 85 && marks < 100) {
                System.out.println("your grade is A");
            } else {
                System.out.println("Marks can not be more then 100 or less then 0");
            }
        }
        //handling exceptions
        catch (InputMismatchException e) {
            System.out.println("Plz enter valid marks (numbers only)");
        }
        sc.close();
    }
}

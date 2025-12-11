package com.Phase_1_Conditional_Thinking.level_2;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Q4 {

    //Q)check if one of two given numbers is a multiple of the other

    public static void main(String[] args) {
        //declare variables
        int num1, num2;
        Scanner sc = new Scanner(System.in);

        try {
            //take user input
            System.out.println("number 1:");
            num1 = sc.nextInt();
            System.out.println("number 2:");
            num2 = sc.nextInt();


            //check conditions
            if (num1 % num2 == 0 || num2 % num1 == 0) {
                System.out.println(num1 + " is multiple of  " + num2);
            } else {
                System.out.println(num1 + " is not the  multiple of  " + num2);
            }
        }
        //handel exceptions
        catch (InputMismatchException e) {
            System.out.println("Plz enter valid input  (numbers only)");
        }
    }
}

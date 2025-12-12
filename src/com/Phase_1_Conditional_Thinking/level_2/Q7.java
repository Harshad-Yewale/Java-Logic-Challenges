package com.Phase_1_Conditional_Thinking.level_2;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Q7 {

    //Q) Take two numbers and determine whether both are even, both are odd, or one is even and one is odd.

    public static void main(String[] args){
        //declare variables
        int num1,num2;
        Scanner sc=new Scanner(System.in);

        try {
            //take user input
            System.out.println("number 1: ");
            num1 = sc.nextInt();
            System.out.println("number 2: ");
            num2 = sc.nextInt();

            //check conditions
            if (num1 % 2 == 0 && num2 % 2 == 0) {
                System.out.println(num1 + " and " + num2 + " both are even numbers");
            } else if (num1 % 2 == 0) {
                System.out.println(num1 + " is the only even number of the two given");
            } else if (num2 % 2 == 0) {
                System.out.println(num2 + " is the only even number of the two given");
            } else {
                System.out.println(num1 + " and " + num2 + " both are odd numbers");
            }
        }
        catch (InputMismatchException e){
            System.out.println("plz enter valid input (numbers only)");
        }
    }
}

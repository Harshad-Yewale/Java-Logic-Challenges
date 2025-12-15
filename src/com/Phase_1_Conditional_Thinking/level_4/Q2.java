package com.Phase_1_Conditional_Thinking.level_4;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Q2 {

    //Q) Take a number and print “Fizz” if divisible by 3, “Buzz” if divisible by 5, and “FizzBuzz” if divisible by both.
    public static void main(String[] args) {
        //declare variables
        int number;
        Scanner sc = new Scanner(System.in);

        try {
            //take input
            System.out.println("plz enter a number :");
            number = sc.nextInt();

            if (number % 3 == 0 && number % 5 == 0) {
                System.out.println("FizzBuzz (Divisible by 3 and 5)");
            } else if (number % 3 == 0) {
                System.out.println("Fizz (Divisible by 3 only)");
            } else if (number % 5 == 0) {
                System.out.println("Buzz (Divisible by 5 only)");
            } else {
                System.out.println(number + " is not divisible by 3 nor 5");
            }
        } catch (InputMismatchException e) {
            System.out.println("plz enter valid input (numbers only)");
        }
        sc.close();
    }
}

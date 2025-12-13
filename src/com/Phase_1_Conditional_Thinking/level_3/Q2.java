package com.Phase_1_Conditional_Thinking.level_3;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Q2 {

    //Q) Take a 3-digit number and determine if the middle digit is the largest, smallest, or neither.

    public static void main(String[] args){
         //declare variables
         int number;
        Scanner sc =new Scanner(System.in);

        try {
            //take user inputs
            System.out.println("Enter a three digit number only: ");
            number = Math.abs(sc.nextInt());
            if (number >= 100 && number <= 999) {
                int unit = number % 10;
                int tens = (number / 10) % 10;
                int hundreds = (number / 100) % 10;

                int largest=Math.max(tens,Math.max(hundreds,unit));
                int smallest=Math.min(tens,Math.min(hundreds,unit));

                if (tens == largest) {
                    System.out.println("the middle digit is the LARGEST of all three digits");
                }
                else if (tens == smallest) {
                    System.out.println("the middle digit is the SMALLEST of all three digits");
                }
                else {
                    System.out.println("the middle digit is neither largest nor smallest of all three");
                }
                System.out.printf("Digits: %d %d %d \n",hundreds,tens,unit);
            }
            else {
                System.out.println("Only three digit numbers are allowed");
            }
        }
        catch (InputMismatchException e){
            System.out.println("plz enter a number only");
        }
    }
}

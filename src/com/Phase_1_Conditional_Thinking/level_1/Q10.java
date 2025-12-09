package com.Phase_1_Conditional_Thinking.level_1;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Q10 {

    // Q)  Take a character and check whether it’s uppercase, lowercase, a digit, or a special character

    public static void main(String[] args){

        //declare the variables
        char c;
        Scanner sc=new Scanner(System.in);

        try {
            //take input from the user
            System.out.println("plz enter your character:");
            String input = sc.next();

            if (input.trim().length() == 1) {
                c = input.charAt(0);
                if ( Character.isUpperCase(c)) {
                    System.out.println(c + " is a uppercase letter!");
                } else if (Character.isLowerCase(c)) {
                    System.out.println(c + " is a lowercase letter!");
                } else if (Character.isDigit(c)) {
                    System.out.println(c + " is a Digit!");
                } else {
                    System.out.println(c + " is a special character!");
                }
            }
            else{
                System.out.println("there should be only one character in input(excluding space)");
            }
        }
        //handling exceptions -> rare chances of exception occurance but still for the sake of practice
        catch (InputMismatchException e){
            System.out.println("plz enter a valid single character");
        }
    }
}

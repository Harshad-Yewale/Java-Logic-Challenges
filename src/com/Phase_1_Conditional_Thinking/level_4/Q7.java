package com.Phase_1_Conditional_Thinking.level_4;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Q7 {

    //Q)  Take a single digit (0–9) and print its word form (“Zero” to “Nine”).

    public static void main(String[] args){

        //declare variables
        int digit;
        Scanner sc=new Scanner(System.in);

        try {
            //take input
            System.out.print("Enter a digit (0-9) : ");
            digit = sc.nextInt();


                switch (digit){
                    case 0-> System.out.println("Number Entered: Zero");
                    case 1-> System.out.println("Number Entered: One");
                    case 2-> System.out.println("Number Entered: Two");
                    case 3-> System.out.println("Number Entered: Three");
                    case 4-> System.out.println("Number Entered: Four");
                    case 5-> System.out.println("Number Entered: Five");
                    case 6-> System.out.println("Number Entered: Six");
                    case 7-> System.out.println("Number Entered: Seven");
                    case 8-> System.out.println("Number Entered: Eight");
                    case 9-> System.out.println("Number Entered: Nine");
                    default -> System.out.println("Number must be in between 0-9");
                }

        }
        catch (InputMismatchException e){
            System.out.println("invalid input (numbers only)");
        }
        finally {
            sc.close();
        }
    }
}

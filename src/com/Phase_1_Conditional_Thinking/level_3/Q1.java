package com.Phase_1_Conditional_Thinking.level_3;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Q1 {

    // Q) Take a 3-digit number and check if all digits are distinct.

    public static void main(String[] args){

        //declare the variables
        int number;
        Scanner sc=new Scanner(System.in);

        try {
            //taking the user input
            System.out.println("enter three digit number:");
            number=Math.abs(sc.nextInt());

            if (number>=100 && number<=999) {
                int unit=number%10;
                int tens=(number/10)%10;
                int hundreds=(number/100)%10;

                if(unit != tens && tens != hundreds && unit != hundreds){
                    System.out.println("All the digits are distinct");
                }
                else{
                    System.out.println("All the digits are NOT distinct");
                }
                System.out.printf("Digits : %d %d %d \n",hundreds,tens,unit);

            }
            else{
                System.out.println("Only 3 digit numbers are allowed");
            }
        }
        catch (InputMismatchException e){
            System.out.println("plz enter numbers only !!");
        }
        sc.close();

    }
}

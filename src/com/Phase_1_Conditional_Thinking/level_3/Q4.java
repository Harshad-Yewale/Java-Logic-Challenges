package com.Phase_1_Conditional_Thinking.level_3;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Q4 {
    // Q) Check whether a given integer is single-digit, double-digit, or multi-digit.

    public static void main(String[] args){
        // declare variable
        int number ,counter=0;
        Scanner sc =new Scanner(System.in);

        //take user input
        try {
            System.out.println("plz enter a number:");
            number = Math.abs(sc.nextInt());

            if(number==0) {
                counter = 1;
            }
            while (number > 0) {
                number = number / 10;
                counter++;

            }
            if(counter==1){
                System.out.println("the number is single digit");
            }
            else if(counter==2){
                System.out.println("the number is double digit");
            }
            else {
                System.out.println("the number is multi-digit");
                System.out.println("the number has " + counter + " digits");
            }
        }
        catch (InputMismatchException e){
            System.out.println("enter numbers only!!");
        }
        sc.close();
    }

}

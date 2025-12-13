package com.Phase_1_Conditional_Thinking.level_3;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Q5 {

    //Q) Check if a number is a multiple of 7 or ends with 7

    public static void main(String[] args){
        // declare variable
        int number;
        Scanner sc =new Scanner(System.in);

        //take user input
        try {
            System.out.println("plz enter a number:");
            number = Math.abs(sc.nextInt());

            int lastDigit=number%10;

            if(number==0){
                System.out.println("the number is 0 and it is also divisible by 7");
            }
            else if(number%7==0 && lastDigit==7){
                System.out.println("the number is divisible by 7 and last digit is also 7");
            }
            else if(number%7==0){
                System.out.println("the number is divisible by 7");
            }
            else if(lastDigit==7){
                System.out.println("Last digit of the number is 7");

            }
            else {
                System.out.println("the number is not divisible by 7 nor has the last digit 7");
                System.out.println("the number has last digit:" + lastDigit);
            }
        }
        catch (InputMismatchException e){
            System.out.println("enter numbers only!!");
        }
        sc.close();
    }
}

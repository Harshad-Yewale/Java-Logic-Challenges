package com.Phase_1_Conditional_Thinking.level_1;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Q2 {

    // Q)Check if a number is even or odd.

    public static void main(String[] args){

        //declare variable and scanner
        int num;
        Scanner sc=new Scanner(System.in);

        //take inputs
        try {
            System.out.println("plz enter the number: ");
            num = sc.nextInt();

            if (num % 2 == 0) {
                System.out.println(num+" is positive");
            } else {
                System.out.println(num+" is negative");
            }
        }
        catch (InputMismatchException e){
            System.out.println("plz enter the valid number only");
        }

        sc.close();
    }

}


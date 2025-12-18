package com.Phase_1_Conditional_Thinking.level_4;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Q8 {
    //Q) Take a weekday number (1–7) and determine if it is a weekday or weekend.

    public static void main(String[] args) {
        int day;
        Scanner sc = new Scanner(System.in);

        try {
            //take input
            System.out.print("Enter a day (1-7) : ");
            day = sc.nextInt();

            if(day>=1 && day<=5){
                System.out.println("Weekday");
            }
            else if(day>5 && day<=7){
                System.out.println("Weekend");
            }
            else {
                System.out.println("invalid day plz enter in range 1-7");
            }

        } catch (
                InputMismatchException e) {
            System.out.println("invalid input (numbers only)");
        }finally {
            sc.close();
        }
    }
}


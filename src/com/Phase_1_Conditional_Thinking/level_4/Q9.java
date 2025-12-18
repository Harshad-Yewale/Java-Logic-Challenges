package com.Phase_1_Conditional_Thinking.level_4;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Q9 {

    //Q) Take electricity units consumed and calculate the bill as per slabs (using if-else).

    public static void main(String[] args){

        //declare variables
        int units;
        int bill=0;
        Scanner sc=new Scanner(System.in);

        try {
            //take input
            System.out.println("plz enter the units in KWH");
            units = sc.nextInt();

            if (units >= 0) {
                if (units > 0 && units <= 100) bill = units * 2;
                else if (units > 100 && units <= 300) bill = units * 5;
                else if (units > 300 && units <= 500) bill = units * 7;
                else if (units > 500) bill = units * 10;

                System.out.println("Your Usage : " + units + "KWH || Your Bill : ₹" + bill);
            } else {
                System.out.println("units can't be less then 0");
            }
        }catch (
                InputMismatchException e) {
            System.out.println("invalid input (numbers only)");
        }finally {
            sc.close();
        }


    }
}

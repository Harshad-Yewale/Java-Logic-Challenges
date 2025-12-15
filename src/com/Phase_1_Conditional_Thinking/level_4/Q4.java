package com.Phase_1_Conditional_Thinking.level_4;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Q4 {

    //Q)Take 24-hour time (hours and minutes) and print whether it is AM or PM

    public static void main(String[] args) {

        //declare the variable
        int hrs, mnts;
        Scanner sc = new Scanner(System.in);

        try {
            //take inputs
            System.out.println("plz enter your hours:");
            hrs = sc.nextInt();
            System.out.println("plz enter your minutes:");
            mnts = sc.nextInt();

            if (hrs < 0 || hrs >= 24 || mnts < 0 || mnts > 59) {
                System.out.println("invalid time plz enter correct time (0 -  23)hrs (0 - 59)minutes");
            } else {
                String isAM = (hrs < 12) ? "AM" : "PM";
                System.out.printf("Time : %02d:%02d %s\n", hrs, mnts, isAM);
            }
        } catch (InputMismatchException e) {
            System.out.println("plz enter a valid input (numbers only)");
        }
        sc.close();
    }
}

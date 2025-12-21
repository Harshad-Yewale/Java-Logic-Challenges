package com.Phase_1_Conditional_Thinking.level_5;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Q10 {

    //Q) Take a year and print the corresponding century (e.g., “19th century”, “20th century”)
    public static void main(String[] args) {
        //declare variable
        int year,century=1;
        Scanner sc =new Scanner(System.in);

        try {
            //user input
            System.out.println("Enter Year");
            year = sc.nextInt();

            if (year > 0) {
                century = (year - 1) / 100 + 1;

                String suffix;
                if (century % 100 >= 11 && century % 100 <= 13) {
                    suffix = "th";
                } else {
                    switch (century % 10) {
                        case 1: suffix = "st"; break;
                        case 2: suffix = "nd"; break;
                        case 3: suffix = "rd"; break;
                        default: suffix = "th";
                    }
                }


                System.out.printf("Year : %d || Century : %d%s", year, century,suffix);
            } else {
                System.out.printf("Year : %d is not a valid year",year);
            }
        }
        catch (InputMismatchException e){
            System.out.println("Invalid input pla enter numbers only");
        }
    }
}

package Phase_1_Conditional_Thinking.level_2;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Q10 {

    //Q)  Take a month number (1–12) and print the number of days in that month (ignore leap years)

    public static void main(String[] args) {
        //declare variables
        int month;
        Scanner sc = new Scanner(System.in);

        try {
            //take inputs
            System.out.println("Enter the number of the month you want to know");
            month = sc.nextInt();

            System.out.println(getDaysOfTheMonth(month));
        } catch (InputMismatchException e) {
            System.out.println("Enter numbers only!!");
        }
    }

    static String getDaysOfTheMonth(int month) {

        return switch (month) {
            case 1 -> "Month: January days=31";
            case 2 -> "Month: February days=28";
            case 3 -> "Month: March days=31";
            case 4 -> "Month: April days=30";
            case 5 -> "Month: May days=31";
            case 6 -> "Month: June days=30";
            case 7 -> "Month: July days=31";
            case 8 -> "Month: August days=31";
            case 9 -> "Month: September days=30";
            case 10 -> "Month: October days=31";
            case 11 -> "Month: November days=30";
            case 12 -> "Month: December days=31";
            default -> "Invalid number choose between 1-12";
        };
    }
}

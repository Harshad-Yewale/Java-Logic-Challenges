package Phase_1_Conditional_Thinking.level_3;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Q3 {
    //Q) Take a 4-digit number and check if the first and last digits are equal.
    public static void main(String[] args){
        //declare variables
        int number;
        Scanner sc =new Scanner(System.in);

        try {
            //take user inputs
            System.out.println("Enter a four digit number only: ");
            number = Math.abs(sc.nextInt());
            if (number >= 1000 && number <= 9999) {
                int unit = number % 10;
                int thousands = (number / 1000) % 10;

                if (unit == thousands) {
                    System.out.println("the first and last digits are equal");
                }

                else {
                    System.out.println("the first and last digits are NOT equal");
                }
                System.out.printf("Digits: First: %d Last: %d \n",thousands,unit);
            }
            else {
                System.out.println("Only 4 digit numbers are allowed");
            }
        }
        catch (InputMismatchException e){
            System.out.println("plz enter a number only");
        }
        sc.close();
    }
}

package Phase_1_Conditional_Thinking.level_5;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Q8 {

    //Q) Take an integer (1–9999) and check if the sum of its digits is greater than the product of its digits.

    public static void main(String[] args) {
        //declare variables
        int num, units, tens, hundreds, thousands, sum, product;

        try {
            Scanner sc = new Scanner(System.in);
            //take user inputs
            System.out.print("plz enter a valid 4 digit number : ");
            num = sc.nextInt();

            if (String.valueOf(Math.abs(num)).length() == 4) {
                units = num % 10;
                tens = (num / 10) % 10;
                hundreds = (num / 100) % 10;
                thousands = (num / 1000) % 10;

                System.out.printf("units: %d\ttens: %d\thundreds: %d\tthousands: %d\n", units, tens, hundreds, thousands);

                sum = units + tens + hundreds + thousands;
                product = units * tens * hundreds * thousands;

                System.out.printf("Sum : %d+%d+%d+%d = %d\n", units, tens, hundreds, thousands, sum);
                System.out.printf("Product : %d*%d*%d*%d = %d\n", units, tens, hundreds, thousands, product);
                if (sum == product) {
                    System.out.printf("%d == %d\n", sum, product);
                } else {
                    System.out.printf("%d != %d\n", sum, product);

                }
            } else {
                System.out.println("invalid number plz enter only 4-digits number");
            }
        } catch (InputMismatchException e) {
            System.out.println("Invalid Input plz enter numbers only");
        }

    }
}

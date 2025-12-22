package Phase_2_LOOPING_And_PATTERNS.level_1;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Q10 {

    //Q) Print the product of digits of a given number.

    public static void main(String[] args) {
        //declare variable
        int num, product = 1;

        try (Scanner sc = new Scanner(System.in)) {

            System.out.println("Enter a number: ");
            num = sc.nextInt();

            //handle 0
            if (num == 0) {
                System.out.println("0 = 0");
                return;
            }


            //product of digits
            while (num > 0) {
                int digit = num % 10;
                if (num > 9) {
                    System.out.print(digit + " * ");
                } else {
                    System.out.print(digit + " = ");
                }
                product *= digit;
                num = num / 10;
            }
            System.out.println(product);

        } catch (InputMismatchException e) {
            System.out.println("Error Occurred : " + e.getMessage());
        }
    }
}

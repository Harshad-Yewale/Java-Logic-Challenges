package Phase_2_LOOPING_And_PATTERNS.level_1;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Q9 {
    //Q) Print the factorial of a given number.

    static int factorial(int num) {
        int fact = 1;
        if (num == 0) {
            System.out.println(" 0! = 1");
            return 1;
        } else {
            //return num*factorial(num-1);
            for (int i = num; i > 0; i--) {
                System.out.print(i);
                if (i != 1) {
                    System.out.print(" x ");
                } else {
                    System.out.print(" = ");
                }
                fact *= i;

            }
            return fact;
        }
    }

    public static void main(String[] args) {
        //declare variable
        int num;

        try (Scanner sc = new Scanner(System.in)) {

            System.out.println("Enter a number");
            num = sc.nextInt();

            if (num >= 0) {
                System.out.println(factorial(num));
            } else {
                System.out.println("number can't be negative");
            }

        } catch (InputMismatchException e) {
            System.out.println("Error occurred : " + e.getMessage());
        }
    }
}

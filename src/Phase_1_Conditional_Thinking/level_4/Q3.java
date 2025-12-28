package Phase_1_Conditional_Thinking.level_4;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Q3 {
    //Q) Take three numbers and print the median value (neither maximum nor minimum).
    public static void main(String[] args) {

        //declare variable
        int num1, num2, num3;
        Scanner sc = new Scanner(System.in);

        /*
        {
           small approach
           int min=Math.min(num1,Math.min(num2,num3));
           int max=Math.max(num1,Math.max(num2,num3));
            int median = num1+num2+num3-max-min;
            System.out.println(median);
        }
        */

        try {
            //taking inputs
            System.out.println("Number 1 :");
            num1 = sc.nextInt();
            System.out.println("Number 2 :");
            num2 = sc.nextInt();
            System.out.println("Number 3 :");
            num3 = sc.nextInt();

            if (num1 == num2 || num2 == num3 || num1 == num3) {
                System.out.println("can not find median value because all three or  2 of the 3 numbers are equal");
            } else if (num1 > num2 && num1 < num3 || num1 < num2 && num1 > num3) {
                System.out.println(num1 + " is the median value");
            } else if (num2 > num1 && num2 < num3 || num2 < num1 && num2 > num3) {
                System.out.println(num2 + " is the median value");
            } else if (num3 > num1 && num3 < num2 || num3 < num1 && num3 > num2  ) {
                System.out.println(num3 + " is the median value");
            }
            System.out.printf("Entered numbers: %d , %d , %d \n", num1, num2, num3);

        } catch (InputMismatchException e) {
            System.out.println("Plz enter valid inputs (numbers only)");
        }
        sc.close();
    }
}

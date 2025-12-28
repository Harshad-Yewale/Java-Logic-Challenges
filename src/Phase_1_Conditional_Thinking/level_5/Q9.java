package Phase_1_Conditional_Thinking.level_5;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Q9 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        try {
            // First date
            System.out.print("Enter first date (day month): ");
            int d1 = sc.nextInt();
            int m1 = sc.nextInt();

            // Second date
            System.out.print("Enter second date (day month): ");
            int d2 = sc.nextInt();
            int m2 = sc.nextInt();

            // Compare dates

            if (m1 < m2) {
                System.out.println("First date comes earlier");
            } else if (m1 > m2) {
                System.out.println("Second date comes earlier");
            } else { // same month
                if (d1 < d2) {
                    System.out.println("First date comes earlier");
                } else if (d1 > d2) {
                    System.out.println("Second date comes earlier");
                } else {
                    System.out.println("Both dates are the same");
                }
            }
        }
        catch (InputMismatchException e){
            System.out.println("invalid input plz enter numbers only");
        }
    }
}

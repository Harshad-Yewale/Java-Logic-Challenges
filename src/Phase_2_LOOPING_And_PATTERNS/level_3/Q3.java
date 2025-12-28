package Phase_2_LOOPING_And_PATTERNS.level_3;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Q3 {

    //Q) Print all numbers between a and b divisible by 7.

    public static void main(String[] args) {
        int start, end;

        try (Scanner sc = new Scanner(System.in)) {

            System.out.print("Enter your starting number of the range: ");
            start = sc.nextInt();

            System.out.print("Enter your Ending number of the range :");
            end = sc.nextInt();

            System.out.printf("\nNumbers between %d and %d divisible by 7 are:\n", start, end);
            for (int i = start; i <= end; i++) {
                if (i % 7 == 0) {
                    System.out.print(i + " ");
                }
            }
        }
        catch (InputMismatchException e){
            System.out.println("Invalid Input Enter Numbers only");
        }
    }

}

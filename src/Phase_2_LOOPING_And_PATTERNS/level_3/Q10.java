package Phase_2_LOOPING_And_PATTERNS.level_3;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Q10 {

    public static void main(String[] args) {
        //declare variables
        int num, ratio, firstTerm = 1;

        try (Scanner sc = new Scanner(System.in)) {

            System.out.println("Enter Your Number of terms :");
            num = sc.nextInt();

            System.out.println("Enter the ratio :");
            ratio = Math.abs(sc.nextInt());

            System.out.printf("Geometric Progression (a=%d, r=%d) for %d terms:\n", firstTerm, ratio, num);
            int term = firstTerm;
            for (int i = 1; i <= num; i++) {
                System.out.print(term + " ");
                term *= ratio;
            }
        }
        catch (InputMismatchException e){
            System.out.println("Invalid Input (Enter Numbers only)");
        }
    }
}

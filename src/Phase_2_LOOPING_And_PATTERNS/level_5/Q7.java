package Phase_2_LOOPING_And_PATTERNS.level_5;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Q7 {

    //Q) Print a pattern where each row i prints i*i.

    public static void main(String[] args) {
        int num;

        try(Scanner sc=new Scanner(System.in)) {
            System.out.println("Enter a Number:");
            num=sc.nextInt();

            if (num < 1) {
                System.out.println("Please enter a positive number.");
                return;
            }

            System.out.printf("Pattern of %d rows :\n",num);
            for(int i=1;i<=num;i++){
                for(int j=1;j<=i*i;j++){
                    System.out.print("* ");
                }
                System.out.println();
            }
        }
        catch (InputMismatchException e){
            System.out.println("Invalid Input (Numbers Only)");
        }
    }
}

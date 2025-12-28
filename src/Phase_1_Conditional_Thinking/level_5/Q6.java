package Phase_1_Conditional_Thinking.level_5;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Q6 {

    //Q) Take three numbers and check if they are in geometric progression.
    public static void main(String[] args) {
        //declare variables;
        int n1, n2, n3;
        Scanner sc = new Scanner(System.in);

        try {
            //taking user inputs
            System.out.print("Number 1 :");
            n1 = sc.nextInt();
            System.out.print("Number 2 :");
            n2 = sc.nextInt();
            System.out.print("Number 3 :");
            n3 = sc.nextInt();
            if (n1 == 0) {
                if (n2 == 0 && n3 == 0) {
                    System.out.println("given numbers are geometric progression");
                } else {
                    System.out.println("given numbers are Not geometric progression");
                }
            } else {
                if (n2 * n2 == n1 * n3) {
                    System.out.println("given numbers are geometric progression");
                } else {
                    System.out.println("given numbers are Not geometric progression");
                }
            }
            System.out.printf("Given numbers : %d %d %d", n1, n2, n3);
        }
        catch (InputMismatchException e){
            System.out.println("Invalid inputs (Enter numbers only)");
        }
        sc.close();
    }
}

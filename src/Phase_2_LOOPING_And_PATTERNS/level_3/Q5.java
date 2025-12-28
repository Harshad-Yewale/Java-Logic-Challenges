package Phase_2_LOOPING_And_PATTERNS.level_3;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Q5 {
    //Q) Find LCM of two numbers using loops.

    public static void main(String[] args) {
        int num1, num2, LCM;

        try (Scanner sc = new Scanner(System.in)) {

            System.out.print("Enter Number 1:");
            num1 = Math.abs(sc.nextInt());

            System.out.print("Enter Number 2:");
            num2 = Math.abs(sc.nextInt());

            if (num1 == 0 || num2 == 0) {
                System.out.printf("LCM of %d and %d is 0", num1, num2);
                return;
            }

             LCM = Math.max(num1, num2);
            int step=LCM;
            while (true){

                if (LCM % num1==0 && LCM % num2 ==0){
                    break;
                }
                LCM+=step;
            }
                System.out.printf("LCM of %d and %d is %d", num1, num2, LCM);



        } catch (InputMismatchException e) {
            System.out.println("Invalid Input, Enter Numbers Only");
        }
    }
}

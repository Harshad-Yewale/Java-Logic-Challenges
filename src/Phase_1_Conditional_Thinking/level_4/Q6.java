package Phase_1_Conditional_Thinking.level_4;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Q6 {

    //Q5) Take two numbers and check if both are positive and their sum is less than 100.

    public  static void main(String [] args) {
        //declare variables
        int num1, num2;
        Scanner sc = new Scanner(System.in);
        try {
            //take user inputs
            System.out.println("Num1 : ");
            num1 = sc.nextInt();

            System.out.println("Num2 : ");
            num2 = sc.nextInt();


            if (num1 > 0 && num2 > 0) {
                if (num1 + num2 > 100) {
                    System.out.println(num1 + " and " + num2 + " both are positive and their sum is more then hundred");
                } else {
                    System.out.println(num1 + " and " + num2 + " both are positive and their sum is not more then hundred");
                }
                System.out.printf("Num1 : %d \nNum2 : %d\nSum : %d + %d =  %d", num1, num2,num1, num2, num1 + num2);
            } else {
                System.out.printf("Num1 : %d \nNum2 : %d", num1, num2);
            }
        }
        catch (InputMismatchException e){
            System.out.println("Plz enter valid inputs (number only)");
        }
        finally {
            sc.close();
        }
    }
}

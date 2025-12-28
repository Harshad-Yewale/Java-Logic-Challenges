package Phase_1_Conditional_Thinking.level_1;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Q4 {

    // Q) Check if a number is divisible by both 3 and 5

    public  static void main(String [] args){

        //declare variables and scanner
        int num;
        Scanner sc=new Scanner(System.in);

        //taking input
        try {
            System.out.println("plz enter the number");
            num = sc.nextInt();

            //checking the conditions
            if (num % 3 == 0 && num % 5 == 0) {
                System.out.println(num + " is divisible by both 3 and 5");
            } else {
                System.out.println(num + " is not divisible by both 3 and 5");
            }
        }
        catch (InputMismatchException e){
            System.out.println("plz enter only number as a input");
        }
        sc.close();
    }
}

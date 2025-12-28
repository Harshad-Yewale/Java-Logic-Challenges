package Phase_1_Conditional_Thinking.level_1;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Q3 {

   // Q) Check if a number is divisible by 5.

    public  static void main(String[] args){

        //declare variables
        int num;
        Scanner sc=new Scanner(System.in);

        //taking input
        try {
            System.out.println("plz enter the number");
            num = sc.nextInt();

            //checking condition
            if (num % 5 == 0) {
                System.out.println(num + " is divisible by 5 ");
            } else {
                System.out.println(num + " is not divisible by 5");
            }
        }
        catch (InputMismatchException e){
            System.out.println("plz enter the valid input in number only");
        }
        sc.close();
    }

}

package Phase_1_Conditional_Thinking.level_5;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Q7 {
    //Q) Take a 3-digit number and check if the sum of the first and last digit equals the middle digit
    public static void main(String[] args) {
        //declare variables
        int num, units, tens, hundreds;

        try {
            Scanner sc = new Scanner(System.in);
            //take user inputs
            System.out.print("plz enter a valid 3 digit number : ");
            num = sc.nextInt();

            if (String.valueOf(Math.abs(num)).length() == 3) {
                units = num % 10;
                tens = (num / 10) % 10;
                hundreds = (num / 100) % 10;
                System.out.printf("unit: %d\ttens: %d\thundreds: %d\n", units, tens, hundreds);
                System.out.printf("Sum = unit+hundreds : %d + %d = %d\n", units, hundreds, (units + hundreds));
                if (units + hundreds == tens) {
                    System.out.printf("tens == sum(units , hundreds) : %d == %d\n", tens, (units + hundreds));
                } else {
                    System.out.printf("tens != sum(units , hundreds) : %d != %d\n", tens, (units + hundreds));

                }
            } else {
                System.out.println("invalid number plz enter only 3 digits number");
            }
        }
        catch (InputMismatchException e){
            System.out.println("Invalid Input plz enter numbers only");
        }

    }
}

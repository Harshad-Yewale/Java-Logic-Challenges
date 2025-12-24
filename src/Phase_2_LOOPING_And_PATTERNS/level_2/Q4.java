package Phase_2_LOOPING_And_PATTERNS.level_2;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Q4 {

    //Q) Find the sum of digits of a number.

    public static void main(String[] args) {

        //declare variables
        int number,temp,sum=0;

        try(Scanner sc=new Scanner(System.in)){

            System.out.println("Enter a Number");
            number=sc.nextInt();
            temp=Math.abs(number);

            while (temp>0){
                int digit=temp%10;
                sum+=digit;
                temp/=10;
            }

            System.out.println("Sum of the digits of the number is : "+sum);
        }
        catch (InputMismatchException e){
            System.out.println("Invalid input (Enter Numbers only)");
        }
    }
}

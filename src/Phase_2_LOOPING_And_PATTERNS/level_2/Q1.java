package Phase_2_LOOPING_And_PATTERNS.level_2;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Q1 {

    //Q) Count the number of digits in a given number.
    public static void main(String[] args) {

        //declare variables
        int num,temp,count=0;

        try(Scanner sc=new Scanner(System.in)) {
            System.out.print("Enter a number : ");
            num=Math.abs(sc.nextInt());

            temp=num;

            while (temp>0){
                temp/=10;
                count++;
            }
            System.out.println(num+" has "+count+" digits");
        }
        catch (InputMismatchException e){
            System.out.println("Invalid Input (Numbers only)");
        }

    }

}

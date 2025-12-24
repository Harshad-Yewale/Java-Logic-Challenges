package Phase_2_LOOPING_And_PATTERNS.level_2;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Q3 {

    //Q Check if a number is a palindrome.

    public static void main(String[] args) {
        int num,temp, reverse =0;
        char isNegative;

        try(Scanner sc=new Scanner(System.in)) {
            System.out.print("Enter a number : ");
            num=sc.nextInt();

            temp=Math.abs(num);

            while (temp>0){
                reverse *=10;
                reverse +=temp%10;
                temp/=10;
            }
            isNegative=num<0?'-':' ';
            if(Math.abs(num)==reverse){
                System.out.println("The Given Number Is Palindrome : \n"+num+" == "+isNegative+reverse);
            }
            else {
                System.out.println("The Given Number Is Not a  Palindrome : \n"+num+" != "+isNegative+reverse);

            }
        }
        catch (InputMismatchException e){
            System.out.println("Invalid Input (Numbers only)");
        }

    }
}

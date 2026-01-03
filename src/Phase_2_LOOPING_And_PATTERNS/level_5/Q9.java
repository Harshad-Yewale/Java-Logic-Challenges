package Phase_2_LOOPING_And_PATTERNS.level_5;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Q9 {
    //Q) Print the sum of all odd digits and even digits separately in a number

    public static void main(String[] args) {

        int num,evenSum=0,oddSum=0;

        try(Scanner sc=new Scanner(System.in)){
            System.out.println("Enter a Number");
            int temp=sc.nextInt();
            num=Math.abs(temp);
            if(num==0){
                System.out.println("Sum of Even Digits : "+evenSum);
                System.out.println("Sum of Odd Digits : "+oddSum);
                return;
            }

            while (num>0){
                int digit=num%10;
                if( digit % 2 == 0) evenSum+=digit ;
                else oddSum+=digit;
                num/=10;
            }
            System.out.println("Sum of Even Digits : "+evenSum);
            System.out.println("Sum of Odd Digits : "+oddSum);
        }
        catch (InputMismatchException e){
            System.out.println("Invalid Input (Numbers Only)");
        }

    }

}

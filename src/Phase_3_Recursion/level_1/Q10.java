package Phase_3_Recursion.level_1;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Q10 {

    //Q)  Find sum of digits of a number recursively.

    public static void main(String[] args) {
        int num;

        try(Scanner sc=new Scanner(System.in)){
            System.out.println("Enter a number: ");
            num=sc.nextInt();

            System.out.println("Sum of ALl Digits of the numbers is: "+findDigitSum(Math.abs(num),1));
        }
        catch (InputMismatchException e){
            System.out.println("Invalid Input (Numbers Only)");
        }
    }

    private static int findDigitSum(int n,int counter){
        if(n==0){
            return 0;
        }
        System.out.println(counter+" Digit : "+n%10);
        return (n%10)+findDigitSum(n/10,counter+1);
    }
}

package Phase_2_LOOPING_And_PATTERNS.level_5;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Q8 {

    public static void main(String[] args) {

        int num;

        try(Scanner sc=new Scanner(System.in)){
            System.out.println("Enter a Number:");
            num=sc.nextInt();

            if (num < 1) {
                System.out.println("Please enter a positive number.");
                return;
            }

            System.out.printf("Factorials of 1-%d are: \n",num);
            for(int i=1;i<=num;i++){
                System.out.printf("Factorial of %d = %d\n",i,fact(i));
            }
        }
        catch (InputMismatchException e){
            System.out.println("Invalid Input (Numbers Only)");
        }

    }

    private static long fact(int num){
        long fact=1;

        for(int i=1;i<=num;i++){
            fact*=i;
        }

        return fact;
    }
}

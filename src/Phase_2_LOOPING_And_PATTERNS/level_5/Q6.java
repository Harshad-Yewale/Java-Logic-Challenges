package Phase_2_LOOPING_And_PATTERNS.level_5;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Q6 {

    //Q) Print all numbers from 1–n whose binary representation has an even number of 1s

    public static void main(String[] args) {

        int num;

        try(Scanner sc=new Scanner(System.in)) {
            System.out.println("Enter a Number:");
            num=sc.nextInt();

            if (num < 1) {
                System.out.println("Please enter a positive number.");
                return;
            }

            System.out.printf("All numbers from 1–%d whose binary representation has an even number of 1s are :\n",num);
            for(int i=1;i<=num;i++){
                int Binary=Integer.bitCount(i);

                if(Binary%2==0){
                    System.out.print(i+" ");
                }
            }
        }
        catch (InputMismatchException e){
            System.out.println("Invalid Input (Numbers Only)");
        }
    }
}

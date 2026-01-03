package Phase_2_LOOPING_And_PATTERNS.level_5;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Q10 {

    //Q) Take 5 numbers as input. If the user enters 0, skip it using continue. At the end, print the sum of all non-zero numbers entered.

    public static void main(String[] args) {
        int sum=0;
        int zeroCount = 0;

        try(Scanner sc=new Scanner(System.in)){

            for (int i=1;i<=5;i++){
                System.out.printf("Enter Number %d: ",i);
                int num=sc.nextInt();
                if(num==0){
                    zeroCount++;
                    continue;
                }
                sum+=num;
            }
            System.out.println("Sum of all non-zero Numbers entered are : "+sum);
            System.out.println("Zero/s (0) skipped: "+zeroCount);
        }
        catch (InputMismatchException e){
            System.out.println("Invalid Input (Numbers Only)");
        }
    }
}

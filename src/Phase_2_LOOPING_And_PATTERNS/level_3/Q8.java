package Phase_2_LOOPING_And_PATTERNS.level_3;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Q8 {

    public static void main(String[] args) {

        // declare variables

        int num,count,sumOfFactOfDigits=0;
        String isStrongNumber;

        try(Scanner sc=new Scanner(System.in)){

            System.out.println("Enter a Number");
            num=Math.abs(sc.nextInt());

            count=(int)String.valueOf(num).length();
            int temp=num;

            while (temp>0){

                int digit=temp%10;
                System.out.printf("Digit %d is %d\t||\t",count--,digit);
                System.out.printf("Factorial of the %d is %d\n",digit,findFact(digit));
                sumOfFactOfDigits+=findFact(digit);
                temp/=10;

            }

            System.out.printf("Number : %d  Sum of Factorial of all digits : %d\n",num,sumOfFactOfDigits);

            isStrongNumber=(num == sumOfFactOfDigits)?"is a Strong Number":"is not a strong Number";

            System.out.println("Number "+num+" "+isStrongNumber);
        }
        catch (InputMismatchException e){
            System.out.println("Invalid Input (Enter Numbers only)");
        }
    }

    private static   int findFact(int num){
        int fact=1;
        for(int i=1;i<=num;i++){
            fact*=i;

        }
        return fact;
    }
}

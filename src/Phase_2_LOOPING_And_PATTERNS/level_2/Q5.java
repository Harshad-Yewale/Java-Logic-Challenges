package Phase_2_LOOPING_And_PATTERNS.level_2;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Q5 {
    //Q) Check if a number is an Armstrong number.

    public static void main(String[] args) {
        //declare variables
        int num,temp,count,sum=0;

        try(Scanner sc=new Scanner(System.in)){

            System.out.println("Enter a Number: ");
            num=sc.nextInt();
            temp=Math.abs(num);
            count=String.valueOf(temp).length();

            while (temp>0){
                int digit=temp%10;
                sum+= (int) Math.pow(digit,count);
                temp/=10;
            }

            if(Math.abs(num)==sum){
                System.out.println(num+" is an Armstrong number");
            }
            else{
                System.out.println(num+" is NOT an Armstrong number");
            }

        }
        catch (InputMismatchException e){
            System.out.println("Invalid input (numbers only)");
        }
    }
}

package Phase_1_Conditional_Thinking.level_1;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Q6 {

    // Q) Take two numbers and print the largest one

    public static void main(String [] args){

        // Declare the variables and Scanner
        int num1,num2;
        Scanner sc=new Scanner(System.in);

        try{
            //take input from the users
            System.out.println("Plz enter the first number");
            num1=sc.nextInt();

            System.out.println("plz enter the second number");
            num2=sc.nextInt();

            //checking conditions
            if (num1>num2){
                System.out.println(num1+ " is greater then "+num2);
            }
            else if(num2>num1){
                System.out.println(num2+" is greater then "+num1);
            }
            else{
                System.out.println("both the numbers are equal");
            }
        }
        //handling exceptions
        catch (InputMismatchException e){
            System.out.println("plz enter the valid number only");
        }

        sc.close();
    }
}

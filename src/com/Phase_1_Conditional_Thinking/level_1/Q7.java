package com.Phase_1_Conditional_Thinking.level_1;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Q7 {

    // Q) Take three numbers and print the largest one

    public static void main(String [] args){

        //declare the variables
        int num1,num2,num3;
        Scanner sc=new Scanner(System.in);

        try{
            //take user inputs
            System.out.println("plz enter the 1st number: ");
            num1=sc.nextInt();
            System.out.println("plz enter the 2nd number: ");
            num2=sc.nextInt();
            System.out.println("plz enter the 3rd number: ");
            num3=sc.nextInt();

            //check the conditions
            if(num1 == num2 && num2 == num3){
                System.out.println("all the numbers are equal");
            }
            else if(num1 >= num2&& num1 >= num3){
                System.out.println(num1 + " is the greatest of all three");
            }
            else if (num2 >= num1 && num2 >= num3) {
                System.out.println(num2 +" is the greatest of all three");

            }
            else{
                System.out.println(num3+" is the greatest of all three");
            }
        }
        //handling exceptions
        catch (InputMismatchException e){
            System.out.println("plz enter the valid number inputs");
        }
        sc.close();

    }
}

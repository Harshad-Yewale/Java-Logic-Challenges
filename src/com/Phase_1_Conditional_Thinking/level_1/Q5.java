package com.Phase_1_Conditional_Thinking.level_1;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Q5 {

    // Q) Check if a given year is a leap year

    public static void main(String[] args){

        //declare the variables
        int year;
        Scanner sc =new Scanner(System.in);

        //take user input
        try {
            System.out.println("plz enter the year you want to check: ");
            year = sc.nextInt();

            //checking condition
            if(year%4==0 &&(year%100!=0 || year%400==0)){
                System.out.println(year+" is a leap year");
            }
            else{
                System.out.println(year+" is not a leap year");
            }
        }
        catch (InputMismatchException e){
            System.out.println("Plz enter the valid number input only");
        }

        sc.close();
    }
}

package com.Phase_1_Conditional_Thinking.level_1;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Q8 {

    // Q)Take a temperature value and print “Cold”, “Warm”, or “Hot” using range conditions.

    public static void main(String[] args){

        //declare variables
        int temperature;
        Scanner sc=new Scanner(System.in);

        try{
            //taking input
            System.out.println("plz enter the temperature in Celsius");
            temperature=sc.nextInt();
            System.out.println("your given temperature is "+temperature+"°C");

            //checking conditions
            if (temperature <= 20){
                System.out.println("and it is Cold");
            }
            else if (temperature<=30){
                System.out.println("and it is Warm");
            }
            else{
                System.out.println("and it is Hot");
            }
        }
        //handling Exceptions
        catch (InputMismatchException e){
           System.out.println(" plz enter the valid number input");
        }
        sc.close();
    }
}

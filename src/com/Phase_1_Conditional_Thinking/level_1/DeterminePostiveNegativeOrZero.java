package com.Phase_1_Conditional_Thinking.level_1;

import java.util.Scanner;

public class DeterminePostiveNegativeOrZero {

    public static void main(String[] args){

        // initializing the variable and scanner
        int number;
        Scanner sc=new Scanner(System.in);

        // checking the conditions
        try {
            System.out.println("Plz enter a number");
            number = sc.nextInt();

            if(number==0){
                System.out.println(number+" is zero");
            }
            else if (number<0) {
                System.out.println(number+" is negative");
            }
            else{
                System.out.println(number+" is  positive");
            }
        }
        // Handling the exceptions
        catch (Exception e){
            System.out.println("plz enter an valid number only");
        }


    }
}

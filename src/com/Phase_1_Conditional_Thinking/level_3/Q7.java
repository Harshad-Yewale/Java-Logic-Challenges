package com.Phase_1_Conditional_Thinking.level_3;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Q7 {

    //Q) Check if an amount can be evenly divided into 2000, 500, and 100 currency notes

    static void countNotes(int amount){
        int amt=amount;
        int count2000 =amt/2000 ;
        amt %=2000;
        int count500=amt/500;
        amt%=500;
        int count100=amt/100;

        System.out.printf("%d can be evenly divided into: \n%d 2000 notes\n%d 500 notes\n%d 100 notes",amount,count2000,count500,count100);

    }

    public static void main(String[] args){

        //declare variables
        int amount;
        Scanner sc=new Scanner(System.in);

        try {
            //taking inputs
            System.out.println("plz enter the amount :");
            amount = sc.nextInt();

            if (amount < 0) {
                System.out.println("Invalid amount : Must be greater then 0");
            }
            if (amount % 100 != 0) {
                System.out.println(amount + " can not be evenly divided");
            } else {
                countNotes(amount);
            }
        }
        catch (InputMismatchException e){
            System.out.println("plz enter valid input (numbers only)");
        }
        sc.close();
    }
}

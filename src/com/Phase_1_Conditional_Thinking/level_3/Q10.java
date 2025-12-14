package com.Phase_1_Conditional_Thinking.level_3;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Q10 {


    public static void main(String[] args){

        //declare numbers
        int num;
        Scanner sc=new Scanner(System.in);

        try {
            //user input
            System.out.println("Plz enter your number");
            num = sc.nextInt();


            if (num <= 0) {
                System.out.println("perfect Square  is defined for positive numbers only");
            }
            else {
                int i = findPerfectSquare(num);
                if (i > 0) {
                    System.out.println(num + " is a perfect square of " + i);
                }
                else {
                    System.out.println(num + " does not have any perfect square");
                }
            }
        }
        catch (InputMismatchException e){
            System.out.println("Plz enter a valid input (number only)");
        }
    }

    static int findPerfectSquare(int num){
            for (int i = 1; i * i <= num; i++) {
                if (i * i == num) {
                    return i;
                }
            }
        return -1;
    }

}

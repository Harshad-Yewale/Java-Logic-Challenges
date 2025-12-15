package com.Phase_1_Conditional_Thinking.level_3;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Q8 {

    //Q) . Check if a Number  lies within the range [100, 999].

    public static void main(String [] args){
        int number;
        Scanner sc= new Scanner(System.in);

        try {
            System.out.println("plz enter a number: ");
            number = sc.nextInt();

            if (number >= 100 && number <= 999) {
                System.out.println(number + " is within the range of 100 - 999");
            } else if (number < 100) {
                System.out.println(number + " is less then 100 and not within the range of 100 - 999");
            } else {
                System.out.println(number + " is more then 999 and not within the range of 100 - 999");
            }
        }
        catch (InputMismatchException e){
            System.out.println("plz enter a valid input (numbers only)");
        }
        sc.close();
    }
}

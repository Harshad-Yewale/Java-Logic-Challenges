package com.Phase_1_Conditional_Thinking.level_2;

import java.util.InputMismatchException;
import java.util.Scanner;


class InvalidAgeException extends Exception {

    public InvalidAgeException() {
        super("the age is invalid can not be less then 0 or more then 120");
    }

}


public class Q6 {

    //Q) Check voting eligibility for a given age (18+)

    public static void main(String[] args) throws InvalidAgeException {
        //declare the variables
        int age;
        Scanner sc = new Scanner(System.in);

        try {
            //take user input
            System.out.println("Plz enter the age");
            age = sc.nextInt();

            //checking the conditions
            if (age < 0 || age > 120) {
                throw new InvalidAgeException();
            }
            if (age < 18) {
                System.out.println("you are a child");
            } else {
                System.out.println("you are a adult");
            }
        } catch (InputMismatchException e) {
            System.out.println("invalid input plz enter number only");
        } catch (InvalidAgeException e) {
            System.out.println(e.getMessage());
        }

        sc.close();
    }
}

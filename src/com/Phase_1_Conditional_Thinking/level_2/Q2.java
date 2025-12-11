package com.Phase_1_Conditional_Thinking.level_2;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Q2 {

    // Q if sides form  a valid triangle, determine whether it is equilateral, isosceles, or scalene

    public static void main(String[] args){

        //declare variables and scanner
        int s1,s2,s3;
        Scanner sc= new Scanner(System.in);

        //taking variables
        try {
            System.out.println("plz enter the value of the first Side: ");
            s1 = sc.nextInt();
            System.out.println("plz enter the value of the Second Side: ");
            s2 = sc.nextInt();
            System.out.println("plz enter the value of the third Side: ");
            s3 = sc.nextInt();

            //checking conditions
            if ((s1+s2>s3)&&(s1+s3>s2)&&(s2+s3>s1)){
                System.out.println("this sides form a valid triangle");
                if(s1==s2 && s2==s3){
                    System.out.println("and it is a equilateral triangle!!");
                }
                else if(s1==s2 || s1==s3 || s2==s3){
                    System.out.println("and it is a isosceles triangle!!");
                }
                else {
                    System.out.println("and it is a scalene triangle!!");
                }
            }
            else{
                System.out.println("this sides does not make a valid triangle");
            }
        }
        //handling exceptions
        catch (InputMismatchException e){
            System.out.println("plz enter valid input (numbers only)");
        }
        sc.close();
    }
}

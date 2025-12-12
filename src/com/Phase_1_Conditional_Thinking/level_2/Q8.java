package com.Phase_1_Conditional_Thinking.level_2;

import java.util.Scanner;

public class Q8 {

    //Q)Take an alphabet character and check if it lies between ‘a’ and ‘m’ or ‘n’ and ‘z’.

    public static void main(String[] args){
        //declare variables
        char c;
        Scanner sc=new Scanner(System.in);

        //user input
        System.out.println("plz enter a character(a-z):");
        String input=sc.next();

       if(input.trim().length()==1){
           c=input.charAt(0);
           if(Character.isLetter(c)) {
               if (Character.isLowerCase(c)) {

                   if(c<='m'){
                       System.out.println(c+" is in range of a to m");
                   }
                   else {
                       System.out.println(c+" is in the range of n to z");
                   }

               } else {
                   System.out.println("you have entered a Uppercase character plz enter lowercase character");
               }
           }
           else {
               System.out.println("the entered character is not a letter");
           }
       }
       else{
           System.out.println("plz enter a valid single digit character only (a-z)");
       }
    }
}

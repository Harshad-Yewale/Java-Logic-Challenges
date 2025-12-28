package Phase_1_Conditional_Thinking.level_1;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Q9 {

    // Q)Take a character and check if it’s a vowel or consonant.

    public static void main(String [] args){

        //declare the variables
        String c;
        Scanner sc=new Scanner(System.in);

        try {
            //taking inputs
            System.out.println("plz enter the character you want to check");
            c = sc.next();


            //checking the conditions
            if (c.trim().length() == 1 && Character.isLetter(c.charAt(0))) {
                if (c.equalsIgnoreCase("a") || c.equalsIgnoreCase("e") || c.equalsIgnoreCase("i") || c.equalsIgnoreCase("o") || c.equalsIgnoreCase("u")) {
                    System.out.println(c + " is a vowel");
                } else {
                    System.out.println(c + " is a consonant");
                }
            } else {
                System.out.println("plz enter single character only");
            }
        }
        //handling exceptions
        catch (InputMismatchException  e ){
            System.out.println("plz enter a  character only");
        }
        catch (NumberFormatException e){
            System.out.println("no special characters allowed");
        }
    }
}

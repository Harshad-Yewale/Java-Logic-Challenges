package Phase_1_Conditional_Thinking.level_2;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Q9 {

    //Q9) Take a day number (1–7) and print the corresponding day name.

    public static void main(String [] args){
        //declare the variables
        int day;
        Scanner sc=new Scanner(System.in);

        try {
            //user input
            System.out.println("plz enter valid number (1-7)");
            day = sc.nextInt();

            switch (day){
                case 1:
                    System.out.println("Monday");
                    break;
                case 2:
                    System.out.println("tuesday");
                    break;
                case 3:
                    System.out.println("wednesday");
                    break;
                case 4:
                    System.out.println("thursday");
                    break;
                case 5:
                    System.out.println("friday");
                    break;
                case 6:
                    System.out.println("saturday");
                    break;
                case 7:
                    System.out.println("sunday");
                    break;
                default:
                    System.out.println("entered number is out of range (1-7)");
                    break;
            }
        }
        catch (InputMismatchException e){
            System.out.println("plz enter a number only");
        }
    }
}

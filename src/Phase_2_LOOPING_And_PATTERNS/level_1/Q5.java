package Phase_2_LOOPING_And_PATTERNS.level_1;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Q5 {

    //Q) Print the table of a given number (n × 1 to n × 10).

    public static void main(String[] args) {
        //declare variable
        int num;

       try(Scanner sc=new Scanner(System.in)) {
           //user inputs
           System.out.println("Enter a number :");
           num = sc.nextInt();
           System.out.println("Multiplication Table of num "+num+" : ");
           for (int i = 1; i <= 10; i++) {
               System.out.println(num + " x " + i + " = " + num * i);
           }
       }
       catch (InputMismatchException e){
           System.out.println("Error occured :"+e.getMessage());
       }
    }
}

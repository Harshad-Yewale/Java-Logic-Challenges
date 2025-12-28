package Phase_2_LOOPING_And_PATTERNS.level_3;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Q1 {

    //Q)  Print the squares of numbers from 1 to n.

    public static void main(String[] args) {
        //declare variables
        int num;

        try(Scanner sc=new Scanner(System.in)){

            //taking inputs
            System.out.print("Enter a Number : ");
            num=sc.nextInt();

            for(int i=1;i<=num;i++){
                System.out.println(i+"² ="+(i*i));
            }
        }
        catch (InputMismatchException e){
            System.out.println("Invalid Input (Numbers only)");
        }
    }
}

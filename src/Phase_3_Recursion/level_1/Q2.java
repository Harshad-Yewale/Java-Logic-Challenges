package Phase_3_Recursion.level_1;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Q2 {

    //Q) Print numbers from n down to 1 using recursion.

    public static void main(String[] args) {

        int num;

        try(Scanner sc=new Scanner(System.in)) {
            System.out.println("Enter a Number:");
            num = sc.nextInt();
            if (num <= 0) {
                System.out.println("Only Positive non zero numbers allowed!!");
                return;
            }
            printNumReverse(num);
        }
        catch (InputMismatchException e){
            System.out.println("Invalid Input (Numbers Only)");
        }
    }

    static void printNumReverse(int n){

        if(n==1){
            System.out.print(1+". ");
            return;
        }
        System.out.print(n+", ");

        printNumReverse(n-1);
    }
}

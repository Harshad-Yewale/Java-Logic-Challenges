package Phase_2_LOOPING_And_PATTERNS.level_2;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Q8 {
    //Q) Check if a number is prime or not.

    public static void main(String[] args) {
       // declare variables
        int num;
        boolean isPrime=true;

        try(Scanner sc=new Scanner(System.in)) {

            System.out.println("Enter a Number : ");
            num=sc.nextInt();

            if(num<=1){
                isPrime=false;
            }

            for (int i = 2; i <= (int) Math.sqrt(num); i++) {
                if(num%i==0){
                    isPrime=false;
                    break;
                }
            }

            System.out.println(num+(isPrime?" is a Prime Number":" is NOT a Prime Number"));
        }
        catch (InputMismatchException e){
            System.out.println("Invalid Input (Numbers Only)");
        }
    }
}

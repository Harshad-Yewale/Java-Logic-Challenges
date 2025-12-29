package Phase_2_LOOPING_And_PATTERNS.level_3;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Q9 {

    //Q) Print first n terms of an arithmetic progression (a, d).


    public static void main(String[] args) {

        //declare variables
        int num,difference,firstTerm=1;

        try(Scanner sc=new Scanner(System.in)) {

            System.out.println("Enter Your Number of terms :");
            num=sc.nextInt();

            System.out.println("Enter the Difference :");
            difference=Math.abs(sc.nextInt());

            System.out.printf("Arithmetic Progression (a=%d, d=%d) for %d terms:\n",firstTerm,difference,num);
            int term=firstTerm;
            for(int i=1;i<=num;i++){
                System.out.print(term+" ");
                term+=difference;
            }

        }
        catch (InputMismatchException e){
            System.out.println("Invalid Input (Enter Numbers only)");
        }

    }
}

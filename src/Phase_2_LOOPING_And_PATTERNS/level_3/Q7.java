package Phase_2_LOOPING_And_PATTERNS.level_3;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Q7 {

    //Q)Find the sum of all factors of a number.

    public static void main(String[] args) {
        //declare the variable
        int num,sum=0;

        try(Scanner sc=new Scanner(System.in)){
            System.out.println("Enter a Number:");
            num=sc.nextInt();


            System.out.println("Factorials of the given number are: ");
            for(int i=1;i*i<=num;i++){
                if(num% i==0){
                    int pair=num/i;
                    sum+=i;
                    System.out.print(i+" ");

                    if(pair!=i){
                        System.out.print(pair+" ");
                        sum+=pair;
                    }
                }
            }
            System.out.println("\nAnd their sum is :"+sum);
        }
        catch (InputMismatchException e){
            System.out.println("Invalid Input (Enter Numbers only)");
        }
    }
}

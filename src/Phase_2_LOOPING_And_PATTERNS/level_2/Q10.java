package Phase_2_LOOPING_And_PATTERNS.level_2;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Q10 {

    //Q) Print sum of first n terms of Fibonacci series.

    public static void main(String[] args) {
        //declare variables
        int num,firstTerm=0,secondTerm=1,nextTerm=0,sum=0;

        try(Scanner sc=new Scanner(System.in)){

            System.out.println("Enter a Number : ");
            num=sc.nextInt();


            if(num<1){
                System.out.print("Enter a positive number\n");
            }
            else{
                System.out.printf("sum of Fibonacci Series till %d : \n",num);
                for(int i=1 ;i<=num;i++){
                    sum+=firstTerm;

                    //compute next term
                    nextTerm=firstTerm+secondTerm;
                    firstTerm=secondTerm;
                    secondTerm=nextTerm;
                }
            }
            System.out.println(sum);

        }
        catch (InputMismatchException e){
            System.out.println("Invalid Input (Enter Numbers only)");
        }
    }
}

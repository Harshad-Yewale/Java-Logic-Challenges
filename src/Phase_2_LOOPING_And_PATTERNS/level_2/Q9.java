package Phase_2_LOOPING_And_PATTERNS.level_2;


import java.util.InputMismatchException;
import java.util.Scanner;

public class Q9 {
    //Q Print Fibonacci series up to n terms.

    public static void main(String[] args) {
        //declare variables
        int num,firstTerm=0,secondTerm=1,nextTerm=0;

        try(Scanner sc=new Scanner(System.in)){

            System.out.println("Enter a Number : ");
            num=sc.nextInt();


            if(num<0){
                System.out.print("Enter a positive number\n");
            }
            else{
                System.out.printf("Fibonacci Series till %d : \n",num);
                for(int i=1 ;i<=num;i++){
                    System.out.print(firstTerm+" ");

                    //compute next term
                    nextTerm=firstTerm+secondTerm;
                    firstTerm=secondTerm;
                    secondTerm=nextTerm;
                }
            }


        }
        catch (InputMismatchException e){
            System.out.println("Invalid Input (Enter Numbers only)");
        }
    }
}

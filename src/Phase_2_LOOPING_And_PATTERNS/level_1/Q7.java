package Phase_2_LOOPING_And_PATTERNS.level_1;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Q7 {

    //Q) Print the sum of all even numbers up to n.

    public static void main(String[] args) {
        //declare variables
        int num,sum=0;

        try(Scanner sc=new Scanner(System.in)){

            // take user input
            System.out.print("Enter a Number: ");
            num=sc.nextInt();

            if(num>0){
                for(int i=2;i<=num;i+=2){
                    System.out.println(sum+" + "+i+" = "+(sum+i));
                    sum+=i;
                }
                System.out.println("Sum of first "+num+" Even Natural numbers is : "+sum);
            }
            else{
                System.out.println(num+" is not a natural  number NATURAL NUMBERS(1,2,3,4......)");
            }
        }
        catch (InputMismatchException e){
            System.out.println("Error occurred: "+e.getMessage());
        }
    }
}

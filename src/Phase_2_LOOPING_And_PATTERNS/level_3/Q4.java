package Phase_2_LOOPING_And_PATTERNS.level_3;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Q4 {

    //Q) Find HCF (GCD) of two numbers using loops.

    public static void main(String[] args) {
        int num1,num2,HCF=0;

        try(Scanner sc=new Scanner(System.in)){

            System.out.print("Enter Number 1:");
            num1=Math.abs(sc.nextInt());

            System.out.print("Enter Number 2:");
            num2=Math.abs(sc.nextInt());

            if(num1==0 && num2==0){
                System.out.println("undefined HCF Because both the numbers are 0");
                return;
            }
            if(num1==0 || num2==0){
                HCF=(num1==0)?num2:num1;
                System.out.printf("HCF of %d and %d is %d", num1, num2, HCF);
                return;
            }

            int maxIteration=Math.min(num1,num2);

            for(int i=1;i<=maxIteration;i++){

                if(num1 % i==0 && num2 % i == 0){
                    HCF=i;
                }
            }
            if(HCF>0) {
                System.out.printf("HCF of %d and %d is %d", num1, num2, HCF);
            }
            else{
                System.out.printf("%d and %d does not have a HCF",num1,num2);
            }


        }
        catch (InputMismatchException e){
            System.out.println("Invalid Input, Enter Numbers Only");
        }
    }


}

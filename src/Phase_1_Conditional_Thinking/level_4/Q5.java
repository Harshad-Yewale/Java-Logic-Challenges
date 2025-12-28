package Phase_1_Conditional_Thinking.level_4;

import java.text.NumberFormat;
import java.util.InputMismatchException;
import java.util.Locale;
import java.util.Scanner;

public class Q5 {

    //Q)  Take income and age, and check if eligible for tax (age > 18 and income > 5 L)

    public static void main(String[] args){

        //declare variables
        int income,age;
        Scanner sc=new Scanner(System.in);

        try {
            //user input
            System.out.println("your Age: ");
            age = sc.nextInt();
            System.out.println("your Income: ");
            income = sc.nextInt();

            NumberFormat formatter=NumberFormat.getCurrencyInstance(new Locale("en","IN"));
            String formatedIncome=formatter.format(income);

            if(age>18 && income>500000){
                System.out.println("You are eligible for Income tax");
            }
            else{
                System.out.println("you are not eligible for Income tax as you are required to be over the age of 18 and income more then 5 lakh");
            }

            System.out.printf("Your Age: %d || Income: %s",age,formatedIncome);
        }
        catch (InputMismatchException e){
            System.out.println("enter valid input (Numbers only)");
        }
        finally {
            sc.close();
        }
    }
}

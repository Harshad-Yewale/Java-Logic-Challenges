package Phase_3_Recursion.level_1;

import java.math.BigInteger;
import java.util.Scanner;

public class Q7 {

    //Q) Calculate power of a number (xⁿ) using recursion.

    public static void main(String[] args) {
        int number,power;

        try(Scanner sc=new Scanner(System.in)){
            System.out.print("Enter a Number:");
            number=sc.nextInt();
            System.out.print("Enter it's Power:");
            power=sc.nextInt();
            System.out.println("Result of "+number+" raise to power of "+power+" is:"+findPow(number,power));

        }

    }

    private static BigInteger findPow(int num, int pow){

        if(pow<0){
            throw new IllegalArgumentException("Value cannot be less then  0");
        }

        if(pow==0){
            return BigInteger.valueOf(num);
        }

        return BigInteger.valueOf(num).multiply(findPow(num,pow-1));

    }
}

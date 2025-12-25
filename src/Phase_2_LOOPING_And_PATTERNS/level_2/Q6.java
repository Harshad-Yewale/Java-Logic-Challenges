package Phase_2_LOOPING_And_PATTERNS.level_2;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Q6 {

    //Q) Check if a number is a perfect number.

    public static void main(String[] args) {
        //declare variables
        int num, sqrtNum, pair, sum = 0;
        String isPerfect;

        try (Scanner sc = new Scanner(System.in)) {

            System.out.println("Enter a Number : ");
            num = sc.nextInt();
            sqrtNum = (int) Math.sqrt(num);

            if(num<=1){
                System.out.println("Numbers less then or equal to 1 can not be perfect square");
                System.exit(0);
            }

            for (int i = 1; i <= sqrtNum; i++) {
                if (num % i == 0) {
                    sum += i;
                    pair = num / i;
                    if (pair != i && pair != num) {
                        sum += pair;
                    }
                }
            }
            isPerfect = (num == sum) ? "is" : "is Not";
            System.out.println("Entered Number : " + num + " | sum of all its Divisors excluding Number : " + sum);
            System.out.println(num + " " + isPerfect + " a perfect number");

        } catch (InputMismatchException e) {
            System.out.println("Invalid input (Enter valid numbers Only)");
        }
    }
}

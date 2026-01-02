package Phase_2_LOOPING_And_PATTERNS.level_5;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Q5 {

    //Q) Find the smallest and largest digit in a given number.

    public static void main(String[] args) {
        int num;

        try (Scanner sc = new Scanner(System.in)) {
            System.out.println("Enter a Number: ");
            num = sc.nextInt();
            smallestAndLargestOfDigits(num);
        } catch (InputMismatchException e) {
            System.out.println("Invalid Input Enter Numbers only");
        }

    }

    static void smallestAndLargestOfDigits(int num) {

        int smallest = 9;
        int largest = 0;
        int temp = Math.abs(num);

        if (temp <= 9) {
            System.out.println(num + " is single digit");
            return;
        }
        while (temp > 0) {
            int digit = temp % 10;
            if (digit < smallest) {
                smallest = digit;
            }
            if (digit > largest) {
                largest = digit;
            }
            temp /= 10;
        }
        System.out.println(num + " has smallest digit : " + smallest + " and largest digit :" + largest);
    }
}

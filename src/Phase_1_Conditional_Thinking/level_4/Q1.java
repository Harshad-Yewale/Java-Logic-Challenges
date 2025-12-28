package Phase_1_Conditional_Thinking.level_4;

import java.util.Scanner;

public class Q1 {

    //Q) Take a character and check if it is a letter, a digit, or neither

    public static void main(String[] args) {

        //declare variables
        char input;
        Scanner sc = new Scanner(System.in);

        //taking user inputs
        System.out.println("input: ");
        String in = sc.next();
        if (in.trim().length() == 1) {
            input = in.charAt(0);

            if (Character.isLetter(input)) {

                String isUppercase = Character.isUpperCase(input) ? "Uppercase" : "Lowercase";
                System.out.println("entered input is a " + isUppercase + " letter : " + input);

            } else if (Character.isDigit(input)) {
                System.out.println("Entered input is a  Digit : " + input);

            } else {
                System.out.println("Entered input is neither letter nor digit : " + input);
            }
        } else {
            System.out.println("only single character input is allowed");
        }
        sc.close();

    }
}

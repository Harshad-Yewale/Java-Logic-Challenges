package Phase_1_Conditional_Thinking.level_2;

import java.util.InputMismatchException;
import java.util.Scanner;


class InvalidHourException extends Exception {
    public InvalidHourException() {
        super("hour cannot be more then 23 or less then 0");
    }
}

public class Q5 {

    //Q)Take the hour of the day (0–23) and print “Good Morning”, “Good Afternoon”, “Good Evening”, or “Good Night”


    public static void main(String[] args) throws InvalidHourException {
        //declare variables
        int hour;
        Scanner sc = new Scanner(System.in);

        try {
            //user input
            System.out.println("plz enter the hour (0-23):");
            hour = sc.nextInt();
            if (hour < 0 || hour > 23) {
                throw new InvalidHourException();
            } else if (hour >= 6 && hour < 12) {
                System.out.println("good Morning");
            } else if (hour >= 12 && hour < 16) {
                System.out.println("good Afternoon");
            } else if (hour >= 16 && hour < 19) {
                System.out.println("good evening");
            } else {
                System.out.println("good night");
            }

        } catch (InvalidHourException e) {
            System.out.println(e.getMessage());
        } catch (InputMismatchException e) {
            System.out.println("invalid input choose numbers only");
        }
        sc.close();
    }

}

package com.Phase_1_Conditional_Thinking.level_5;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Q4 {

    //Q) Take time (hours and minutes) and print the smaller angle between the hour and minutes

    public static void main(String[] args) {


        //declare variables
        double hours, minutes, minutesAngle,hourAngle,angle,smallerAngle;
        Scanner sc = new Scanner(System.in);

        try {
            //take inputs
            System.out.print("Hours hand : ");
            hours = sc.nextInt();
            System.out.print("Minutes hand : ");
            minutes = sc.nextInt();

            if (hours >= 24 || hours < 0 || minutes >=60 || minutes < 0) {
                System.out.println("invalid date plz enter a correct 24 hour format date");
            } else {
                minutesAngle = minutes * 6;
                hourAngle = ((hours % 12) * 30) + (minutes * 0.5);
                angle = Math.abs(hourAngle - minutesAngle);

                smallerAngle = Math.min(angle, (360 - angle));

                System.out.println("Smaller Angle : " + smallerAngle + "°");

                int displayHour;

                if (hours == 0) {
                    displayHour = 0;
                } else if (hours == 12) {
                    displayHour = 12;
                } else if (hours > 12) {
                    displayHour = (int)(hours - 12);
                } else {
                    displayHour = (int) hours;
                }

                String isAm = (hours < 12) ? "am" : "pm";

                System.out.printf("Your time : %02d:%02d %s ", displayHour, (int) minutes, isAm);
            }
        }
        catch (InputMismatchException e){
            System.out.println("invalid input plz enter valid numbers only");
        }
        sc.close();
    }
}

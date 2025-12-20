package com.Phase_1_Conditional_Thinking.level_5;

import java.util.Scanner;

public class Q3 {

    //Q) Take day and month and check if it forms a valid calendar date (ignoring leap years).

    enum monthName {
        January(1,31),
        February(2,28),
        March(3,31),
        April(4,30),
        May(5,31),
        June(6,30),
        July(7,31),
        August(8,31),
        September(9,30),
        October(10,31),
        November(11,30),
        December(12,31);

        private final int day,month;

        monthName(int month, int day) {
            this.month = month;
            this.day=day;
        }

    }

    static monthName getMonthName(int num) {
        for (monthName m : monthName.values()) {
            if (m.month == num) {
                return m;
            }
        }
        return null;
    }


    public static void main(String[] args) {
        //declare variables
        int day;
        int month;

        Scanner sc = new Scanner(System.in);


        //taking user inputs
        System.out.print("Day : ");
        day = sc.nextInt();
        System.out.print("Month : ");
        month = sc.nextInt();

       monthName m= getMonthName(month);


        if (m==null || m.day<day || day<1) {
            System.out.println("Invalid Day or month plz enter the number within range\nDay : (1-31) || Month : (1-12)");
        } else {
            System.out.println("Month : " + m + "\nDate: " + day + "/" + month + "/2025");
        }
    }
}

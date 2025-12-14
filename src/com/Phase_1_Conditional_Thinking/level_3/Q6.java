package com.Phase_1_Conditional_Thinking.level_3;

import java.util.Scanner;

public class Q6 {

    // Q)Take coordinates (x, y) and determine which quadrant the point lies in

    public static void main(String[] args){
        //declare variable
        double x,y;
        Scanner sc=new Scanner(System.in);

        try {
            //take input
            System.out.println("Value of X coordinate : ");
            x = Double.parseDouble(sc.next());

            System.out.println("Value of Y coordinate : ");
            y = Double.parseDouble(sc.next());

            if (x == 0 && y == 0) {
                System.out.printf("(%.2f , %.2f) lies at the origin", x, y);
            } else if (x == 0) {
                System.out.printf("(%.2f , %.2f) lies on the Y axis", x, y);
            } else if (y == 0) {
                System.out.printf(" (%.2f , %.2f) lies  on the X axis", x, y);
            } else {

                int q;

                if(x>0){
                    q=(y>0)?1:4;
                }
                else{
                    q=(y>0)?2:3;
                }
                System.out.printf(" (%.2f , %.2f) lies in the  %d quadrant ",x,y,q);
            }
        }
        catch (NumberFormatException e){
            System.out.println("Plz enter valid numbers only (can be decimal and negative)");
        }
        sc.close();
    }
}

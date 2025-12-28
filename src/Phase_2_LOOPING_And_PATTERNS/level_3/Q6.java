package Phase_2_LOOPING_And_PATTERNS.level_3;

import java.util.Scanner;

public class Q6 {

    //Q) Print all factors of a given number.

    public static void main(String[] args) {
        //declare Variables
        int num;

        try(Scanner sc=new Scanner(System.in)){
            System.out.print("Enter a number: ");
            num=Math.abs(sc.nextInt());

            System.out.printf("Factors of the given Number %d are :\n",num);
            for(int i=1;i<=num;i++){
                if (num % i==0){
                    System.out.printf(i+" ");
                }
            }
        }
    }

}

package Phase_3_Recursion.level_1;

import java.util.Scanner;

public class Q8 {

    // Q) Find nth Fibonacci number recursively.

    public static void main(String[] args) {
        int num;

        try(Scanner sc=new Scanner(System.in)){
            System.out.print("Enter a number:");
            num=sc.nextInt();

            System.out.println(num+" Fibonacci term is "+findFibonacci(num));
        }
    }

    private static int findFibonacci(int n){
        if(n<0){
            throw  new IllegalArgumentException("Number can not be less then 0");
        }

        if(n==0 ){
            return 0;
        }
        if(n==1){
            return 1;
        }

        return findFibonacci(n-1)+findFibonacci(n-2);
    }
}

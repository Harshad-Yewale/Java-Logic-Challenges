package Phase_3_Recursion.level_1;

import java.util.Scanner;

public class Q9 {

    public static void main(String[] args) {
        int num;

        try(Scanner sc=new Scanner(System.in)){
            System.out.print("Enter a number:");
            num=sc.nextInt();

            findFibonacci(num,0,1);
        }
    }

    private static void findFibonacci(int n,int a,int b){
        if(n<0){
           return;
        }
        System.out.print(a+" ");
        findFibonacci(n-1,b,b+a);
    }
}

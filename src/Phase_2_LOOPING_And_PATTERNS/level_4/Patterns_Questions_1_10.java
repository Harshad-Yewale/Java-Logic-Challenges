package Phase_2_LOOPING_And_PATTERNS.level_4;

import java.util.Scanner;

public class Patterns_Questions_1_10 {

    public static void main(String[] args) {

        int rows;
        int columns;
        int temp;

        try (Scanner sc = new Scanner(System.in)) {

            System.out.println("\n\n---------------FIRST QUESTION-----------------");
            System.out.println("1. Print a Single Star (*)");
            System.out.println("*");




            System.out.println("\n\n---------------NEXT QUESTION-----------------");
            System.out.println("2. Print Four Stars (****)");
            System.out.println("****");



            System.out.println("\n\n---------------NEXT QUESTION-----------------");
            System.out.println("3. Print n Stars on Same Line");
            System.out.print("Enter No, of Stars you want to Print: ");
            temp=sc.nextInt();
            for (int i = 0; i<temp;i++ ){
                System.out.print("* ");
            }


            System.out.println("\n\n---------------NEXT QUESTION-----------------");
            System.out.println("4. Print Square of Stars (n x n Stars)");
            System.out.print("Rows:");
            rows =sc.nextInt();
            System.out.print("Columns:");
            columns =sc.nextInt();
            for(int i = 0; i< rows; i++) {
                for (int j = 0; j < columns; j++) {
                    System.out.print("*");
                }
                System.out.println();
            }


            System.out.println("\n\n---------------NEXT QUESTION-----------------");
            System.out.println("5. Print an Increasing Triangle of Stars");
            System.out.print("Rows");
            rows =sc.nextInt();
            for(int i=1;i<=rows;i++){
                for(int j=1;j<=i;j++){
                    System.out.print("*");
                }
                System.out.println();
            }


            System.out.println("\n\n---------------NEXT QUESTION-----------------");
            System.out.println("6. Print a Right-Aligned Triangle of Stars");
            System.out.print("Rows to Print:");
            rows=sc.nextInt();
            for (int i=0;i<rows;i++){
                for (int j=0;j<rows-i-1;j++) {
                    System.out.print(" ");
                }
                    for(int k = 0; k <=i; k++){
                        System.out.print("*");
                    }
                System.out.println();
                }




            System.out.println("\n\n---------------NEXT QUESTION-----------------");
            System.out.println("7. Print Stars in Even Numbers (2, 4, 6, 8, 10)");
            System.out.print("Rows to print:");
            rows=sc.nextInt();
            for(int i=1;i<=rows;i++){
                for(int j=1;j<=2*i;j++){
                    System.out.print("*");
                }
                System.out.println();
            }




            System.out.println("\n\n---------------NEXT QUESTION-----------------");
            System.out.println("8. Print Stars in Odd Numbers (1, 3, 5, 7, 9)");
            System.out.print("Rows to print:");
            rows=sc.nextInt();

            for(int i=0;i<rows;i++){
                for(int j=0;j<2*i+1;j++){
                    System.out.print("*");
                }
                System.out.println();
            }



            System.out.println("\n\n---------------NEXT QUESTION-----------------");
            System.out.println("9. Print a Centered Pyramid of Stars");
            System.out.print("Rows to print:");
            rows=sc.nextInt();
            for (int i=0;i<rows;i++){
                for (int j=0;j<=rows-i;j++){
                    System.out.print(" ");
                }
                for(int k=0;k<2*i+1;k++){
                    System.out.print("*");
                }
                System.out.println();
            }



            System.out.println("\n\n---------------NEXT QUESTION-----------------");
            System.out.println("10. Print Stars and Spaces Alternating (Stars and Blank Spaces)");
            System.out.print("Rows to print:");
            rows=sc.nextInt();

            for(int i=0;i<rows;i++){
                for(int j=0;j<rows-i-1;j++){
                    System.out.print(" ");
                }
                for(int k=0;k<=2*i-1;k++){
                    if(k%2==0){
                        System.out.print("*");
                    }
                    else{
                        System.out.print(" ");
                    }

                }
                System.out.println();
            }

            System.out.println("\n\n---------------FIRST HALF END-----------------");

        }
    }
}

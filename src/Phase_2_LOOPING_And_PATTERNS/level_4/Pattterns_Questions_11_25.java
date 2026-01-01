package Phase_2_LOOPING_And_PATTERNS.level_4;

import java.util.Scanner;

public class Pattterns_Questions_11_25 {

    public static void main(String[] args) {


        int rows;
        int columns;
        int temp;
        char temp2;

        try (Scanner sc = new Scanner(System.in)) {

            System.out.println("\n\n---------------FIRST QUESTION-----------------");
            System.out.println("11. Print Numbers in an Increasing Sequence (1, 12, 123, 1234, 12345)");
            System.out.print("Enter Rows to Print:");
            rows =sc.nextInt();

            for(int i=1;i<=rows;i++){
                for(int j=1;j<=i;j++){
                    System.out.print(j+" ");
                }
                System.out.println();
            }


                    System.out.println("\n\n---------------NEXT QUESTION-----------------");
            System.out.println("12. Print Repeated Numbers per Row (Same Number Repeated)");
            System.out.print("Enter Rows to Print:");
            rows =sc.nextInt();

            for(int i=1;i<=rows;i++){
                for(int j=1;j<=i;j++){
                    System.out.print(i+" ");
                }
                System.out.println();
            }



            System.out.println("\n\n---------------NEXT QUESTION-----------------");
            System.out.println("13. Print Continuous Increasing Numbers Triangle");
            System.out.print("Enter Rows to Print:");
            rows =sc.nextInt();
            temp=1;

            for(int i=1;i<=rows;i++){
                for(int j=1;j<=i;j++){
                    System.out.print(temp+" ");
                    temp++;
                }
                System.out.println();
            }


            System.out.println("\n\n---------------NEXT QUESTION-----------------");
            System.out.println("14. Print Continuous Numbers with Digit Wrap (0–9)");
            System.out.print("Enter Rows to Print:");
            rows =sc.nextInt();
            temp=1;

            for(int i=1;i<=rows;i++){
                for(int j=1;j<=i;j++){
                    System.out.print((temp%10)+" ");
                    temp++;
                }
                System.out.println();
            }


            System.out.println("\n\n---------------NEXT QUESTION-----------------");
            System.out.println("15. Print Binary Pattern (0–1 Triangle)");
            System.out.print("Enter Rows to Print:");
            rows =sc.nextInt();

            for(int i=1;i<=rows;i++){
                for(int j=1;j<=i;j++){
                    System.out.print((i+j+1)%2+" ");
                    temp++;
                }
                System.out.println();
            }


            System.out.println("\n\n---------------NEXT QUESTION-----------------");
            System.out.println("16. Print Continuous Alphabets Triangle");
            System.out.print("Enter Rows to Print:");
            rows =sc.nextInt();
            temp2='A';

            for(int i=1;i<=rows;i++){
                for(int j=1;j<=i;j++){
                    System.out.print(temp2+" ");
                    temp2++;
                }
                System.out.println();
            }




            System.out.println("\n\n---------------NEXT QUESTION-----------------");
            System.out.println("17. Print Same Alphabet per Row");
            System.out.print("Enter Rows to Print:");
            rows =sc.nextInt();
            temp2='A';

            for(int i=1;i<=rows;i++){
                for(int j=1;j<=i;j++){
                    System.out.print(temp2+" ");
                }
                temp2++;
                System.out.println();
            }


            System.out.println("\n\n---------------NEXT QUESTION-----------------");
            System.out.println("18. Print Alphabet Triangle Starting from A Each Row");
            System.out.print("Enter Rows to Print:");
            rows =sc.nextInt();
            temp2='A';

            for(int i=1;i<=rows;i++){
                for(int j=1;j<=i;j++){
                    System.out.print(temp2+" ");
                    temp2++;
                }
                temp2='A';
                System.out.println();
            }





            System.out.println("\n\n---------------NEXT QUESTION-----------------");
            System.out.println("19. Print Alphabet Pyramid Pattern");
            System.out.print("Enter Rows to Print:");
            rows =sc.nextInt();
            temp2='A';

            for(int i=1;i<=rows;i++){
                for(int j=1;j<=rows-i+1;j++){
                    System.out.print("  ");
                }
                for(int j=1;j<=2*i-1;j++){
                    System.out.print(temp2+" ");
                    temp2++;
                }
                System.out.println();
            }


            System.out.println("\n\n---------------NEXT QUESTION-----------------");
            System.out.println("20. Print Number Triangle (Increasing)");
            System.out.print("Enter Rows to Print:");
            rows =sc.nextInt();

            for(int i=1;i<=rows;i++){
                for(int j=1;j<=i;j++){
                    System.out.print(j+" ");
                }
                System.out.println();
            }



            System.out.println("\n\n---------------NEXT QUESTION-----------------");
            System.out.println("21. Print Palindromic Number Pyramid");
            System.out.print("Enter Rows to Print:");
            rows =sc.nextInt();

            for(int i=1;i<=rows;i++){
                for(int j=1;j<=rows-i+1;j++){
                    System.out.print("  ");
                }
                for (int j=1;j<=i;j++){
                    System.out.print(j+" ");
                }
                for(int j=i-1;j>=1;j--){
                    System.out.print(j+" ");
                }
                System.out.println();
            }


            System.out.println("\n\n---------------NEXT QUESTION-----------------");
            System.out.println("22. Print Diamond Pattern Using Stars (Odd Rows)");
            System.out.print("Enter Rows to Print:");
            rows =sc.nextInt();

            for(int i=1;i<=2*rows-1;i++){
                int stars=i<=rows?i:2*rows-i;
                for(int j=1;j<=stars;j++) {
                    System.out.print("* ");
                }
                System.out.println();
            }




            System.out.println("\n\n---------------NEXT QUESTION-----------------");
            System.out.println("23. Print Full Diamond Star Pattern");
            System.out.print("Enter Rows to Print:");
            rows =sc.nextInt();

            for(int i=1;i<=2*rows;i++){
                int stars=i<=rows?i:2*rows-i+1;
                for(int j=1;j<=stars;j++) {
                    System.out.print("* ");
                }
                System.out.println();
            }



            System.out.println("\n\n---------------NEXT QUESTION-----------------");
            System.out.println("24. Print Hollow Diamond / Hourglass Star Pattern");
            System.out.print("Enter Rows to Print:");
            rows =sc.nextInt();

            int totalRows = 2 * rows - 1;
            for (int i = 1; i <= totalRows; i++) {
                int level = (i <= rows) ? i : (2 * rows - i);
                int spaces = rows - level + 1;
                int stars = 2 * level - 1;

                for (int s = 1; s <= spaces; s++) {
                    System.out.print("  ");
                }
                for (int j = 1; j <= stars; j++) {
                    System.out.print("* ");
                }
                System.out.println();
            }



            System.out.println("\n\n---------------LAST QUESTION-----------------");
            System.out.println("25. Print Palindromic Number Pyramid (Reverse Start)");
            System.out.print("Enter Rows to Print:");
            rows =sc.nextInt();

            for(int i=1;i<=rows;i++){
                for(int j=1;j<=rows-i;j++){
                    System.out.print("  ");
                }
                for (int j=1;j<=i;j++){
                    System.out.print(rows-j+1+" ");
                }
                for (int j=rows-i+2;j<=rows;j++){
                    System.out.print(j+" ");
                }
                System.out.println();
            }
        }
    }
}

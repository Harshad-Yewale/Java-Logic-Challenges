package Phase_1_Conditional_Thinking.level_4;

import java.util.Scanner;

public class Q10 {

    //Q Take a password string and check basic rules (length ≥ 8 and contains at least one digit).

    public static void main(String[] args) {

        //declare variable
        String password;
        Scanner sc=new Scanner(System.in);

        //take user input
        System.out.print("plz Set your password : ");
        password =sc.nextLine();

        if(password.length()>=8 && password.matches(".*\\d.*")){
            System.out.println("Password Set Successfully\nYour Password :"+password);
        }
        else if(password.length()>=8){
            System.out.println("Password must contain at least one digit");
        }
        else {
            System.out.println("Password must be at least 8 characters long");
        }
            sc.close();

    }
}

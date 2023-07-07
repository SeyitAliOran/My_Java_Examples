package dersler.gun15_ForLoop2;

import java.util.Scanner;

public class ForLoopLogin {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String user = "";
        String password = "";

        for (int i = 1; i <= 3; i++) {
            System.out.print("Please enter your user name : ");
            user = input.nextLine();
            System.out.print("Please enter your password : ");
            password = input.nextLine();


            if (user.equals("Ahmet") && password.equals("12345")){
                System.out.println("Login successful");
                System.out.println("You can access your account");
                break; // login ve password dogru oldugu icin  burda programi bitirecek
            }else
                System.out.println("User name or password is not correct!!");
            System.out.println("Try again");
            System.out.println("You have " + (3-i) + " try left");
            if(3-i == 0) System.out.println("Your account is blocked!!");
        }

    }
}

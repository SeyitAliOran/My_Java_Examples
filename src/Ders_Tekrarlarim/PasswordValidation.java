package Ders_Tekrarlarim;

import java.awt.desktop.SystemEventListener;
import java.util.Scanner;

public class PasswordValidation {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter your password");
        String password = scanner.nextLine();
       passwordValidation(password);
    }
    public static void passwordValidation(String password){
        boolean isValid =true;

        if (password.length()<8){
            System.out.println("Password should be at least 8 characters!");
            isValid=false;
        }
        if (!password.matches(".*[a-z].*")){
            System.out.println("Password should contain at least 1 lowercase letters!");
            isValid =false;
        }
        if (!password.matches(".*[A-Z].*")){
            System.out.println("Password should contain at least 1 uppercase letters!");
            isValid =false;
        }
        if (!password.matches(".*[0-9].*")){
            System.out.println("Password should contain at least 1 numeric digits!");
            isValid =false;
        }
        if (!password.matches(".*[!@#$%^&*()-=_+~`\\[\\]{}|;:'\",.<>/?].*")){
            System.out.println("Password should contain at least 1 special characters!");
            isValid =false;
        }
        if (isValid){
            System.out.println("* password is valid *");
        }

    }
}

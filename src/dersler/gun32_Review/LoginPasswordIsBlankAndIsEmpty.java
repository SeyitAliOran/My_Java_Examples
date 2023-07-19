package dersler.gun32_Review;

import java.util.Scanner;

public class LoginPasswordIsBlankAndIsEmpty {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Lutfen kullanici adini giriniz: ");
        String userName = scanner.nextLine();
        System.out.print("Sifrenizi giriniz: ");
        String password = scanner.nextLine();
        loginCheck(userName,password);
    }
    public static void loginCheck(String userName,String password){
        String loginUser = "Ahmet";
        String loginPassword = "12345";
        if ((userName.isEmpty() || userName.isBlank()) && (password.isEmpty() || password.isBlank())){
            System.out.println("User name ve password alanlari bos birakilamaz.");
        }else if (userName.isEmpty() || userName.isBlank()){
            System.out.println("User name bos birakilamaz.");
        }else if (password.isEmpty() || password.isBlank()){
            System.out.println("Password bos birakilamaz.");
        }else if (!loginUser.equals(userName) || !loginPassword.equals(password)){
            System.out.println("Kullanici adi veya sifre yanlis.");
        }else System.out.println("Basarili bir sekilde sisteme giris yaptiniz.");
    }
}

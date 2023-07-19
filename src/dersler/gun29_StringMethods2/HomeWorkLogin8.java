package dersler.gun29_StringMethods2;

import java.util.Scanner;

public class HomeWorkLogin8 {
    //Create a Login Functionality according to following Logic
    //• UserName,Password
    //• --- > Program will ask to enter username and password
    //• --- > If both username and password are blank
    //• "UserName and Password Fields cannot be empty”
    //• --- > If userName is blank and password is not blank
    //• "UserName cannot be empty”
    //• --- > If userName is not blank and password is blank
    //• "Password cannot be empty”
    //• --- > If the username or password is not valid
    //• "UserName or password is not valid. Please verify”
    //• --- > If the username and password are both valid
    //• “User Logged in successfully"
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Lutfen kullanici adini giriniz: ");
        String kullaniciAdi = sc.nextLine();
        System.out.print("Lutfen sifrenizi giriniz: ");
        String sifre = sc.nextLine();

        if (kullaniciAdi.isBlank() && sifre.isBlank()) {
            System.out.println("UserName and Password Fields cannot be empty");
        } else if (kullaniciAdi.isBlank()){
            System.out.println("UserName cannot be empty");
        }else if (sifre.isBlank()){
            System.out.println("Password cannot be empty");
        }else if(kullaniciAdi.equals("Admin") && sifre.equals("admin")) {
            System.out.println("User Logged in successfully");
        } else {
            System.out.println("UserName or password is not valid. Please verify");
        }
    }
}

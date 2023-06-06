package Alistirmalarim;

import javax.swing.*;
import java.util.Scanner;

public class LoginGirisYaptirma {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String k_adi,sifre;
        System.out.print("Kullanici Adini Giriniz : ");
        k_adi = scan.nextLine();
        System.out.print("Sifrenizi Giriniz : ");
        sifre = scan.nextLine();
        if (k_adi.equals("java") && sifre.equals("123")){
            System.out.println("Basarili bir giris yaptiniz...");
        }else {
            System.out.println("Kullanici adi veya Sifreniz yanlis !");
        }
    }
}

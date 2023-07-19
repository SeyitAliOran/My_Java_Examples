package dersler.gun28_StringClass;

import java.util.Scanner;

public class LengthOfName {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Lütfen adinizi ve soyadinizi giriniz!: ");
        String adSoyad = sc.nextLine();

        int isimUzunluk = adSoyad.length();
        System.out.println("Isim Uzunluk = " + isimUzunluk);
    }
}

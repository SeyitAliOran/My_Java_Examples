package Alistirmalarim;

import java.util.Scanner;

public class VizeFinalSonucuHesaplamaKullaniciGirer {
    public static void main(String[] args) {
        int quiz, vize, ffinal;
        double ortalama;
        Scanner input = new Scanner(System.in); // Kullanicidan veri almak icin kullanilir

        System.out.println("Quiz Notunu Giriniz :");
        quiz = input.nextInt(); // kullanici deger girer

        System.out.println("Vize Notunu giriniz :");
        vize = input.nextInt();

        System.out.println("Final Notunu Giriniz :");
        ffinal = input.nextInt();

        ortalama = (quiz * 0.2) + (vize * 0.35) + (ffinal * 0.45);
        System.out.println("Not Ortalamaniz = " + ortalama);
        String sonuc = (ortalama >= 50) ? "Gectiniz" : "Kaldiniz";
        System.out.println(sonuc);
    }
}

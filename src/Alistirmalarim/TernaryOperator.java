package Alistirmalarim;

import java.util.Scanner;

public class TernaryOperator {
    public static void main(String[] args) {
        // Soru1 kullanicidan bir sayi isteyin
        // sayiyi kontrol edip 5 ile bolunuyorsa " Sayi 5 in tam kati" yazdirin
        // degilse " 5 in tam kati degil" yazdirin
        Scanner scan = new Scanner(System.in);
        System.out.print("Lutfen pozitif bir tam sayi giriniz : ");
        int girilenSayi = scan.nextInt();

        System.out.println(girilenSayi%5 == 0 ? " Sayi 5 in tam kati \n" :" 5 in tam kati degil\n\n " );

        // Soru2 kullanicidan bir harf isteyin.Girilen karakter kucuk harf ise onu buyuk yazdirin degilse girilen harfi

        System.out.print("Lutfen bir harf giriniz : ");
        char harf = scan.next().charAt(0);

        System.out.println(harf>='a' && harf<='z' ? (char)(harf-32) : harf);

    }
}

package dersler.gun14_ForLoop1;

import java.util.Scanner;

public class ForLoopTekCiftSayiToplam {
    public static void main(String[] args) {
        // Klavyeden girilen sayi araligindaki tek sayilarin ve cift sayilarin toplamini ekrana yazdiran program
        Scanner veriGir = new Scanner(System.in);
        int baslangicSayi = 0;
        int bitisSayi = 0;
        int tekSayiToplam = 0;
        int ciftSayiToplam = 0;

        System.out.print("Klavyeden baslangic icin bir tam sayi giriniz : ");
        baslangicSayi = veriGir.nextInt();
        System.out.print("Klavyeden bitis icin bir tam sayi giriniz : ");
        bitisSayi = veriGir.nextInt();

        System.out.println(baslangicSayi + " sayisi ile " + bitisSayi + " sayisi arasinda : ");
        for (; baslangicSayi <= bitisSayi; baslangicSayi++) {
            if (baslangicSayi %2 == 0 ){
                ciftSayiToplam += baslangicSayi;
            }else {
                tekSayiToplam += baslangicSayi;
            }

        }
        System.out.println("Tek sayilarin toplami = " + tekSayiToplam);
        System.out.println("Cift sayilarin toplami = " + ciftSayiToplam);



    }
}

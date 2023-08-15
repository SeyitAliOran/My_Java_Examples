package Ders_Tekrar;

import java.util.Scanner;

public class Ders_Tekrarlarim {
    public static void main(String[] args) {
        Scanner veriGir = new Scanner(System.in);
        int baslangicSayisi = 0;
        int bitisSayi = 0;
        int tekSayiToplam = 0;
        int ciftSayiToplam = 0;
        System.out.print("Klavyeden baslangic icin bir tam sayi giriniz: ");
        baslangicSayisi = veriGir.nextInt();
        System.out.print("Klavyeden bitis icin bir tam sayi giriniz: ");
        bitisSayi = veriGir.nextInt();

        System.out.println(baslangicSayisi + " sayisi ile " + bitisSayi + " sayisi arasindaki: ");
        for (; baslangicSayisi<= bitisSayi; baslangicSayisi++){
            if (baslangicSayisi %2 == 0){
                ciftSayiToplam += baslangicSayisi;
            }else {
                tekSayiToplam += baslangicSayisi;
            }
        }
        System.out.println("Tek sayilarin toplami= " + tekSayiToplam);
        System.out.println("Cift sayilarin toplami= " + ciftSayiToplam);
    }
}

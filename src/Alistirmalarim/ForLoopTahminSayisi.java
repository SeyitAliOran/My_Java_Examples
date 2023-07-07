package Alistirmalarim;

import java.util.Scanner;

public class ForLoopTahminSayisi {
    public static void main(String[] args) {
        Scanner tahmin = new Scanner(System.in);
        System.out.println("For loop ile sayi tahmin oyunu");
        System.out.println("En fazla 3 tahmin hakkiniz var");
        System.out.println();
        int tahminsayi = 0;
        int rastgeleSayi = 1+ (int) (Math.random()*10);// random fonksiyonu 1 ile 10 arasi sayi uretir. 10 sayisini istersem *10+1 yapmam gerekir


        boolean dogruCevap = true;
        int maxTahminSayisi = 3;
        for (int i = 1; i <= maxTahminSayisi && dogruCevap; i++) {
            System.out.print("Tahmininizi giriniz: ");
            tahminsayi = tahmin.nextInt();
            if(tahminsayi==rastgeleSayi){
                System.out.println("Tebrikler bildiniz...");
                dogruCevap = false;
            }else{
                System.out.println("Yanlis. Lutfen tekrar deneyiniz...");
                String mesaj = (maxTahminSayisi - i == 0)? "" : (maxTahminSayisi-i) + "tahmininiz kaldi";
                if(tahminsayi<rastgeleSayi){
                    System.out.println("Lutfen daha buyuk deger girin...");
                }else{
                    System.out.println("Lutfen daha kucuk deger girin...");
                }
            }

        }
        System.out.println();
        System.out.println("Tuttugum sayi :" + rastgeleSayi);
    }
}

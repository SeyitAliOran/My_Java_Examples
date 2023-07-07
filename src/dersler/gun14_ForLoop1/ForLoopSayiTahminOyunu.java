package dersler.gun14_ForLoop1;

import java.util.Scanner;

public class ForLoopSayiTahminOyunu {
    public static void main(String[] args) {
        Scanner tahmin = new Scanner(System.in);
        System.out.println("For loop ile sayi tahmin oyunu");
        System.out.println("En fazla 3 tahmin hakkiniz var");
        System.out.println();
        int tahminsayi = 0;
        int rastgeleSayi = 1+ (int) (Math.random()*10);// random fonksiyonu 1 ile 10 arasi sayi uretir. 10 sayisini istersem *10+1 yapmam gerekir


        boolean dogruCevap = true;
        int maxTahminSayisi = 3;
        for(int i = 1; i <= maxTahminSayisi && dogruCevap ; i++) {
            System.out.print("Tahmininizi giriniz : ");
            tahminsayi = tahmin.nextInt();
            System.out.println();
            if (tahminsayi == rastgeleSayi) { //1.if
                System.out.println("Tebrikler bildiniz");
                dogruCevap = false;
            } else { //1.else
                System.out.println("Maalesef tahmininiz yanlis");
                //System.out.println(maxTahminSayisi - i + "tahmininiz kaldi");

                String mesaj = (maxTahminSayisi- i == 0) ? " " : (maxTahminSayisi - i) + " tahmininiz kaldi";
                System.out.println(mesaj);

            }
            if(tahminsayi < rastgeleSayi){
                System.out.println("Tahmin sayinizin daha buyuk olmasi gerekiyor");
            }else System.out.println("Tahmin sayinizin daha kucuk olmasi gerekiyor");
        }
        System.out.println();
        System.out.println("Tuttugum sayi = " + rastgeleSayi);

    }
}

package Alistirmalarim;
import java.util.Scanner;

public class SinifAtlamaProjesi {
    public static void main(String[] args) {
        /*
        Turkce,matematik,fen bigisi, sosyal bilgisi , beden egitimi, notlari girilsin
        not ortlamasi hesaplansin
        ortalama 50 den kucuk ise sinifta kalsin degilse sinifi gecsin.
         */
        int turkce, matematik,fenBilgisi,sosyalBIlgisi,bedenEgitimi;
        double ortalama = 0;
        Scanner scan = new Scanner(System.in);

        System.out.print(" Turkce Notunu Giriniz : ");
        turkce = scan.nextInt();

        System.out.print(" Fen Bilgisi notunu Giriniz : ");
        fenBilgisi = scan.nextInt();

        System.out.print(" Matematik Notunu GIriniz : " );
        matematik = scan.nextInt();

        System.out.print(" Sosyal Bilgiler Notunu Giriniz : ");
        sosyalBIlgisi = scan.nextInt();

        System.out.print(" Beden Egitimi Notunu Giriniz : ");
        bedenEgitimi = scan.nextInt();
        System.out.println();
        ortalama = (turkce+fenBilgisi+matematik+sosyalBIlgisi+bedenEgitimi)/5;
        System.out.println(" Turkce Notunuz         = " + turkce);
        System.out.println(" FenBilgisi Notunuz     = " + fenBilgisi);
        System.out.println(" Matematik Notunuz      = " + matematik);
        System.out.println(" Sosyal Bilgisi Notunuz = " + sosyalBIlgisi);
        System.out.println(" Beden Egitimi Notunuz  = " + bedenEgitimi);
        System.out.println(" Sinif Ortalamaniz      : " + ortalama);
        if (ortalama < 50) {
            System.out.println(" \nSinifta kaldiniz ! Seneye Gorusmek Uzere...");
        }else {
            System.out.println(" \nTebrikler Sinifi Basarili Bir Sekilde Gectiniz...");
        }


    }
}

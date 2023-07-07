package dersler.gun21_Rewiew;

import java.util.Scanner;

public class TasKagitMakas {
    /*
        Taş-kâğıt-makas, genellikle iki oyuncuyla ve üç durumdan birinin seçilmesiyle oynanan bir el oyunudur.
        Taş makası, makas kağıdı, kâğıt da taşı yener.
        Eğer oyuncular aynı durumu seçerse oyun berabere biter.
     */
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        while (true) {
            System.out.print("Seçiminizi giriniz : ");
            String oyuncu = input.nextLine();
            String bilgisayar = bilgisayarSecimi();
            System.out.println("Bilgisayar = " + bilgisayar);

      /*  String sonuc = tasKagitMakas(oyuncu, bilgisayar);
        sonucYaz(sonuc);*/
            sonucYaz(tasKagitMakas(oyuncu, bilgisayar));
        }
    }

    public static void sonucYaz(String sonuc) {
        System.out.println("************************");
        System.out.println("----> " + sonuc);
        System.out.println("************************");
    }

    public static String tasKagitMakas(String oyuncu, String bilgisayar) {
        if (oyuncu.equalsIgnoreCase(bilgisayar)) {
            return "Beraberlik";
        } else if (oyuncu.equalsIgnoreCase("Kağıt") && !bilgisayar.equalsIgnoreCase("Makas")) {
            return "Oyuncu kazanır";
        } else if (oyuncu.equalsIgnoreCase("Makas") && !bilgisayar.equalsIgnoreCase("Taş")) {
            return "Oyuncu kazanır";
        } else if (oyuncu.equalsIgnoreCase("Taş") && !bilgisayar.equalsIgnoreCase("Kağıt")) {
            return "Oyuncu kazanır";
        } else return "Bilgisayar kazanır";
    }

    public static String bilgisayarSecimi() {
        int secim = (int) (Math.random() * 3 + 1);
        String bilgisayarSecimi = "";

        switch (secim) {
            case 1:
                bilgisayarSecimi = "Taş";
                break;
            case 2:
                bilgisayarSecimi = "Kağıt";
                break;
            case 3:
                bilgisayarSecimi = "Makas";
                break;
        }
        return bilgisayarSecimi;
    }
}

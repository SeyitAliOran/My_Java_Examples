package Ders_Tekrarlarim;

import java.util.Scanner;

public class TasKagitMakas {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        while (true) {
            System.out.print("Seciminizi giriniz : ");
            String oyuncu = input.nextLine();

            String bilgisayar = bilgisayarSecimi();
            System.out.println("Bilgisayar = " + bilgisayar);

            sonucYaz(tasKagitMakas(oyuncu, bilgisayar));


        }
    }
    public static void sonucYaz(String sonuc){
        System.out.println("****************");
        System.out.println("---> " + sonuc);
        System.out.println("****************");
    }
    public static String tasKagitMakas(String  oyuncu, String bilgisayar) {
            if (oyuncu.equalsIgnoreCase(bilgisayar)) {
                return "Beraberik olur";
            } else if (oyuncu.equalsIgnoreCase("Kagit") && !bilgisayar.equalsIgnoreCase("Makas")) {
                return "Oyuncu kazanir";
            } else if (oyuncu.equalsIgnoreCase("Makas") && !bilgisayar.equalsIgnoreCase("Tas")) {
                return "Oyuncu kazanir";
            } else if (oyuncu.equalsIgnoreCase("Tas") && !bilgisayar.equalsIgnoreCase("Kagit")) {
                return "Oyuncu kazanir";
            } else return "Bilgisayar kazanir";
    }
    public static String bilgisayarSecimi(){
        int secim = (int) (Math.random()*3+1);
        String bilgisayarSecimi = "";
        switch (secim){
            case 1:
                bilgisayarSecimi = "Tas";
                break;
            case 2:
                bilgisayarSecimi = "Kagit";
                break;
            case 3:
                bilgisayarSecimi = "Makas";
                break;
        }
        return bilgisayarSecimi;
    }
}

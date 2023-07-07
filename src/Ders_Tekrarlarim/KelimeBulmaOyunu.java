package Ders_Tekrarlarim;

import java.util.Scanner;

public class KelimeBulmaOyunu {
    public static void main(String[] args) {
        menu();
        oyun();
    }
    public static void menu (){
        System.out.println("-----Kelime tahmin oyunu-----");
        System.out.println("-------Kelime listesi--------");
        System.out.println("..elma,armut,karpuz,erik,kiraz..");
    }
    public static void oyun(){
        Scanner input = new Scanner(System.in);
        String kelime = "";
        String tahminKelime  = "";
        int rastgeleKelime = (int) (Math.random()*5+1);
        switch (rastgeleKelime){
            case 1 :
                kelime = "Elma";
                break;
            case 2 :
                kelime = "Armut";
                break;
            case 3 :
                kelime = "Karpuz";
                break;
            case 4 :
                kelime = "Erik";
                break;
            case 5:
                kelime = "Kiraz";
                break;
        }
        for (int i = 1; i < 3 ; i++) {
            System.out.print("Tahmininizi giriniz = ");
            tahminKelime = input.nextLine();
            if(kelime.equalsIgnoreCase(tahminKelime)){
                System.out.println("Tebrikler " + i + " .tahminde bildiniz");
                break;
            }else {
                System.out.println("Kelime tahmininiz yanlis");
                System.out.println(3-i + " tahmininiz kaldi");
            }

        }
        System.out.println("Tuttugum kelime  = " + kelime);
    }
}

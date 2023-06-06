package Alistirmalarim;

import java.util.Scanner;

public class UcakBiletFiyatiHesaplayanProgram {
    public static void main(String[] args) {
        /* Km birim fiyati : 0.10$
           12 yasindan kucukse toplam fiyata 50% indirim
           12-24 yas arasinda ise 10% indirim
           65 yasindan buyukse 30% indirim
           Gidis Donus alirsa 20% indirim
           Bu kosullara uyan ucak bileti hesaplama programi
         */
        Scanner scan = new Scanner(System.in);
        int km,yas,tip;
        System.out.print("Mesafeyi Giriniz : ");
        km = scan.nextInt();
        System.out.print("\nYasini Giriniz : ");
        yas = scan.nextInt();
        System.out.print("\nYolculuk tipini seciniz (1= Tek Gidis , 2 = Gidis/Donus) : ");
        tip = scan.nextInt();

        double normalFiyat,yasIndiirimi,tipIndirimi;
        if(km > 0 && yas > 0 &&(tip == 1 || tip == 2)){
            normalFiyat = km*0.10;
            if(yas < 12){
                yasIndiirimi = normalFiyat * 0.5; //Indirim Orani hesapliyorum
            }else if (yas >= 12 && yas <= 24) {
                yasIndiirimi = normalFiyat * 0.10;
            } else if (yas >= 65) {
                yasIndiirimi = normalFiyat * 0.30;
                normalFiyat -= yasIndiirimi;
            }else {
                yasIndiirimi = 0;
            }
            normalFiyat -=yasIndiirimi; // Fiyattan indirimi ciakriyorum
            if(tip == 2){
              tipIndirimi = normalFiyat * 0.20;
              normalFiyat = (normalFiyat - tipIndirimi)*2;
            }
            System.out.println("Bilet Tutari : " + normalFiyat + "$");
        }else {
            System.out.println("Girdiginiz degerler eksik veya yanlis lutfen tekrar deneyiniz ! ");
        }
    }


}

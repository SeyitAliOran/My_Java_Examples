package dersler.gun46_Review.Static;

import static dersler.gun46_Review.Static.StaticConverter.*; // static import
public class StaticConverterTest {
    public static void main(String[] args) {
     //   StaticConverter converterObj = new StaticConverter();
        //double kilometer = converterObj.milesToKilometers(100); // Dogru kullanim degil. Bu sekilde kullanim tercih edilmiyor.
       // System.out.println("kilometer = " + kilometer);

        // Eger Classda ki butun methodlar ve degerler Static ise tekrardan object olusturmaya gerek kalmadan degerle ulasiriz.
        // Static olarak olusturulan bir methoda direkt Class uzerinden ulasabiliyoruz
        // Bu tarz kullanim tavsiye ediliyor..--> dogru kullanim Class uzerinden methoda ulasmak
        double kilometer1 = StaticConverter.milesToKilometers(100);
        System.out.println("kilometer1 = " + kilometer1);
        System.out.println();
        double miles1 = StaticConverter.KilometersToMiles(160.9);
        System.out.println("miles1 = " + miles1);
        System.out.println();

        double kdv18 = StaticConverter.kdvHesapla(100);
        System.out.println("kdv18 = " + kdv18);
        System.out.println();

        double kdv1_18 = kdvHesapla(100); // yukarida static classi import ederek de bu sekilde kullanim olabiliyor
        System.out.println("kdv1_18 = " + kdv1_18);
      // StaticConverter obj1 = new StaticConverter();--> StaticConverter Classda ki Constructor Private oldugu icin erisemiyoruz


    }
}

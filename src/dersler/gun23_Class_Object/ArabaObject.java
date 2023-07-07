package dersler.gun23_Class_Object;

public class ArabaObject {
    public static void main(String[] args) {
        Araba araba1 = new Araba();

        araba1.isim = "Audi A6";
        araba1.model = 2022;
        araba1.motor = 4.2;
        araba1.renk  = "Siyah";
        araba1.donanim = "Full";
        araba1.fiyat = 25.000;

        System.out.println("araba1.isim = " + araba1.isim);
        System.out.println("araba1.model = " + araba1.model);
        System.out.println("araba1.motor = " + araba1.motor);
        System.out.println("araba1.renk = " + araba1.renk);
        System.out.println("araba1.donanim = " + araba1.donanim);
        System.out.println("araba1.fiyat = " + araba1.fiyat);
        araba1.mevcut();
        araba1.surusTesti();
        araba1.garanti();
    }
}

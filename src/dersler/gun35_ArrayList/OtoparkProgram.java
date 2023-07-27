package dersler.gun35_ArrayList;

import java.util.Scanner;

public class OtoparkProgram {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Otopark otopark = new Otopark();
        otopark.adi = "Belediye Otoparkı";
        otopark.adresi = "Falanca Yerdeki otopark.";

        Araba araba1 = new Araba();
        araba1.marka = "Toyota";
        araba1.plaka = "HHH-353";

        Araba araba2 = new Araba();
        araba2.marka = "Honda";
        araba2.plaka = "ABC-123-XYZ";

        System.out.print("Araç markasını giriniz : ");
        Araba araba3 = new Araba();
        araba3.marka = scanner.nextLine();

        System.out.print("Aracın plakasını girin : ");
        araba3.plaka = scanner.nextLine();

       /* otopark.arabalar.add(araba1);
        otopark.arabalar.add(araba2);
        otopark.arabalar.add(araba3);*/
        otopark.aracEkle(araba1);
        otopark.aracEkle(araba2);
        otopark.aracEkle(araba3);

        otopark.showInfo();
    }
}
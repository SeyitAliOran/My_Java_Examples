package dersler.gun40_Encapculation_2.HomeWork;

import java.sql.SQLType;
import java.util.Scanner;

public class GaleriYonetimiKullanici {
    public static void main(String[] args) {
  galeriEkle();
    }
    public static void galeriEkle(){
        Scanner scanner = new Scanner(System.in);
        Galeri galeri = new Galeri();
        boolean cikis = true;
        System.out.println("Oran Galeriye Hosgeldiniz ");
        System.out.println("Lutfen aracin detaylarini giriniz...");
        while (cikis){
            System.out.print("Ismi: ");
            String aracIsmi = scanner.nextLine();
            System.out.print("Modeli: ");
            String aracModel = scanner.nextLine();
            System.out.print("Motor: ");
            double aracMotor = scanner.nextDouble();
            scanner.nextLine();
            System.out.print("Vites (Duz/Otomatik): ");
            String aracVites = scanner.nextLine();
            System.out.print("Renk: ");
            String aracRengi = scanner.nextLine();

            Araba araba = new Araba(aracIsmi, aracModel, aracMotor, aracVites, aracRengi);
            galeri.arabaEkle(araba);

            System.out.println("Cikmak icin H tusunua basiniz / devam etmek icin enter tusuna basiniz");
            String devamMi = scanner.nextLine();
            if (devamMi.equals("H")){
                cikis= false;
            }
        }
        galeri.arabalariGoster();

    }

}

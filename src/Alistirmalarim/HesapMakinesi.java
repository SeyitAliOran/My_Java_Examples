package Alistirmalarim;
import java.util.Scanner;
public class HesapMakinesi {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int sayi1,sayi2,secim;
        System.out.print("Ilk Sayiyi Giriniz : ");
        sayi1 = scan.nextInt();
        System.out.print("Ikinci Sayiyi Giriniz : ");
        sayi2 = scan.nextInt();
        System.out.println();

        System.out.println("Lutfen Yapmak Istediginiz Islemi Seciniz : ");
        System.out.println("1-Toplama\n2-Cikarma\n3-Carpma\n4-Bolme");
        System.out.print("Sectiginiz islem : ");
        secim =scan.nextInt();

        if(secim == 1) {
            System.out.println("Toplama islemi sonucu :" + (sayi1 + sayi2));
        }else if(secim == 2) {
            System.out.println("Cikarma islemi sonucu : " + (sayi1 - sayi2) );
            } else if (secim == 3){
            System.out.println("Carpma islemi sonucu : "  + (sayi1*sayi2));
        } else if (secim == 4){
            if(sayi2 == 0){
                System.out.println("Ikinci sayi Sifira esittir ve sonuc belirsizdir !");
            }else{
                System.out.println("Bolme islemi sonucu : " + (sayi1/sayi2));
            }
        }else{
            System.out.println(" Gecersiz bir islem girdiniz...");
        }

    }
}

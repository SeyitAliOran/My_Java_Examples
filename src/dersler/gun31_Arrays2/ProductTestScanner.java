package dersler.gun31_Arrays2;

import java.util.Arrays;
import java.util.Scanner;

public class ProductTestScanner {
    public static void main(String[] args) {
        Scanner veriGir = new Scanner(System.in);
        Product[] sepet = new Product[3];
        System.out.println("Sepete urun ekleme islemleri. Sepet kapasitesi = "+ sepet.length);
        for (int i = 0; i < sepet.length; i++) {
            sepet[i] = new Product();
            System.out.println(i+1 + ". Ürünün bilgilerini giriniz");
            System.out.print("Urunun adini giriniz: ");
            sepet[i].name = veriGir.nextLine();

            System.out.print("Birim fiyatini giriniz: ");
            sepet[i].price = veriGir.nextDouble();

            System.out.print("Urunun (adet/kg/paket) miktarini giriniz: ");
            sepet[i].amount = veriGir.nextDouble();
            veriGir.nextLine(); // double dan sonra nextline geldigi icin hata veriyor o yuzden bunu yazdik
        }
            for (Product urun:sepet){
                urun.showInfo();
                System.out.println("Urunun fiyati = " + urun.fiyatHesapla());
                System.out.println();
            }
            System.out.println();
           // System.out.println("Sepetteki urunlerin toplam fiyat= "+toplamFiyatHesapla(sepet));

            Product ur = new Product();
           System.out.println("Sepetteki urunlerin toplam fiyat= "+ ur.toplamFiyatHesapla(sepet));













       /* int counter= 0;
        for (Product urun : sepet){
            if (urun !=null) { // bu kod sayesinde eger urun eklenmemisse yazdirmaz
                counter++;
                urun.showInfo();
                if (urun.name != null && urun.name.equals("Peynir")){
                    System.out.println("Peynir");
                }
            }
        }
        if (counter >0){
            System.out.println("Sepette "+counter+" adet urun var");
        }else System.out.println("sepet bos");
        */

    }
   /*
          Bu metodu Product class inin icinde yaptiktan sonra da buraya alabiliriz.
        public static double toplamFiyatHesapla(Product[] sepet){
        double toplamFiyat = 0;
        for (Product urun:sepet){
           toplamFiyat += urun.fiyatHesapla();
        }
        return toplamFiyat;

    }
*/
}

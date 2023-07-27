package dersler.gun35_ArrayList;

public class KutuphaneProgrami {
    public static void main(String[] args) {
        Kutuphane kutuphane = new Kutuphane();
        kutuphane.adi = "Halk Kütüphanesi";

        Kitap kitap1 = new Kitap();
        kitap1.adi = "Çalıkuşu";
        kitap1.turu = "Roman";
        kitap1.sayfaSayisi = 250;

        Kitap kitap2 = new Kitap();
        kitap2.adi = "Nar Ağacı";
        kitap2.turu = "Roman";
        kitap2.sayfaSayisi = 300;

        Yazar yazar1 = new Yazar();
        Yazar yazar2 = new Yazar();
        yazar1.adi = "Reşat Nuri Gültekin";
        yazar2.adi = "Deneme yazar";

        Yazar yazar3 = new Yazar();
        yazar3.adi = "Nazan Bekiroğlu";

        kitap1.yazarEkle(yazar1);
        kitap1.yazarEkle(yazar2);
        kitap2.yazarEkle(yazar3);

        //   kitap1.printInfo();

        kutuphane.kitapEkle(kitap1);
        kutuphane.kitapEkle(kitap2);
        // kutuphane.kitapListesi();
        kutuphane.kitapListesiDetay();
    }
}
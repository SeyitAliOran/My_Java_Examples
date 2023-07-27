package dersler.gun35_ArrayList;

import java.util.ArrayList;

public class Kutuphane {
    String adi;
    ArrayList<Kitap> kitaplar = new ArrayList<>();

    public void kitapEkle(Kitap kitap){
        kitaplar.add(kitap);
    }

    public void kitapListesiDetay(){
        System.out.println(adi +" kitap listei.");
        for (Kitap kitap : kitaplar){
            kitap.printInfoDetay();
            System.out.println("---------------------");
        }
    }
    public void kitapListesi(){
        System.out.println(adi +" kitap listei.");
        for (Kitap kitap : kitaplar){
            kitap.printInfo();
            System.out.println("---------------------");
        }
    }
}
package dersler.gun35_ArrayList;

import java.util.ArrayList;

public class Kitap {
    String adi;
    String turu;
    int sayfaSayisi;
    ArrayList<Yazar> yazarlar = new ArrayList<>();

    public void yazarEkle(Yazar yazar){
        yazarlar.add(yazar);
    }
    public void printInfoDetay(){
        System.out.println("Adı          : " + adi);
        System.out.println("Türü         : " + turu);
        System.out.println("Sayfa sayısı : " + sayfaSayisi);
        System.out.println("----------------------------");
        System.out.println("Yazarları    : ");
        for (int i = 0; i < yazarlar.size(); i++) {
            System.out.print(i + 1  + ".Yazarı : ");
            yazarlar.get(i).printInfo();
        }
    }
    public void printInfo(){
        System.out.println("Adı          : " + adi);
        System.out.println("Türü         : " + turu);
        System.out.println("Sayfa sayısı : " + sayfaSayisi);
    }
}

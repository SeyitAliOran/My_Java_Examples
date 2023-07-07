package dersler.gun20_Methods2;

public class KDVHesapla {
    public static void main(String[] args) {
        String urun = "Elma";
        int miktar = 3;
        double fiyati = 15;

        kasaBaslik();
        System.out.println();
        kdvHesapla(urun,miktar,fiyati);
        kdvHesapla("Peynir", 1,185);
        kdvHesapla("Zeytin", 2,90);
        kdvHesapla("Ekmek",2,7.5);
        kdvHesapla("Karpuz", 5, 5.95);
        kdvHesapla("Deterjan", 1,179);
        kdvHesapla("Dis macunu", 2,120);
        System.out.println();
        kasaAltlik();
    }
    public static void kdvHesapla(String urunAd, int miktari, double fiyat){

        double kdliFiyat = (miktari * fiyat) * 1.18;

        System.out.println(urunAd + " - "+miktari+" kg -" + kdliFiyat);
    }
    public static void kasaBaslik(){
        System.out.println("EuroTech Market");
        System.out.println("---------------");
        System.out.println("Iyi alisverisler dileriz");
        System.out.println();
    }
    public static void kasaAltlik(){
        System.out.println("Bizi tercih ettiginiz icin tesekkur ederiz");
        System.out.println("Tekrar alisveris icin bekleriz");
    }
}

package dersler.gun19_Methods1;

public class Google {

    public static void main(String[] args) {

        // Google git
        // Arama yap
        // Urunu bul ve sitesine git
        // Urunu sepete ekle
        // Odeme yap
        // Onay kodu al
        // Odemeyi tamamla
        // Google geri don

        System.out.println("Teste basla");
        google();
        System.out.println("Testi bitir");
    }


    public static void google(){
        System.out.println("Google Websitesine gidildi");
        aramaYap();
    }
    static public void aramaYap(){
        System.out.println("Arama yapildi");
        System.out.println("Arama sonuclarindan urune tiklandi");
        urunSitesineGit();
    }
    static public void urunSitesineGit(){
        System.out.println("Urun sitesine gidildi");
        System.out.println("Urun secildi");
        sepeteEkle();
    }
    public static void sepeteEkle(){
        System.out.println("Urun sepete eklendi");
        odemeYap();
    }
    public static void odemeYap(){
        System.out.println("Musteri hesap bilgileri girildi");
        onayKoduAL();
        System.out.println("Onay kodu girildi");
        System.out.println("Odeme tamamlandi");
        System.out.println("Google'a geri donuldu");
    }
    public static void onayKoduAL(){
        System.out.println("Onay kodu alindi");
    }

}

package GrupCalismalari.Hesaplama;

public class Dikdortgen extends hesaplamalar{
    @Override
    void alanHesapla() {
        int dikdortgenAlan = uzunluk*yukseklik;
        System.out.println(dikdortgenAlan);
    }

    @Override
    void cevreHesapla() {
    int dikdortgenCevre = 2*(uzunluk*yukseklik);
        System.out.println(dikdortgenCevre);
    }
    public void showInfo() {
        System.out.println(super.uzunluk);
        System.out.println(super.yukseklik);
        alanHesapla();
        cevreHesapla();
    }
}

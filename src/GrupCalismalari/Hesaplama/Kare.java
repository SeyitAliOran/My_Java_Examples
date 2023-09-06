package GrupCalismalari.Hesaplama;

public class Kare extends hesaplamalar{
    int kareAlan;
    int kareCevre;
    @Override
    void alanHesapla() {
    kareAlan = uzunluk*uzunluk;
        System.out.println(kareAlan);
    }

    @Override
    void cevreHesapla() {
    kareCevre = uzunluk *4;
        System.out.println(kareCevre);
    }

    @Override
    public void showInfo() {
        System.out.println(super.uzunluk);
        alanHesapla();
        cevreHesapla();
    }
}

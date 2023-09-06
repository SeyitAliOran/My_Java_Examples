package GrupCalismalari.Hesaplama;

public class Cember extends hesaplamalar{

    @Override
    void alanHesapla() {
    double daireAlan = PI*radius*radius;
        System.out.println(daireAlan);
    }

    @Override
    void cevreHesapla() {
    double cevre = 2 * PI*radius;
        System.out.println(cevre);
    }
    public void showInfo() {
        System.out.println(super.radius);
        alanHesapla();
        cevreHesapla();
    }
}

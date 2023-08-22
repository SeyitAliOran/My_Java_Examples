package Ders_Tekrar.Galeri;

public class GaleriTest {
    public static void main(String[] args) {
        Araba araba = new Araba();
        Araba araba1 = new Araba();
        Araba araba2 = new Araba();

        araba.setIsim("Toyota");
        araba.setModel("Auris");
        araba.setRenk("Siyah");
        araba.setVites("Otomatik");
        araba.setYil(2022);
        araba.setFiyat(33.534);

        araba1.setIsim("Toyota");
        araba1.setModel("Corolla");
        araba1.setRenk("Beyaz");
        araba1.setVites("Duz");
        araba1.setYil(2021);
        araba1.setFiyat(30.233);

        araba2.setIsim("Mazda");
        araba2.setModel("3");
        araba2.setRenk("Beyaz");
        araba2.setVites("Duz");
        araba2.setYil(2019);
        araba2.setFiyat(32.255);

        Galeri.addAraba(araba);
        Galeri.addAraba(araba1);
        Galeri.addAraba(araba2);
        Galeri.showArabalar();
        System.out.println();
        Galeri.listByfiyat(20.232,35.233);

    }
}

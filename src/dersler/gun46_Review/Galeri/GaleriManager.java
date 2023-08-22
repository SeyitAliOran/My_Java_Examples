package dersler.gun46_Review.Galeri;

public class GaleriManager{
    public static void main(String[] args) {

        Araba araba1 = new Araba("Toyota","Camry","af131","H-1234-De");
        Araba araba2 = new Araba("Honda","City","as12314","BF-Sr-2010");
        Galeri.addAraba(araba1);
        Galeri.addAraba(araba2);

        Galeri.showArabalar();
        System.out.println();
        Galeri.listByName("Toyota");
    }
}

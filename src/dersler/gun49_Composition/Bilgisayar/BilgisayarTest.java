package dersler.gun49_Composition.Bilgisayar;

public class BilgisayarTest {
    public static void main(String[] args) {
        Boyut boyut = new Boyut(35,15,30);
        Kasa kasa = new Kasa("Nirvana","Dell","ELektrik",boyut); // once boyut obje create ettik sonra buraya yazabildik
        // Cozunurluk cozunurluk = new Cozunurluk(25,20);
        Monitor monitor = new Monitor("MSI","Dell",24,new Cozunurluk(20,25));// direkt burada new keword ile obj olusturabiliriz.
        Anakart anakart = new Anakart("SD22","Intel",2,3,"v2.222");
        Bilgisayar bilgisayar = new Bilgisayar(anakart,monitor,kasa);
        bilgisayar.getKasa().calistir();
        System.out.println(bilgisayar.getMonitor().getCozunurluk().getBoy());
        bilgisayar.getAnakart().programYukle("Java");
    }
}

package dersler.gun55_Review.AbstractClass.Sekil;

public class Main {
    public static void main(String[] args) {
        // Sekil sekil = new Sekil(); ---> // Abstract classlar dan object olusturulamaz
        Kare kare = new Kare();
        kare.ciz();
        kare.kaydir(2,4);
        kare.sinirlariCiz();

        Sekil.alanHesapla(12.2); // Abstract classlarda static method olustururarak Sekil classinda ki methoda ulasabiliriz.
    }
}

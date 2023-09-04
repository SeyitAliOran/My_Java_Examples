package dersler.gun55_Review.AbstractClass.Sekil;

public abstract class Sekil {

    public abstract void ciz();
    // Absract methodlar da body yoktur.Detaylar burada yazilmaz
    // Abstract classin icerisinde abstract method olmak zorunda degil
    // Fakat normal Classlarin icerisinde abstract methodlar olusturamayiz
    // Abstract methodlarda private ve final kullanilamaz
    // public abstract void cizme();
    public void kaydir(int x, int y) {
        System.out.println("Moving shape to " + x + " - " + y);
    }
    public final void sinirlariCiz(){ // Final method olusturulabilir fakat  ve alt classlar da override edilemez
        System.out.println("Drawing borders");
    }

    public static void alanHesapla(double area){
        System.out.println("Area : " + area);
    }
}

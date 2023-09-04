package dersler.gun55_Review.AbstractClass.Sekil;

public class Kare extends Sekil{
    @Override
    public void ciz() {
        System.out.println("Kare ciziliyor");
    }
    public void kaydir(int a, int b) {
        System.out.println("Moving shape to " + a + " - " + b);
    }
}

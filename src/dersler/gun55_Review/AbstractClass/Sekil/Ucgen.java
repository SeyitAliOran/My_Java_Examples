package dersler.gun55_Review.AbstractClass.Sekil;

public class Ucgen extends Sekil{

    @Override
    public void ciz() {
        System.out.println("Ucgen ciziliyor");
    }
    public void kaydir(int c, int d) {
        System.out.println("Moving shape to " + c + " - " + d);
    }

}

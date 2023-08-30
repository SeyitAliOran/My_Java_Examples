package dersler.gun52_Interface_Enum_Record.Interface.Sekil;

public class SekilTest {
    public static void main(String[] args) {
        Dikdortgen dikdortgen = new Dikdortgen(5,5);
        dikdortgen.drawDefault();
        System.out.println("dikdortgen.getArea() = " + dikdortgen.getArea());
        System.out.println("dikdortgen.gerPerimeter() = " + dikdortgen.getPerimeter());
        Sekil.merhabaStatic();
        System.out.println("Sekil.MAX_LENGTH = " + Sekil.MAX_LENGTH);
        System.out.println("Sekil.PI = " + Sekil.PI);
    }
}

package dersler.gun54_Polymorphism2.CallingMethod;

public class Sekil {
    public void ciz(){
        System.out.println("Sekil ciziliyor");
    }
public void sekilOlustur(){
    System.out.println("Sekil olusturuluyor.");
}
}
class Kare extends Sekil{
    @Override
    public void ciz() {
        System.out.println("Kare ciziliyor.");
    }
}
class Ucgen extends Sekil{
    @Override
    public void ciz() {
        System.out.println("Ucgen ciziliyor.");
    }
}
class Daire extends Sekil{
    @Override
    public void ciz() {
        System.out.println("Daire ciziliyor.");
    }
}

class Test{
    public static void main(String[] args) {

        Sekil sekil = new Sekil();
        sekil.ciz(); // Sekil ciziliyor.
        sekil.sekilOlustur();

        Sekil sekil1 = new Kare();
        sekil1.ciz(); // Kare ciziliyor.
        sekil1.sekilOlustur(); // Overriding olmadigi icin Paretn classda ki sekilOlustur Methodu cagirilir.

        Sekil sekil2 = new Ucgen();
        sekil2.ciz(); // Ucgen ciziliyor.
        sekil2.sekilOlustur(); // Overriding olmadigi icin Paretn classda ki sekilOlustur Methodu cagirilir.

        Sekil sekil3 = new Daire();
        sekil3.ciz(); // Daire ciziliyor.
        sekil3.sekilOlustur(); // Overriding olmadigi icin Paretn classda ki sekilOlustur Methodu cagirilir.


    }
}

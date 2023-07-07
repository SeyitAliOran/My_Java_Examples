package dersler.gun7_TypeCasting;

public class ExplicitCasting {
    public static void main(String[] args) {
        double myDouble = 9.78;
        int myInt = (int) myDouble; // Explicit Casting - Manual Conversion
        double myDouble2 = myInt; // Hafizada ki kaybedilen 0.78 degeri tekrar geri getirilemiyor.

        System.out.println("myDouble = " + myDouble); // 9.78
        System.out.println("myInt = " + myInt); // 9
        System.out.println("myDouble2 = " + myDouble2);

        double d = 100.4;
        long l = (long) d; // Data kaybi soz konusu.
        int i = (int) l; // Herhangi bir data kaybi olmamasina ragmen her halukarda java degiskenin degismesini istiyor.

        System.out.println("d = " + d);
        System.out.println("l = " + l);
        System.out.println("i = " + i);


    }
}

package dersler.gun22_Method_Overloading;

public class Overloading {
    public static void main(String[] args) {
        // Method Overload kullanilarak uc farkli data turune sahip sayilarin
        // ortalamasini alan bir program yaziniz.

       ortalama(3, 4, 5);
       ortalama(3.3, 4.5, 4.3);
       ortalama(1211231, 251235, 1355235);

    }

    public static int ortalama(int a, int b, int c) {
        int ortalamaNumara1 = (a+b+c)/3;
        System.out.println("Integer ortalama = " + ortalamaNumara1);
        return ortalamaNumara1;
    }

    public static double ortalama(double a, double b, double c) {
        double ortalamaNumara2 = (a+b+c)/3;
        System.out.println("Double ortalama  = " + ortalamaNumara2);
        return ortalamaNumara2;
    }

    public static long ortalama(long a, long b, long c) {
        long ortalamaNumara3 = (a+b+c)/3;
        System.out.println("Long ortalama    = " + ortalamaNumara3);
        return ortalamaNumara3;
    }

}

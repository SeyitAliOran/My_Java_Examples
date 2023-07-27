package dersler.gun34_WrapperClasses;

public class Autoboxing_Unboxing {
    public static void main(String[] args) {
        // Autoboxing --> primitive to wrapper
        Integer num1 = 123;
        int num2 = 12;
        Integer num3 = num2;
        System.out.println("num1 = " + num1);
        System.out.println("num2 = " + num2);
        System.out.println("num3 = " + num3);
        System.out.println();

        // Unboxing --> wrapper to primitive
        Double d1 = new Double(20.5);
        double d2 = d1;
        System.out.println("d1 = " + d1);
        System.out.println("d2 = " + d2);
        System.out.println();

        int n1 = new Integer(123); // wrapper to primitive // Unboxing // sertifika sinavlarinda gelebilir...
        Integer n2 = new Integer(123); // No boxing
        int n3 = n2; // wrapper to primitive // Unboxing
        Integer n4 = Integer.valueOf(123); // No boxing
        // Double n5 = n4; --> wrapper classlar arasi dogrudan autocasting mumkun degil...
        Double n5 = n4.doubleValue(); // bu sekilde int deger double cevirilir...
    }
}

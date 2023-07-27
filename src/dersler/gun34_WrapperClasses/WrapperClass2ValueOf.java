package dersler.gun34_WrapperClasses;

public class WrapperClass2ValueOf{
    public static void main(String[] args) {
        int num1 = 5;
        Integer num2 = Integer.valueOf(5);
        Integer num3 = Integer.valueOf("5");
        Integer num4 = Integer.valueOf(num1);
        System.out.println("num1 = " + num1);
        System.out.println("num2 = " + num2);
        System.out.println("num3 = " + num3);
        System.out.println("num4 = " + num4);
        System.out.println( num2 == num3); // true ---> ayni objeyi refere etmesede ayni degeri refere ediyor bu yüzden true donuyor...
        System.out.println(num2.equals(num3)); // true

        System.out.println();

        float f1 = 20.5f;
        Float f2 = Float.valueOf(20.5f);
        Float f3 = Float.valueOf(20.5f);
        Float f4 = Float.valueOf(f1);
        System.out.println("d1 = " + f1);
        System.out.println("d2 = " + f2);
        System.out.println("d3 = " + f3);
        System.out.println("d4 = " + f4);
        System.out.println();

        char c1 = 'c';
        Character c2 = Character.valueOf('c');
        Character c3 = Character.valueOf(c1);
        // Character c4 = new Character("c"); // string olarak atanamaz.
        System.out.println("c1 = " + c1);
        System.out.println("c2 = " + c2);
        System.out.println("c3 = " + c3);
        System.out.println();

        short s1 = 10;
        // Byte b2 = new Byte(10); // Error byte deger atama boyle yapilamaz----casting yapilmasi gerekiyor...
        Short s3 = Short.valueOf((short) 10);
        Short s4 = Short.valueOf("10");
        Short s5 = Short.valueOf(s1);
        System.out.println("b1 = " + s1);
        System.out.println("b3 = " + s3);
        System.out.println("b4 = " + s4);
        System.out.println("b5 = " + s5);
        System.out.println();

        boolean bool = false;
        Boolean bool2 = Boolean.valueOf(false);
        Boolean bool3 = Boolean.valueOf("falses"); // String atamalarda true veya false disinda bir karakter girildiginde otomatik false deger alir.
        Boolean bool4 = Boolean.valueOf(bool);
        System.out.println("bool = " + bool);
        System.out.println("bool1 = " + bool2);
        System.out.println("bool2 = " + bool3);
        System.out.println("bool3 = " + bool3);
        System.out.println("bool4 = " + bool4);
    }
}

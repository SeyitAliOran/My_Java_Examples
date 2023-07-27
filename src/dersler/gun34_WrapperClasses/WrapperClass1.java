package dersler.gun34_WrapperClasses;

public class WrapperClass1{
    public static void main(String[] args) {
        System.out.println("Integer degerler");
        int num1 = 5;
        Integer num2 = new Integer(5);
        Integer num3 = new Integer("5");
        Integer num4 = new Integer(num1);
        System.out.println("num1 = " + num1);
        System.out.println("num2 = " + num2);
        System.out.println("num3 = " + num3);
        System.out.println("num4 = " + num4);
        System.out.println(num1 + num2 + num3 + num4);
        System.out.println( num2 == num3); // false
        System.out.println(num2.equals(num3)); // true
        System.out.println();
        System.out.println("Double degerler");
        double d1 = 20.5;
        Double d2 = new Double(20.5);
        Double d3 = new Double(20.5);
        Double d4 = new Double(d1);
        System.out.println("d1 = " + d1);
        System.out.println("d2 = " + d2);
        System.out.println("d3 = " + d3);
        System.out.println("d4 = " + d4);
        System.out.println(d1+d2+d3+d4);
        System.out.println();

        char c1 = 'c';
        Character c2 = new Character('c');
        Character c3 = new Character(c1);
        // Character c4 = new Character("c"); // string olarak atanamaz.
        System.out.println("c1 = " + c1);
        System.out.println("c2 = " + c2);
        System.out.println("c3 = " + c3);
        System.out.println();

        byte b1 = 10;
       // Byte b2 = new Byte(10); // Error byte deger atama boyle yapilamaz----casting yapilmasi gerekiyor...
        Byte b3 = new Byte((byte)10);
        Byte b4 = new Byte("10");
        Byte b5 = new Byte(b1);
        System.out.println("b1 = " + b1);
        System.out.println("b3 = " + b3);
        System.out.println("b4 = " + b4);
        System.out.println("b5 = " + b5);
        System.out.println();

        boolean bool = false;
        Boolean bool2 = new Boolean(false);
        Boolean bool3 = new Boolean("falses"); // String atamalarda true veya false disinda bir karakter girildiginde otomatik false deger alir.
        Boolean bool4 = new Boolean(bool);
        System.out.println("bool = " + bool);
        System.out.println("bool1 = " + bool2);
        System.out.println("bool2 = " + bool3);
        System.out.println("bool3 = " + bool3);


    }
}

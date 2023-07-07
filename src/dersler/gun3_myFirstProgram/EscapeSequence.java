package dersler.gun3_myFirstProgram;

public class EscapeSequence {
    public static void main(String[] args) {
        // \ "" karakterleri yazmak icin kullanilir.
        System.out.println("Sampiyon \"Fener\"");


        // \\ \ karakteri yazdirmak icin kullanilir
        System.out.println("Ben\\Sen\\O\\\\\\\\");

        // \t bir tab kadar bosluk yazdirmak icin kullanilir
        System.out.println("Ahmet\tALi");

        // \n satir atlamak icin kullanilir
        System.out.println("Merhaba\nNasilsin\nTesekkurler\nIyiyim");

        // \b Onceki karakteri siler
        System.out.println("Onceki karakteri\b siler");

        // \r kendinden onceki metnin tumunu siler
        System.out.println("Kendinden onceki\r siler");
    }
}

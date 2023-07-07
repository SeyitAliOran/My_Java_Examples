package dersler.gun04_Variables_1;

public class VAriables_1 {
    public static void main(String[] args) {
        System.out.println("Variables in Java Programming Language. ");
        System.out.println("----------------------------------------");

        // Variable declaration
        // DataType variableName;
        System.out.println();
        System.out.println("Declaration and assigning values to variables");

        String name; // Declere ettim
        char sube;
        short okulNo;

        name = "Hasan"; //String dataType cift tirnak kullanilir
        sube = 'C';     // character dataType tek tirnak  kullanilir
        okulNo = 32767; // short dataType -32768 ile 32767 arasinda deger alabilir tirnaksiz kullan
        System.out.println("Adi     : " + name);
        System.out.println("Sube    : " + sube);
        System.out.println("Okul No : " + okulNo);

        System.out.println("---------------");
        name = "Ayse";
        sube = 'A';
        okulNo = 123;
        System.out.println("Adi     : " + name);
        System.out.println("Sube    : " + sube);
        System.out.println("Okul No : " + okulNo);
    }
}

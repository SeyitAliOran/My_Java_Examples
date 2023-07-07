package dersler.gun7_TypeCasting;

public class DataLoss {
    public static void main(String[] args) {

        byte b;
        int i = 257;
        // byte ramge is between -128 ... 127
        // and starts counting from scratch -128
        b = (byte) i; // 256 lik bir deger kaybi oldu.
        System.out.println("int deger i = " + i + ", byte deger b = " + b);

        double d = 325.6;

        // b % 256 = 69
        // Data Loss = Range + Data Type (ondaliktan kaynaklanan (0.6))
        b = (byte) d;
        System.out.println("double deger d = " + d + ", byte deger b = " + b);


    }
}

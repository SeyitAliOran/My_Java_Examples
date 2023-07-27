package dersler.gun07_TypeCasting;

public class TypePromotion {
    public static void main(String[] args) {

        // 2 short degeri aritmetik islemde kullaniliyorsa otomatik olarak int e cevirir.
        short firstNumber = 10;
        short secondNumber = 20;

        // 2 Shortu toplayip tek shorta atayamiyoruz. Illa short olarak devam etmek istiyorsak (short) kullanilabilir.
        short sum = (short) (firstNumber+secondNumber);

        long sum1 = firstNumber + secondNumber;
        System.out.println(" sum = " + sum);
        System.out.println("sum1 = " + sum1);

        byte b1= 2;
        byte b2 = 5;
        // byte b3 = b1 * b2; otomatik int ceviriliyor
        int b3 = b1 * b2;
        // short b4 = b1*b2; otomatik int ceviriliyor
        byte b5 = (byte) (b1*b2); // int cevirmek istemiyorsak (byte) eklenir.

        System.out.println("b3 = " + b3);
        System.out.println("b4 = " + b5);

    }
}

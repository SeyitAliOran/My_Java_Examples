package dersler.gun7_TypeCasting;

public class CastingToChar {
    public static void main(String[] args) {

        // Her sayiya denk gelen arka planda bir harf veya karakter vardir.
        int num = 67;
        char ch = (char) num;
        System.out.println("ch = " + ch); // `C`

        int num2 = ch; // Implicit Casting - Otomatik donusturme
        System.out.println("num2 = " + num2);

        char ch2 = 'A';
        int num3 = ch2;
        System.out.println("num3 = " + num3); // 65 (arka planda ki ASCII degeri)

        /* boolean can not be converted to any data type.
        boolean b = true;
        int i = b;
        char ch3 = b; */



    }
}

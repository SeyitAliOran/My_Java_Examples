package dersler.gun05_Variables_2;

public class VariableDeclaration {
    public static void main(String[] args) {
        System.out.println("Variable Declaration");
        boolean flag; // Declaration (tanimlama)
        flag = true; //Assignment    (atama)
        boolean gectiMi = true; // Declaration and Assignment (Tanimlama ve degisken atama tek satirda yapilabilir)
        byte age = 0; // Declaration and Assignment, initialisation ( Bslangic degeri atama) her zaman baslangic degeri ata

        System.out.println("Yasi =" + age);
        double itemOne = 12.5; // Kullanilmasi tavsiye edilen degisken tanimlama ornegi
        // double 1item = 3.45; legal kullanim degil
        double $itemFour = 4.56; // legal - not recommended. We can start only ($) , (_) and alphabet.
        int ITEMONE = 12; // legal but not recommended
        int ItemOne = 11; // legal but not recommended Kelimenin baslangicini buyuk harf ile baslama!!!!!
        // Case sensitive -- java buyuk kucuk harf uyumunu gozetir. T
        // Bir defa tanimlanan degisken tekrar tanimlanamaz.

       //  double ItemOne = 12; Veri tipi degisse bile ayni degisken ismi tekrar kullanilamaz

        int sayiA,sayiB,sayiC; // legal bir degisken atama
        // int numer, double UniPrice; // illegal bu sekilde degisken atama yapilamaz.
        int number1; double faizOrani; // yan yana degisken atama yapilabilir - but not recommended.

        byte sira1 = 10, sira2 = 25 , sira3 = 0; // legal ayni degerler oldugu icin yan yana yazilmasi daha uygun













    }
}

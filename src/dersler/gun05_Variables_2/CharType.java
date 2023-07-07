package dersler.gun05_Variables_2;

public class CharType {
    public static void main(String[] args) {
        System.out.println("char type example");
        char harf ='A';//char veri tipinde birden fazla karakter veya sembol yazilamaz. Char da '' tek tirnak kullan
        String harfStr = "BCDE"; // String ayni zamanda bir class oldugu icin beyaz ve ilk harfi buyuk yazilir.

        System.out.println("Harf = " + harf);
        harf = 'Ö';
        System.out.println("Harf = " + harf);


        int harfInt = harf;
        System.out.println(harfInt + 28);
        harfInt = harf + 32; // harf = C degeri oldugu icin 1 eklendiginde D yi atar.
        // bir buyuk harfe 32 eklenirse kucuk harfini verir
                harf = (char) harfInt;
        System.out.println(harf);
        harf =32;
        System.out.println(harf);

        harf = 8; //Ascii tablosunda ki 8 Backspace 1 karakter siler
        System.out.println("Merhaba" + harf + "Dunya");

        harf =10; // Ascii tablosunda ki 10 sayisi ozel komut olarak bir alt satira gecer.
        System.out.println("Merhaba" + harf + "Dunya");

//char veri tipini anlatan detay. Sayilar belli sembolleri tanimlar. Char dunyadaki butun sembolleri karsilar
        for (int i = 0; i <10000; i++) {
            System.out.print(i+ "-"+(char)i+ " ");
            if((i % 25) ==0) {
                System.out.println();
            }
        }
        harf = 9999;
        System.out.println("harf = " + harf);
    }
}

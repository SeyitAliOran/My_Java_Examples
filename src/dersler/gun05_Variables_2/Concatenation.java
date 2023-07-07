package dersler.gun05_Variables_2;

public class Concatenation {
    public static void main(String[] args) {
        int age = 25;
        String firstName = "no name";
        String lastName = "no last name";
        String firstAndLastName = " ";

        firstName = "Ahmet";
        lastName = "Falanca";

        System.out.print(firstName);
        System.out.println(" " + lastName);
        System.out.println(firstName + " " + lastName);

        firstAndLastName = firstName + " " + lastName;
        System.out.println(firstAndLastName);

        int sayiA = 5; // degiskenlere aciklama yazilabilir
        int sayiB = 10;
        int toplam = 0;

        toplam = sayiA + sayiB; // + operatörü aritmetik toplama islemi yapar
        System.out.println("Toplam =" + toplam);

        System.out.println("Toplam =" + sayiA + sayiB); // 1- "Toplam = 5" + sayiB ----> 2- "Toplam =510"

        System.out.println(sayiA + "sayisi" + sayiB);

        System.out.println("Toplam = " + toplam); // Toplam = 15;

        System.out.println("Toplam =" + (sayiA + sayiB)); // Toplam =15; Parantez icinde ki once yazdirilir
        System.out.println(sayiA+sayiB +" sonuc budur"); // 5+10 = 15---> 15 + "sonucu budur" = 15 sonucu budur
        System.out.println((sayiA+sayiB) +" sonuc budur"); // hesaplama soladan saga dogru baslar. tirnak icinde yazilan deger String tir

        System.out.println("Türkiyen'nin" + " " + "baskenti " + "\"Ankara\"dir.");

        System.out.println(firstName + " " + lastName + " " + age + " yasindadir.");

    }
}

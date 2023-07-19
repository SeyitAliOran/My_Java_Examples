package dersler.gun27_Review;

import java.util.Scanner;

public class SayilarinToplami {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Lutfen 3 farkli sayi giriniz!");

        // Kullanicidan 3 farkli deger alirken
        // Her birinden sonra 'enter' kullanacagi gibi
        // Her birinden sonra 'space' kullanarak da ayni satirda tum degerleri almak mümkün...
        double sayi1 = sc.nextDouble();
        double sayi2 = sc.nextDouble();
        double sayi3 = sc.nextDouble();

        double toplamSayi = sayi1+sayi2+sayi3;
        System.out.println("toplamSayi = " + toplamSayi);

    }
}

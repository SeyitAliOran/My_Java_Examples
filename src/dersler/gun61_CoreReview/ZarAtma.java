package dersler.gun61_CoreReview;

import java.util.Random;
import java.util.Scanner;

public class ZarAtma {
    public static void main(String[] args) {

        // Kullanicidan 2 ile 12 arasinda bir sayi aliniz
        // Daha sonra iki zar atarak kulllanicinin verdigi sayiya
        // kac defa zar atarak ulastigimizi gosteren bir method yaziniz

        System.out.println("Lutfen 2 ile 12 arasinda bir rakam giriniz!...");
        Scanner sc = new Scanner(System.in);
        int sum = sc.nextInt();

        System.out.println(sum + " rakamina " + diceSum(sum) + " adet zar atisindan sonra ulastiniz");

    }

    public static int diceSum(int sum) {
        Random r1 = new Random();
        Random r2 = new Random();
        int zar1;
        int zar2;
        int counter = 0;

        if (sum > 1 && sum <= 12) {

            do {
                zar1 = r1.nextInt(1, 7);
                zar2 = r2.nextInt(1, 7);
                System.out.println(zar1 + " ve " + zar2 + " = " + (zar1 + zar2));
                counter++;
            } while (sum != zar1 + zar2);

        } else {
            System.out.println("Girdiniz rakam belirlenen sinirlar icerisinde degildir");
        }

        return counter;
    }
}

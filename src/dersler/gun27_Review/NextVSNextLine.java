package dersler.gun27_Review;

import java.util.Scanner;

public class NextVSNextLine {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Lutfen bir deger giriniz...");

        String veri = sc.next(); // Merhaba
        // Merhaba Nasilsin?

        // next() ve nextLine() methodunun ardisik kullanimina dikkat!!!!

//        System.out.println("Lutfen bir deger daha giriniz...");
//        String veri2 = sc.nextLine();

        // String veri = sc.nextLine(); // Merhaba
        // Merhaba Nasilsin?

        System.out.println("veri = " + veri);

    }
}

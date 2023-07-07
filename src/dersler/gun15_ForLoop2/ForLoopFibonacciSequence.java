package dersler.gun15_ForLoop2;

import javax.xml.parsers.SAXParser;

public class ForLoopFibonacciSequence {
    public static void main(String[] args) {
        //Fibonacci 3 -> 0 1 1
        //Fibonacci 5 -> 0 1 1 2 3

        // kendisinden onceki sayi 2 sayinin toplami kendisine esit olan sayi dizileri
        int sayi1 = 0;
        int sayi2 = 1;
        int toplam = 0;

        int fiboSayi = 7;

        // toplam  = sayi1 +sayi2
        // sayi1 = sayi2
        // sayi2 = toplam

        for (int i = 0; i < fiboSayi; i++) {
            System.out.print(sayi1 + " ");
            toplam  = sayi1 +sayi2;
            sayi1 = sayi2;
            sayi2 = toplam;
        }
    }
}

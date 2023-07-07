package Ders_Tekrarlarim;

import java.util.Scanner;

public class ForLoopFaktoryel {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Lutfen bir sayi giriniz: ");
        int sayi = scanner.nextInt();
        int faktoryel = 1;
        String sonuc = sayi + " != ";
        System.out.print(sonuc);

        for (int i = sayi; i >= 1; i--) {
            faktoryel *= i;
            if (i != 1) {
                System.out.print(i + " * ");
            } else {
                System.out.print(i + " = ");
            }

        }
        System.out.println(faktoryel);
    }
}

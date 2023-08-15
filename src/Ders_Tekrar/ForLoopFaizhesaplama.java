package Ders_Tekrar;

import java.util.Scanner;

public class ForLoopFaizhesaplama {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double anaPara = 0;
        double faizOrani = 0;
        double kar = 0;
        int ay = 0;
        /*kar = anaPara * faizOrani /100;
        anaPara = anaPara + kar;
         */
        System.out.print("Lutfen Bakiyenizi Giriniz : ");
        anaPara = scanner.nextDouble();

        System.out.print("Kac ay icin hesaplama yapilacak : ");
        ay = scanner.nextInt();
        System.out.print("Faiz oranini giriniz : ");
        faizOrani = scanner.nextDouble();

        for (int i = 1; i <= ay; i++) {
            kar = anaPara * (faizOrani /100);
            anaPara +=kar;
        }
        System.out.println("Bakiye : " + anaPara);
        System.out.println("Aylik odenecek para : " + (anaPara/ay));
    }
}

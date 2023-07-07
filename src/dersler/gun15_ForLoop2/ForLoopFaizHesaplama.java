package dersler.gun15_ForLoop2;

import java.util.Scanner;

public class ForLoopFaizHesaplama {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        double anaPara = 0;
        double faizOrani = 0;
        double kar = 0;
        int ay =  0;
       /* kar = anaPara * faizOrani / 100;
        anaPara = anaPara + kar;*/

        System.out.print("Lutfen bakiyenizi giriniz : ");
        anaPara = input.nextDouble();

        System.out.print("Kac ay icin hesaplama yapalim? : ");
        ay = input.nextInt();

        System.out.print("Faiz oranini giriniz : ");
        faizOrani = input.nextDouble();

        for (int i = 1; i <= ay ; i++) {
            kar = anaPara * faizOrani / 100;
            anaPara = anaPara + kar;
        }
        System.out.println("Bakiye : " + anaPara);
        System.out.println("Aylik odenecek para = "+ (anaPara / ay));
    }
}

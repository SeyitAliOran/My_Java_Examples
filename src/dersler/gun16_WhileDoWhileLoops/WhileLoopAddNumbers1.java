package dersler.gun16_WhileDoWhileLoops;

import java.util.Scanner;

public class WhileLoopAddNumbers1 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int sayi = 0;
        int toplam = 0;
        int counter = 0;
        boolean devam = true;
        while (devam) {
            counter++;
            System.out.print("Klavyeden bir tam sayi giriniz : ");
            sayi = input.nextInt();
            if (sayi == 0) {
                devam = false;
            }
            toplam += sayi;
            if (counter % 10 == 0) {
                System.out.println(counter + "---> Ara toplam = " + toplam);
            }
        }
        System.out.println("Genel Toplam = " + toplam);
    }
}

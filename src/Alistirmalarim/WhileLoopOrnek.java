package Alistirmalarim;

import java.util.Scanner;

public class WhileLoopOrnek {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int toplam = 0;
        int input;
        while (true) {
            System.out.print("Lutfen bir sayi giriniz : ");
            input = scan.nextInt();

            if (input % 2 == 1) {
                toplam += input;
            }
            if (input < 0) {
                System.out.println("Program bitti cunku negatif sayi girdiniz");
                break;
            }
        }
        System.out.println("girilen tek sayilar toplami : " + toplam);

    }
}


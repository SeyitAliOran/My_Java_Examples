package dersler.gun16_WhileDoWhileLoops;

import java.util.Scanner;

public class WhileLoopAddNumbers {
    public static void main(String[] args) {
        // Klavyeden girilen bir tam sayiya kadar olan tam sayilarin toplamini ekrana yazdiran program yaziniz
        Scanner input = new Scanner(System.in);
        int sayi = 0;
        int toplam = 0;
        int i = 0;

        System.out.print("Bir sayi giriniz : ");
        sayi = input.nextInt();

        while (i < sayi){
            toplam += i;
            i++;
            if (i %100 == 0){ // bu kod ile ara toplam alabiliyoruz
                System.out.println(i + " --> Ara toplam : "+ toplam);
            }
        }
        System.out.println("0-" + sayi+" araligindaki sayilarin toplami "+toplam);

    }
}

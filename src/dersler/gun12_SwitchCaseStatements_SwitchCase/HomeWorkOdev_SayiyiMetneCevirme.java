package dersler.gun12_SwitchCaseStatements_SwitchCase;

import java.util.Scanner;

public class HomeWorkOdev_SayiyiMetneCevirme {
    public static void main(String[] args) {
        Scanner sayiGir = new Scanner(System.in);
        int sayi;
        System.out.print("Bir sayi giriniz : ");
        sayi = sayiGir.nextInt();
        System.out.println();

        switch (sayi) {
            case 1:
                System.out.println("Bir");
                break;
            case 2 :
                System.out.println("Iki");
                break;
            case 3:
                System.out.println("Uc");
                break;
            case 4:
                System.out.println("Dört");
                break;
            case 5:
                System.out.println("Bes");
                break;
            default:
                System.out.println("Gecersiz sayi");

        }
    }
}

package Ders_Tekrarlarim;

import java.util.Scanner;

public class SwitchCaseHesapMakinesi {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Lutfen bir islem operatörü giriniz...("+",\"-\",\"*\",\"/\",) : ");
        String operator = scanner.nextLine();
        System.out.print("Lutfen 1. sayiyi giriniz... : ");
        int sayi1 = scanner.nextInt();
        System.out.print("Lutfen 2. sayiyi giriniz... : ");
        int sayi2 = scanner.nextInt();
        int sonuc = 0;
        switch (operator){
            case "+":
                sonuc = sayi1 + sayi2;
                break;
            case "-":
                sonuc = sayi1 - sayi2;
                break;
            case "*":
                sonuc = sayi1 * sayi2;
                break;
            case "/":
                if (sayi2 !=0) {
                    sonuc = sayi1 / sayi2;
                }
                break;
            default:
                System.out.println("Yanlis bir operatör girdiniz....");
        }
        System.out.println("Sonuc = " + sonuc);
    }
}

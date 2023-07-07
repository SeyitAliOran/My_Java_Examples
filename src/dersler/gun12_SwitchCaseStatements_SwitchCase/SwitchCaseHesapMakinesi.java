package dersler.gun12_SwitchCaseStatements_SwitchCase;

import java.util.Scanner;

public class SwitchCaseHesapMakinesi {
    public static void main(String[] args) {
        Scanner islemOpr = new Scanner(System.in);
        Scanner sayiGir = new Scanner(System.in);

        String islemOperatoru = "";
        int sayi1 = 0;
        int sayi2 = 0;
        int sonuc = 0;

        System.out.println("Hesap makinesi");
        System.out.println("--------------");

        System.out.println("Islem operatorleri : '+', '-','*','/' ");
        System.out.print("Islem operatorunu giriniz : ");
        islemOperatoru = islemOpr.nextLine(); // Satir oku

        System.out.print("1. sayiyi giriniz : ");
        sayi1 = sayiGir.nextInt();

        System.out.print("2. sayiyi giriniz : ");
        sayi2 = sayiGir.nextInt();


        switch (islemOperatoru){
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
                System.out.println("Yanlis bir operator girdiniz!!!");
        }
        if(sayi2 ==0 && islemOperatoru.equals("/")){
            System.out.println(" Bir sayinin 0'a bolunmesi tanimsizdir");
        } else System.out.println( sayi1 + " " + islemOperatoru + " " + sayi2 + " = " + sonuc);

        }
    }


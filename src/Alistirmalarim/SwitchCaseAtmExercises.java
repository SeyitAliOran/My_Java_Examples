package Alistirmalarim;

import java.util.Scanner;

public class SwitchCaseAtmExercises {
    /*
    - bakiye degeri lazim
    - islem secme degeri lazim
    - miktar degeri ekle
     */
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        double bakiye = 1000;
        double miktar;

        System.out.println("\n1. Bakiye goruntuleme...");
        System.out.println("2. Para yatirma...");
        System.out.println("3. Para cekme... ");
        System.out.println("4. Sistemden cikis...\n");
        System.out.print("Bir secenek secin : ");
        int islem = scan.nextInt();

        switch(islem){
            case 1 :
                System.out.println("Bakiye durumu : " + bakiye + "tl dir.");
                break;
            case 2 :
                System.out.print("Yatirilacak miktari giriniz : ");
                miktar = scan.nextDouble();
                bakiye += miktar;
                System.out.println("Son bakiye durumu : " + bakiye + " tl dir. ");
                break;
            case 3 :
                System.out.print("Cekilecek miktari giriniz : ");
                miktar = scan.nextDouble();
                System.out.println();
                System.out.println(bakiye>=miktar ? bakiye -= miktar : "Maalesef yetersiz bakiye...\n");
                System.out.println("Son bakiye : " + bakiye + " tl dir. ");
                break;
            case 4 :
                System.out.println("Sistemden cikiliyor...");
                break;
        }

    }
}

package Alistirmalarim;

import java.util.Scanner;

public class IfElseAtmExercises {
    /*
    - bakiye degeri lazim
    - islem secme degeri lazim
    - miktar degeri ekle
     */
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        double bakiye = 1000;
        double miktar;
        System.out.println();
        System.out.println("1. Bakiye goruntuleme...");
        System.out.println("2. Para yatirma...");
        System.out.println("3. Para cekme... ");
        System.out.println("4. Islemi iplat et...\n");
        System.out.print("Bir secenek secin : ");
        int islem = scan.nextInt();

        if (islem == 1) {
            System.out.println("Hesapta kalan bakiyeniz : " + bakiye + " tl dir.");

        }else if(islem == 2){
            System.out.print("Yatirilicak miktari giriniz : ");
            miktar = scan.nextDouble();
            bakiye +=miktar;
            System.out.println("Hesaptaki son bakiyeniz : " + bakiye + " tl dir.");

        } else if (islem == 3) {
            System.out.print("Cekilecek miktari giriniz : ");
            miktar = scan.nextDouble();
            if(miktar<=bakiye){
                bakiye -=miktar;
                System.out.println("Hesaptaki son bakiyeniz : " + bakiye + " tl dir.");
            }else{
                System.out.println("Yeterli bakiyeniz yoktur");
            }

        }else if ( islem == 4){
            System.out.println("Sistemden ciktiniz...");

        }else {
            System.out.println("Islem iptal edildi...");
        }

    }
}

package dersler.gun25_Reading_User_Input_Scanner;

import java.util.Scanner;

public class SayilarinOrtalamasi {
    public static void main(String[] args) {
        // Klavyeden girilen 3 sayinin ortalamasini hesaplayan bir program yaziniz...

        Scanner sc = new Scanner(System.in);
        double ortalama = 0;

        /*System.out.print("1. sayiyi giriniz : ");
        double sayi1 = sc.nextDouble();
        System.out.print("2. sayiyi giriniz : ");
        double sayi2 = sc.nextDouble();
        System.out.print("3. sayiyi giriniz : ");
        double sayi3 = sc.nextDouble();
        ortalama = (sayi1+sayi2+sayi3)/3;
        System.out.print("Ortalama = " + ortalama);
*/
        System.out.print("3 adet sayiyi giriniz : ");
        double sayi1 = sc.nextDouble();
        double sayi2 = sc.nextDouble();
        double sayi3 = sc.nextDouble();
        ortalama = (sayi1+sayi2+sayi3)/3;
        System.out.print("Ortalama = " + ortalama);

    }
}

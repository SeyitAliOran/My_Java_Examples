package Alistirmalarim;
import java.sql.SQLOutput;
import java.util.Scanner;

public class SwitchCase {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int sayi;
        System.out.print("Bir sayi giriniz : ");
        sayi = input.nextInt();

        switch (sayi) {
            case 1:
                System.out.println("Sayi 1 e esittir...");
                break;
            case 2 :
                System.out.println("Sayi 2 ye esittr...");
                break;
            case 3:
                System.out.println("Sayi 3 e esittir...");
                break;
            default:
                    System.out.println("Gecersiz bir sayi girdiniz....");

        }



    }
}

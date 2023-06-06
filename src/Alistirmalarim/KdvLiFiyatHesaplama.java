package Alistirmalarim;

import java.util.Scanner;

public class KdvLiFiyatHesaplama {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        double tutar,kdvLiFiyat, kdvOrani = 0.18;
        System.out.print("Urunun Fiyatini girin : ");
        tutar = input.nextDouble();
        kdvLiFiyat = tutar + (tutar * kdvOrani);
        System.out.println("Urunun KDV`li Fiyati : " + kdvLiFiyat);

    }
}

package Alistirmalarim;

import java.util.Scanner;

public class KarsilastirmaOperatorleri {
    public static void main(String[] args) {

        /* Karsilastirma Operatorleri sonucu TRUE yada FALSE olarak verir.
           - Esitlik : a==B
           - Esit degil : a!=b
           - Buyuktur : a>b
           - Kucuktur : a<B
           - Buyuk Esittir : a>==b
           - Kucuk Esittir : a<==b
            */

        int a =10;
        int b=5;
        boolean sonuc = (a==b);
        System.out.println(sonuc + "\n");

        boolean sonuc1= a>b;
        System.out.println("sonuc1 = " + sonuc1);

        Scanner input = new Scanner(System.in);
        int c,d;
        System.out.println("Input c degerini girin");
        c = input.nextInt();
        System.out.println("Input d degerini girin");
        d = input.nextInt();
        boolean sonuc2 = a == b;
        System.out.println("sonuc2 = " + sonuc2);


    }
}

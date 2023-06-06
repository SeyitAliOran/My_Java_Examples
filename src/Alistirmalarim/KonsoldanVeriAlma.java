package Alistirmalarim;

import java.util.Scanner;

public class KonsoldanVeriAlma {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in); // Kullanici tarafindan veri girilmesini saglar.

       int a,b;
        System.out.println("A Sayisini Girin :");
        a = input.nextInt();
        System.out.println("B Sayisini Girin :");
        b = input.nextInt();
        System.out.println("a = " + a);
        System.out.println("b = " + b);
        System.out.println(" ");
        double c;
        System.out.println("Double Turunden Sayi Girin :");
        c = input.nextDouble();
        System.out.println("c = " + c);
        System.out.println(" ");

        String str;

        System.out.println("Bir Yazi Girin :");
        str = input.nextLine();
        System.out.println("Girilen yazi :" + str);

    }
}

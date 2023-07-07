package Alistirmalarim;

import java.util.Scanner;

public class WhileLoopFarkliOrnekler {
    public static void main(String[] args) {
       /* Scanner scan = new Scanner(System.in);

        int k = 1;
        System.out.print("Lutfen bir sayi giriniz : ");
        int input = scan.nextInt();
        while (k <= input){
            System.out.println(k);
            k *=2;
        }
        System.out.println();
        System.out.println();

        */

        // ornek 2 : Faktoriyel hesaplama
        Scanner scan = new Scanner(System.in);
        System.out.print("Faktoriyel sayisini giriniz : ");
        int f = scan.nextInt();
        int sonuc = 1;
        while(f > 0 ){
            sonuc *= f;
            f--;
        }
        System.out.println("sonuc = " + sonuc);
    }
}

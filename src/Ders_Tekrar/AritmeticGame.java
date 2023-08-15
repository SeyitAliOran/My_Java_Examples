package Ders_Tekrar;

import java.util.Scanner;

public class AritmeticGame {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int soruSayisi =0;
        int cevap =0;
        int yanlisCevapSayisi =0;
        int dogruCevapSayisi =0;

        System.out.print("Kac adet soru olusturmammi istersiniz? : ");
        soruSayisi = scanner.nextInt();
        int counter = 0;
        while (counter < soruSayisi){
            int sayi1 = (int) (Math.random() * 100+1);
            int sayi2 = (int) (Math.random() * 100+1);
            counter++;

            System.out.println(counter + " .soru ----> " + sayi1 + " + " + sayi2 + " =?");
            System.out.print("Cevaniniz ----> ");
            cevap = scanner.nextInt();

            if ((sayi1 + sayi2) == cevap){
                System.out.println("Cevabiniz dogru");
                dogruCevapSayisi ++;
            }else{
                System.out.println("Cevabiniz yanlis");
                yanlisCevapSayisi++;
            }
        }
        System.out.println("Dogru cevap sayisi: " + dogruCevapSayisi);
        System.out.println("Yanlis cevap sayisi: " + yanlisCevapSayisi);
    }
}

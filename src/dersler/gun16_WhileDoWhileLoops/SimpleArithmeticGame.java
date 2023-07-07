package dersler.gun16_WhileDoWhileLoops;

import java.util.Scanner;

public class SimpleArithmeticGame {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int soruSayisi = 0;
        int cevap = 0;
        int yanlisCevapSayisi = 0;
        int dogruCevapSayisi = 0;


        System.out.print("Kac adet soru olusturmami istersin ? : ");
        soruSayisi = input.nextInt();
        int counter = 0;
        while (counter < soruSayisi ){
            int sayi1 = (int) (Math.random() * 1000 +1); // rastgele sayi olusturdu
            int sayi2 = (int) (Math.random() * 1000 +1); // rastgele sayi olusturdu
            counter++;

            System.out.println(counter + " . soru ----> " + sayi1 + "+" + sayi2 + " = ?");
            System.out.print("Cevabiniz ---> ");
            cevap = input.nextInt();

            if((sayi1 + sayi2) == cevap){
                System.out.println("Cevabiniz dogru");
                dogruCevapSayisi++;
            }else {
                System.out.println("Cevabiniz yanlis!!!");
                yanlisCevapSayisi++;
            }
        }
        System.out.println("Dogru cevap sayisi : " + dogruCevapSayisi);
        System.out.println("Yanlis cevap sayisi : " + yanlisCevapSayisi);
    }
}

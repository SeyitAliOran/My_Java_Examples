package Ders_Tekrarlarim;

import dersler.gun31_Arrays2.Quiz;

import java.util.Scanner;

public class ArrayQuizTest {
    public static void main(String[] args) {
        System.out.println("Sinav zamani...");

        String soru1 = "1. Almanyanin baskenti asagidakilerden hangisidir?\n" +
                "(a) Berlin\n" +
                "(b) Dusseldorf\n" +
                "(c) Bayern\n" +
                "(d) Köln";
        String soru2 = "1. Almanya kac eyaletten olusmaktadir?\n" +
                "(a) 15\n" +
                "(b) 13\n" +
                "(c) 17\n" +
                "(d) 18";
        ArrayQuiz[] sorular = new ArrayQuiz[2];
        sorular[0] =  new ArrayQuiz();
        sorular[0].soru = soru1;
        sorular[0].cevap = "a";

        sorular[1] =  new ArrayQuiz();
        sorular[1].soru = soru2;
        sorular[1].cevap = "c";
        sinavSonucu(sorular);
    }
    public static void sinavSonucu(ArrayQuiz[] sorular){
        Scanner veriGir = new Scanner(System.in);
        int dogruCevapSayisi  =0;
        for (ArrayQuiz soru: sorular) {
            System.out.println(soru.soru);
            System.out.print("Lütfen cevabinizi giriniz: ");
            String cevabim = veriGir.nextLine();
            if (soru.cevap.equals(cevabim)){
                dogruCevapSayisi++;
            }
        }
        System.out.println("Dogru cevap sayiniz: " + dogruCevapSayisi+ "/" + sorular.length);
    }
}

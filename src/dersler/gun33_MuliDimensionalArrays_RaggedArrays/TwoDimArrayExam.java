package dersler.gun33_MuliDimensionalArrays_RaggedArrays;

import java.util.Arrays;

public class TwoDimArrayExam {
    public static void main(String[] args) {
        //Answers of 8 students --- answer[8][10]
        char[][] answers = {
                {'A', 'B', 'A', 'C', 'C', 'D', 'E', 'E', 'A', 'D'}, //1.Öğrenci Cevapları
                {'D', 'B', 'A', 'B', 'C', 'A', 'E', 'E', 'A', 'D'}, //2.Öğrenci Cevapları
                {'E', 'D', 'D', 'A', 'C', 'B', 'E', 'E', 'A', 'D'}, //3.Öğrenci Cevapları
                {'C', 'B', 'A', 'E', 'D', 'C', 'E', 'E', 'A', 'D'}, //4.Öğrenci Cevapları
                {'A', 'B', 'D', 'C', 'C', 'D', 'E', 'E', 'A', 'D'}, //5.Öğrenci Cevapları
                {'B', 'B', 'E', 'C', 'C', 'D', 'E', 'E', 'A', 'D'}, //6.Öğrenci Cevapları
                {'B', 'B', 'A', 'C', 'C', 'D', 'E', 'E', 'A', 'D'}, //7.Öğrenci Cevapları
                {'D', 'B', 'E', 'C', 'C', 'D', 'E', 'E', 'A', 'D'}  //8.Öğrenci Cevapları
        };

        //Answer Key of 10 questions
        char[] keys = {'D','B','D','C','C','D','A','E','A','D'};
        System.out.println("Öğrencilerin sınav sonuçlarının değerlendirilmesi");
        System.out.println("-------------------------------------------------");

        System.out.println("Cevap Anahtarı = " + Arrays.toString(keys));
        System.out.println("--------------------------------------------------");
        for (int ogrenci = 0; ogrenci < answers.length; ogrenci++) {
            System.out.println("Öğrencinin cevapları = " + Arrays.toString(answers[ogrenci]));
            int dogruCevapSayisi = 0;
            for (int i = 0; i < answers[ogrenci].length; i++) {
                if(answers[ogrenci][i] == keys[i]){
                    dogruCevapSayisi++;
                }
            }
            System.out.println(ogrenci + 1 + ".Öğrencinin doğru cevap sayısı : " + dogruCevapSayisi);
        }
    }
}

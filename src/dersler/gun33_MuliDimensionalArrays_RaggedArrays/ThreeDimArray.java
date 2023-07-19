package dersler.gun33_MuliDimensionalArrays_RaggedArrays;

import java.util.Arrays;

public class ThreeDimArray {
    // 2 ogrencinin 2 dersine ait her ders ucun 2 not olan program ogrenciNotlari[ogrenci][dersler][notlar]
    public static void main(String[] args) {
        //2 öğrencinin 2 dersine ait her ders için 2 not---> 3 boyutlu bir dizi ogrenciNotlari[ogrenciler][dersler][notlar]
        int[][][] ogrenciNotlari = new int [2][2][2];

        ogrenciNotlari[0][0][0] = 75;//1.Öğrencinin 1.dersinin 1. notu
        ogrenciNotlari[0][0][1] = 80;//1.Öğrencinin 1.dersinin 2. notu
        ogrenciNotlari[0][1][0] = 100;//1.Öğrencinin 2.dersinin 1. notu
        ogrenciNotlari[0][1][1] = 56;//1.Öğrencinin 2.dersinin 2. notu

        ogrenciNotlari[1][0][0] = 45;//2.Öğrencinin 1.dersinin 1. notu
        ogrenciNotlari[1][0][1] = 25;//2.Öğrencinin 1.dersinin 2. notu
        ogrenciNotlari[1][1][0] = 75;//2.Öğrencinin 2.dersinin 1. notu
        ogrenciNotlari[1][1][1] = 48;//2.Öğrencinin 2.dersinin 2. notu

        for (int ogrenci = 0; ogrenci < ogrenciNotlari.length; ogrenci++) {
            System.out.println(ogrenci+1 + ". Öğrenci");
            for (int ders = 0; ders < ogrenciNotlari[ogrenci].length; ders++) {
                System.out.println("---------------");
                System.out.println(ders + 1 + ".Ders");
                System.out.println("Notlar : ");
                for (int notlar = 0; notlar < ogrenciNotlari[ogrenci][ders].length; notlar++) {
                    System.out.println(notlar + 1 + ".Not : " + ogrenciNotlari[ogrenci][ders][notlar]);
                }
            }
            System.out.println("**************************");
        }

        System.out.println("For each ile yazdırma");
        for (int[][] dersler : ogrenciNotlari){
            System.out.println("Öğrencinin notları...");
            for(int[] notlar: dersler){
                for(int not : notlar){
                    System.out.print(not + " ");
                }
                System.out.println();
            }
            System.out.println();
        }

        System.out.println("Arrays.deepToString() metodu ile yazdırma");
        System.out.println(Arrays.deepToString(ogrenciNotlari));
    }
}

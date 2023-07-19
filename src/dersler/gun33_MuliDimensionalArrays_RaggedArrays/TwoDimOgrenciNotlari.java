package dersler.gun33_MuliDimensionalArrays_RaggedArrays;

import java.util.Arrays;

public class TwoDimOgrenciNotlari {
    public static void main(String[] args) {
        int[] ogrenci1;
        ogrenci1 = new int[]{34,6,78};
        int[] ogrenci2 = {60,80,100};
        int[] ogrenci3 = {25,60,50};
        int[] ogrenci4 = {50,35,100};
        int[] ogrenci5 = {45,40,80};

        System.out.println(Arrays.toString(ogrenci1));

        //İki boyutlu 5 satırdan ve her satırı 3 kolondan oluşan bir dizi tanımladık
        int[][] ogrenciler = new int[5][3];

        ogrenciler[0] = new int[]{34, 67, 89}; //1. satırına başlangıç değerleri atanarak veri assign ettik
        ogrenciler[1] = ogrenci2; //Daha önceden tanımlana tek boyutlu bir diziyi assign ettik

        ogrenciler[2][0] = 70; //2. indexteki öğrencini 1. vize notu
        ogrenciler[2][1] = 45; //2. indexteki öğrencini 2. vize notu
        ogrenciler[2][2] = 100; //2. indexteki öğrencini 3. vize notu

        System.out.println(Arrays.deepToString(ogrenciler));


        //ogrenci5 tek boyutlu dizinin elemanlarınu for loop ile ekrana yazdırma
        for (int i = 0; i < ogrenci5.length; i++) {
            System.out.println(ogrenci5[i]);
        }

        //ogrenciler iki boyutlu dizinin elemanlarını for loop ile ekrana yazdırma

        for (int satir = 0; satir < ogrenciler.length; satir++) {
            // System.out.println(ogrenciler[satir]);
            for (int notlar = 0; notlar < ogrenciler[satir].length; notlar++) {
                System.out.print(ogrenciler[satir][notlar] + ",");
            }
            System.out.println();
        }
    }
}

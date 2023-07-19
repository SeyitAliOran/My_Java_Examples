package dersler.gun30_Array;

import java.util.Random;

public class Array {
    public static void main(String[] args) {
        System.out.println("Arrays in Java");
        // Declaration
        int [] sayilar;
        sayilar = new int[3]; // Default values assignment...

        System.out.println("sayilar [0] = " + sayilar[0]);
        System.out.println("sayilar [1] = " + sayilar[1]);

        int [] numbers = new int[5]; // Declaration and assignment with default values (0)
        int [] schoolNumbers = {1123,123,1425,3563}; // Declaration and assignment with parameters
        System.out.println("schoolNumbers[3] = " + schoolNumbers[3]);
        System.out.println("schoolNumbers[1] = " + schoolNumbers[1]);
        System.out.println();

        String[] names = new String[3]; //{null,null,null} String default degeri NULL
        System.out.println("names = " + names[0]);
        System.out.println();

        int[] xyz = new int[3]; // tavsiye edilen tanimlama yöntemi
        int abc[] = new int[3]; // [] array isareti degiskenden sonra da yazilabilir. Tavsiye edilmez

        int[] number1,number2,number3 = new int[3]; // bu sekilde 3 tane dizi tanimlayabiliriz. Hepsi ayni buyuklukte olur.
        int sayilar1[],sayilar2,sayilar4; // burada ARRAY olarak sadece sayilar1[] alir. Tavsiye edilmez.Karisikliga yol acar.
        sayilar1 = new int[3];
        sayilar1[0] = 2;
        sayilar1[1] = 3;
        sayilar1[2] = 1;

        // sayilar1[4] = 5; // hata olusur. Dizi taniminda olmayan sinirlarinin disinda bir elemana deger atanmaya calismis oluruz.

    }
}

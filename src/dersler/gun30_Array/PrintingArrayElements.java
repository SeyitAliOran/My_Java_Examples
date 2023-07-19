package dersler.gun30_Array;

import java.util.Arrays;

public class PrintingArrayElements {
    public static void main(String[] args) {
        // Printing elements of an array

        // bu sekilde fazla sehirleri tanimlamak cok zor oldugu icin ARRAY kullaniyoruz
        String sehir1 = "Ankara";
        String sehir2 = "Istanbul";
        String sehir3 = "Izmir";

        String[] sehirler = new String[20];
        sehirler[0] = "Adana"; // 0. indexi Adana ile degistiriyoruz...
        sehirler[1] = "Adiyaman";
        sehirler[5] = "Amasya";
        System.out.println("sehirler = " + sehirler); // Prints the reference adress of object @119d7047
        System.out.println("sehirler[17] = " + sehirler[5]); // teker teker yazdirma sekli
        System.out.println();

        // for loop kullanarak sehirler icin de bulunan 20 sehiri ekrana yazar
        for (int i = 0; i < sehirler.length; i++) { //  sehirler.length -->sehirler dizisinin boyutunu gosterir...
            //  System.out.println("sehirler = " + sehirler[i]);
            System.out.println("sehirler[" + i + "] = " + sehirler[i]);
        }
        System.out.println();
        //for each loop(Advanced for loop) kullanarak yazdirma. Genelde arrayler de kullanilir...
        for (String sehir : sehirler) {
            if (sehir != null) { // eger sehir null degilse
                if (sehir.equals("Amasya")){
                    System.out.println("sehir = " + sehir.toUpperCase());
                }else {
                    System.out.println("sehir = " + sehir);
                }
            }
        }

        // Arrays classinin .toString metodu ile butun sehirler yzdirilabilir.
        System.out.println(Arrays.toString(sehirler));
    }
}


package dersler.gun35_ArrayList;

import java.util.ArrayList;
import java.util.Arrays;

public class ArrayListAddAndRemove {
    public static void main(String[] args) {
        System.out.println("ArrayList Example - Cars");
        ArrayList <String> arabalar = new ArrayList<>(); // ArrayList util paket oldugu icin import etmek gerekiyor
        int[] sayilar = new int[5]; // array de sadece ozellik olarak length var herhangi bir methodu yok.
        sayilar[0] = 12;
        // Add methodu bize listeye eleman eklemek icin kullanilir
        arabalar.add("Volvo");
        arabalar.add("BMW");
        arabalar.add("Ford");
        arabalar.add("Mazda");
        arabalar.add("Honda");

        System.out.println("Array length= " +sayilar.length); // Printing element of Array
        System.out.println("ArrayList Size= " + arabalar.size());
        System.out.println("Array elemanlar= " + Arrays.toString(sayilar));
        System.out.println("ArrayList elemanlar= " + arabalar); // Printing element of ArrayList
        System.out.println("arabalar.toString() = " + arabalar.toString()); // Printing element of ArrayList with .toString

        //Remove --> methodu bize listeden eleman silmemize yardimci olur
        System.out.println(arabalar.remove("Ford")); // True --> Silinip silinmedigini bize return eder True or False
        System.out.println(arabalar.remove("Murat124")); // False --> Murat124 diye bir aracimiz yok
        System.out.println("After remove method...");
        System.out.println("arabalar = " + arabalar);

        // After .removo(index)...
        System.out.println(arabalar.remove(2)); // 2. index no daki elemani siler ve hangisini sildigini ekrana yazar ---> Mazda
        //  System.out.println(arabalar.remove(44)); --> hata verir. Cunku ArrayList 44 elaman icermiyor
        System.out.println(arabalar.remove(arabalar.size() - 1)); // --> Sondaki elemani siler --- Honda


        // Get Methodu -->ArrayList teki bir elemana erismek icin kullanilir...
        System.out.println(arabalar);
        System.out.println(arabalar.get(1));
        System.out.println(arabalar.get(0));


    }
}

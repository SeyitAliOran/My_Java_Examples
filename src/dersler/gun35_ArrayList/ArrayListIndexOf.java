package dersler.gun35_ArrayList;

import java.util.ArrayList;
import java.util.Arrays;

public class ArrayListIndexOf {
    public static void main(String[] args) {
        ArrayList<String> isimler = new ArrayList<>(Arrays.asList("Mehmet","Ali","Hasan","Kemalettin","Ali","Melike"));
        // Update an elemenet of ArrayList

        System.out.println("Before update : " + isimler);
        System.out.println(isimler.set(0, "Kemal")); // .set metodu ile elamanlari update edebiliyoruz index no ile
        System.out.println("After update : " + isimler);

        //.indexOf() metodu ile elamanin hangi indexte oldugunu buluruz.Eger aradigimiz eleman listede yoksa -1 olur
        int index = isimler.indexOf("Hasan"); // bu sekilde isimler listesinden hasanin index nosunu buluyorz...
        System.out.println(index);
        isimler.set(isimler.indexOf("Hasan"),"Ahmet"); // indexOf ile Hasanin indexini bulup Hasan ile Ahmet i degistiriyoruz.
        System.out.println("After update : " + isimler);
        System.out.println();

        System.out.println(isimler);

        guncelle(isimler,"Mehmet","Kaan");
        System.out.println(isimler);
        System.out.println("Ali ---indexOf :" + isimler.indexOf("Ali"));
        System.out.println("Ali ---indexOf :" + isimler.lastIndexOf("Ali"));


    }

    public static void guncelle(ArrayList liste,String oldValue,String newValue){
        int index = liste.indexOf(oldValue);
        if (index != -1){
            System.out.println(oldValue + " yeni isim " + newValue + " degistirildi");
            liste.set(index,newValue);
        }else {
            System.out.println(oldValue + " ismi ArrayList te yok");
        }
    }

}

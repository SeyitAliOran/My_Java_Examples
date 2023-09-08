package dersler.gun58_CollectionsList.ListArrayList;

import java.util.ArrayList;

public class ArrayListSearch {
    public static void main(String[] args) {
        ArrayList<String> sehirler = new ArrayList<>();
        sehirler.add("Amasya");
        sehirler.add("Istanbul");
        sehirler.add("Canakkale");
        sehirler.add("Corum");
        sehirler.add("Canakkale");
        sehirler.add("Kayseri");
        sehirler.add("Canakkale");

        String search = "";
        search = "Canakkale";
        System.out.println("Sehirler ArrayListinde searching : " + search);
        if (sehirler.contains(search)){ // contains ile arrayliste arama yapiyoruz
            System.out.println(search + " sehri listede var");
            System.out.println("Index no: " + sehirler.indexOf(search)); // ilk rastlanan aramanin index no sunu buluyoruz
            System.out.println("Index no: " + sehirler.lastIndexOf(search)); // son rastlanan aramanin index no sunu buluyoruz
        }else System.out.println(search + " sehri listede yok");
        System.out.println();

        // Arrayliste bulunan butun ayni isimlerin indexini bulacagiz
        int index = 0;
        for (String eleman:sehirler){
            if (eleman.equals("Canakkale")){
                System.out.println("Index no:" + index);
            }
            index++;
        }
        // Kenidimizin olusturdugu metod ile bulduk
        String sonuc = myIndexOf(sehirler,"Istanbul");
        System.out.println("sonuc = " + sonuc);


    }

    // Kendimiz Array listin icinde ki degerlerin indexini bulan method yazdik
    public static String myIndexOf(ArrayList<String >list,String search){
        String result= "";
        int index = 0;
        for (String eleman:list){
            if (eleman.equals(search)){
               result += index + " ";
            }
            index++;
        }
        return result;
    }
}

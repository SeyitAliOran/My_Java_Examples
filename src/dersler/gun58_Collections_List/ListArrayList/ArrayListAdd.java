package dersler.gun58_Collections_List.ListArrayList;

import java.util.ArrayList;
import java.util.Iterator;

public class ArrayListAdd {
    public static void main(String[] args) {

        // Standart ArrayList
        ArrayList<String> sehirler = new ArrayList<>();
        sehirler.add("Amasya");
        sehirler.add("Istanbul");
        sehirler.add("Canakkale");
        
        //Printing the elements of ArrayList
        System.out.println("Printing the elements of ArrayList");
        System.out.println("sehirler = " + sehirler);

        // Traversing an ArrayList classical for loop
        System.out.println("Traversing an ArrayList classical for loop");
        for (int i = 0; i < sehirler.size(); i++) {
            System.out.println(i + ".index of element of ArrayList: " +sehirler.get(i));
        }

        // Traversing an ArrayList advance for each
        System.out.println("Traversing an ArrayList advance for each");
        for (String sehir:sehirler) {
            System.out.println("sehir = " + sehir);
        }
        System.out.println();


        // Traversing with Iterator (Iterator bize arrayin icinde dolasmamizi saglar)
        System.out.println("Traversing with Iterator");
        Iterator itr = sehirler.iterator();
         System.out.println("itr.hasNext() = " + itr.hasNext());
        System.out.println("itr.next() = " + itr.next());
        System.out.println("itr.next() = " + itr.next());
        System.out.println("itr.next() = " + itr.next());
        if (itr.hasNext()) System.out.println("itr.next() = " + itr.next()); // eger itrnin icinde deger varsa yazdirir
      //  System.out.println("itr.next() = " + itr.next()); Dolasacagimiz elemani kalmadi ise hata verir
        System.out.println();




       // While loop ile elemanlari ekrana yazdirabiliyoruz
       while (itr.hasNext()){
            System.out.println("itr = " + itr.next());
        }
         System.out.println(sehirler);
       itr =sehirler.iterator(); // bu sekilde onceden kullandigimiz Iteratörü siler

        // While loop ile bir array listin icinde veya collectionda istedigimiz elemani silebiliriz ama FOR ile yapamayiz
       while (itr.hasNext()){
           if (itr.next().equals("Amasya")) itr.remove();
       }
        System.out.println(sehirler);
        System.out.println();

        // Internal foreach(Isimsiz method) --> diger for each e gore daha hizli calisir.
        // ArrayListin kendi methodu

        System.out.println("Internal foreach");
        sehirler.forEach((eleman)-> System.out.println(eleman));
        System.out.println();

        //Lamda method reference
        System.out.println("Lamda method reference");
        sehirler.forEach(System.out::println);// Tek satirda yazdirma islemi yapiyorsak kullanilir
        System.out.println();

        sehirler.forEach((eleman)-> { // birden fazla satir olacaksa kullanilir
            eleman = eleman.toUpperCase();
            System.out.println(eleman);
        });


    }
}

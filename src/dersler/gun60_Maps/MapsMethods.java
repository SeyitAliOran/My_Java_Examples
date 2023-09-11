package dersler.gun60_Maps;

import java.util.HashMap;
import java.util.Map;

public class MapsMethods {
    public static void main(String[] args) {

        Map<String, Double> items = new HashMap<>();
        items.put("Apple",5.3);
        items.put("Orange",6.5);
        items.put("Banane",8.5);
        items.put("Cherry",9.0);
        System.out.println("items = " + items); // {Apple=5.3, Banane=8.5, Cherry=9.0, Orange=6.5}

        items.put("Apple",7.4); // burada tekrarda key olarak "Apple" ekledik sisteme eklenmis degeri guncelledi
        System.out.println("items = " + items); // {Apple=7.4, Banane=8.5, Cherry=9.0, Orange=6.5}

        items.remove("Apple"); // Apple nesnesini value si ile birlikte sildik.
        System.out.println("items = " + items); // {Banane=8.5, Cherry=9.0, Orange=6.5}

        items.remove("elma"); // listede olmayan nesneyi silmek istedigimiz de hic bir islem yapmaz hatada vermez
        System.out.println("items = " + items);

        // eger uruun yok ise eklemek istiyorsak
        System.out.println(items.putIfAbsent("Banane", 7.9)); //8.5
        System.out.println(items); // eger li bir ifade ile ekleme yaptigimiz icin ekleme yapmaz eski degerini verir

        System.out.println(items.putIfAbsent("Berry", 7.3)); // null (null dondererek ekleme yaptigini gosteriyor)
        System.out.println(items);  // {Banane=8.5, Cherry=9.0, Berry=7.3, Orange=6.5}

        // listede Apple urununun olup olmadigini kontrol ederiz
        // keylerden check ettik
        System.out.println("Apple is in the list? " + items.containsKey("Apple")); // false
        System.out.println("Orange is in the list? " + items.containsKey("Orange")); // true

        // Value lerden check ettik
        System.out.println("Anny item with the following value in the list? " + items.containsValue(10.12)); // false
        System.out.println("Anny item with the following value in the list? " +items.containsValue(7.3)); // true
    }
}

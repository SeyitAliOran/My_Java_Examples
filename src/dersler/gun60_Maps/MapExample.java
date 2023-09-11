package dersler.gun60_Maps;

import java.util.HashMap;
import java.util.Map;

public class MapExample {
    public static void main(String[] args) {
        // put() methodu ile listeye ekleme yapiyoruz
        //   Key    Value
        Map<String,Integer> map = new HashMap<>();
        map.put("A",1);
        map.put("B",2);
        map.put("C",3);
        map.put("D",4);
        System.out.println("map = " + map); // map = {A=1, B=2, C=3, D=4}

        // neyi cagirdigimizi bilmemiz gerekiyor.
        System.out.println("Value of key A: " + map.get("A")); // Value of key A: 1
        System.out.println("Value of key B: " + map.get("B")); // Value of key B: 2
        System.out.println("Value of key C: " + map.get("C")); // Value of key C: 3
        System.out.println("Value of key D: " + map.get("D")); // Value of key D: 4



    }
}

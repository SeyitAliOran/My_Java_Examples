package dersler.gun60_Maps;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.TreeMap;

public class MapClass {
    public static void main(String[] args) {
        // HashMap --> kendi hash degerine gore siralama yapar.
        Map<String,Integer> hashMap = new HashMap<>();
        hashMap.put("Joe",35);
        hashMap.put("Jane",32);
        hashMap.put("Bob",40);
       for (Map.Entry<String,Integer> entry : hashMap.entrySet()){
           System.out.println(entry.getKey() + " | " + entry.getValue());
       }
        //Joe | 35
        //Bob | 40
        //Jane | 32

        System.out.println();

        // LinkedHashMap --> bizim girdigimiz siralamaya gore siralama yapar
        Map<String,Integer> linkedHashMap = new LinkedHashMap<>();
        linkedHashMap.put("Joe",35);
        linkedHashMap.put("Jane",32);
        linkedHashMap.put("Bob",40);
        for (Map.Entry<String,Integer> entry : linkedHashMap.entrySet()){
            System.out.println(entry.getKey() + " | " + entry.getValue());
        }
        //Joe | 35
        //Jane | 32
        //Bob | 40

        System.out.println();

        // LinkedHashMap --> sayilari kucukten buyuge, harfleri A dan Z ye gore kendisi siralar
        Map<String,Integer> treeMap = new TreeMap<>();
        treeMap.put("Joe",35);
        treeMap.put("Jane",32);
        treeMap.put("Bob",40);
        for (Map.Entry<String,Integer> entry : treeMap.entrySet()){
            System.out.println(entry.getKey() + " | " + entry.getValue());
        }
        //Bob | 40
        //Jane | 32
        //Joe | 35

    }
}

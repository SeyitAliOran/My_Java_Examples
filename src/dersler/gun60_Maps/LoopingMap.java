package dersler.gun60_Maps;

import java.util.*;

public class LoopingMap {
    public static void main(String[] args) {
        Map<String,String> capitalCities = new LinkedHashMap<>();
        capitalCities.put("England","London");
        capitalCities.put("Deutschland","Berlin");
        capitalCities.put("France","Paris");
        capitalCities.put("Russia","Moscow");
        capitalCities.put("Türkiye","Ankara");

        // get list of keys / Countries
        System.out.println(capitalCities.keySet()); // set keywordü tekrarlanmamis dizeleri(ulkeleri) donderir

        // get list of values / capital cities
        System.out.println(capitalCities.values());

        System.out.println();

        System.out.println("Printing keys....");
        // iterate etmemizin sebebi istedigimiz manipulasyonlari yaptirmak icin
        for (String country:capitalCities.keySet()){
            System.out.print(country + " | ");
        }

        System.out.println();
        System.out.println();
        System.out.println("Printing values....");
        for (String capital : capitalCities.values()){
            System.out.print(capital + " | ");
        }
        System.out.println();
        System.out.println();
        // 2. yontem
        // Set list i uzerinden de yapabiliriz
        Set<String> countries = capitalCities.keySet();// keyset methodu ile direkt Set e assign edebiliriz
        for (String country : countries){
            System.out.print(country + " | ");
        }
        // 2. yontem
        Collection<String > capitals = capitalCities.values();
        for (String capital : capitals){
            System.out.print(capital + " | ");
        }
        System.out.println();
        System.out.println();
        // How to print keys and values in same for each loop
        // 1. yontem
        for (String country : capitalCities.keySet()){
            System.out.println(country + " | " + capitalCities.get(country));// bu sekilde beraber iterate ediyoruz
        }
        System.out.println();
        System.out.println();

        // 2. yontem
        for (Map.Entry<String,String> capital : capitalCities.entrySet()){
            System.out.println(capital.getKey() + " | " + capital.getValue());
        }

    }
}

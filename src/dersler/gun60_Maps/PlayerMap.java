package dersler.gun60_Maps;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;

public class PlayerMap {
    public static void main(String[] args) {
        ArrayList<String> players = new ArrayList<>();
        players.add("Messi");
        ArrayList<Integer> numbers = new ArrayList<>();
        numbers.add(10);

        // Data türlerine göre ekleme yapmamiz gerekiyor
        Map<Integer, String> playerNumbers = new LinkedHashMap<>();
        playerNumbers.put(10, "Messi");
        playerNumbers.put(7, "Ronaldo");
        playerNumbers.put(9, "Hakan");

        // playerNumbers.put("asd",2); --> yukarida <Integer,String> olarak atandigi icin bu siralama olmasi gerekiyor
        System.out.println("10 numarali formayi giyen futbolcunun ismi : " + playerNumbers.get(10));
        System.out.println("7 numarali formayi giyen futbolcunun ismi  : " +playerNumbers.get(7));
        System.out.println("9 numarali formayi giyen futbolcunun ismi  : " +playerNumbers.get(9));
        System.out.println("9 numarali formayi giyen futbolcunun ismi  : " +playerNumbers.get("Messi")); // null böyle bir deger olmadigindan
        System.out.println("9 numarali formayi giyen futbolcunun ismi  : " +playerNumbers.get(8));  // null böyle bir deger olmadigindan

    }
}

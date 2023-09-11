package dersler.gun60_Maps;

import java.util.HashMap;
import java.util.Map;

public class FrequencyOfWord {
    public static void main(String[] args) {
        String[] words = {"apple", "banana", "apple", "banana", "orange", "banana"};

        // Bir HashMap oluşturun ve String'i anahtar olarak, tekrar sayısını değer olarak kullanın
        Map<String, Integer> wordCountMap = new HashMap<>();

        // Diziyi dolaşarak her kelimenin tekrar sayısını güncelleyin
        for (String word : words) {
            // Eğer kelime daha önce haritada bulunuyorsa, tekrar sayısını artırın
            if (wordCountMap.containsKey(word)) {
                int count = wordCountMap.get(word);
                wordCountMap.put(word, count + 1);
            } else {
                // Eğer kelime daha önce haritada yoksa, yeni bir girdi oluşturun
                wordCountMap.put(word, 1);
            }
        }
        System.out.println("wordCountMap = " + wordCountMap);
    }

    // diger yontem
    /*
     public static void main(String[] args) {

        // Count the number of frequency for each word and map the count using Map
        String [] words = {"apple", "banana", "apple", "banana", "orange", "banana"};

        Map<String,Integer> wordCount = new TreeMap<>();

        for(String word : words){
            Integer count = wordCount.get(word);
            if(count == null){
                count = 0;
            }
            wordCount.put(word, count + 1);
        }

        System.out.println("wordCount = " + wordCount);

    }
     */
}


package dersler.gun59_CollectionQueueSet.Set;

import java.util.TreeSet;

public class TreeSetExample {
    public static void main(String[] args) {
        // TreeSet ve SortedSet
        // object tekrarlarina musade etmiyor
        // 2 tane girilen degerin sadece 1 tanesini listeye ekliyor
        // Kendi icerisin bir siralama yapiyor. Kucukten buyuge dogru yapiyor.
        // String degerkeri Alfabetik siralamaya gore siralar

        TreeSet<String> treeSet = new TreeSet<>();
        treeSet.add("Mavi");
        treeSet.add("Sari");
        treeSet.add("Gri");
        treeSet.add("Yesil");
        treeSet.add("Beyaz");
        treeSet.add("Beyaz");
        treeSet.add("23");
        treeSet.add("22");
        treeSet.add("$");
        treeSet.add("§");

        // Siralamada Once karakterleri sonra sayilar sonra harfler gelir
        System.out.println("treeSet = " + treeSet);
        System.out.println();

        for(String str : treeSet){
            System.out.println(str.hashCode());
        }
        System.out.println();


        TreeSet<Integer> treeSet2 = new TreeSet<>();
        treeSet2.add(23);
        treeSet2.add(24);
        treeSet2.add(22);
        System.out.println("treeSet2 = " + treeSet2);
    }
}

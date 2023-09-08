package dersler.gun59_CollectionQueueSet.Set;

import java.util.*;

public class SetExample {
    public static void main(String[] args) {

        Set<Integer> mySet = new HashSet<>();
        mySet.add(10);
        mySet.add(20);
        mySet.add(30);
        mySet.add(40);
        mySet.add(100);
        mySet.add(100);
        mySet.add(100);
        System.out.println("mySet = " + mySet); // Tekrarlanan sayilar eklenmeyecek
        System.out.println();
        System.out.println("mySet.size() = " + mySet.size()); // 5
        System.out.println();

        List<String > list = Arrays.asList("15","15","a","c","tt","c","r"); // Tekrarlanan sayilar eklenir. Bizim verdigimiz siralamaya gore ekler
        System.out.println("list = " + list); // [15, 15, a, c, tt, c, r]
        System.out.println();

        Set<String> mySet2 = new HashSet<>(list); // list'i mySet2 e ekledik. Kendine gore rastgele siralama yapti
        System.out.println("mySet2 = " + mySet2); // [tt, a, r, c, 15]
        System.out.println();

        TreeSet<Integer> treeSet = new TreeSet<>();
        treeSet.add(500);
        treeSet.add(100);
        treeSet.add(10);
        treeSet.add(5);
        treeSet.add(9000);
        treeSet.add(100);
        System.out.println("treeSet = " + treeSet); // kucukten buyuge siralama yapar ve tekrarlanan sayilara izin vermez
        System.out.println("treeSet.add(10) = " + treeSet.add(10)); // 10 sayisi listede oldugundan ekleyemeyecek ve false donderir
        System.out.println("treeSet = " + treeSet);// [5, 10, 100, 500, 9000]
        System.out.println("treeSet.add(12) = " + treeSet.add(12)); // 12 sayisi listede olmadigindan ekler ve true donderir
        System.out.println("treeSet = " + treeSet); //[5, 10, 12, 100, 500, 9000]


    }
}

package dersler.gun59_CollectionQueueSet.Set;

import java.util.HashSet;

public class HashSetExample {
    public static void main(String[] args) {
        // Hash set
        // bizim gonderdigimiz siraya gore listelemiyor
        // object tekrarlarina musade etmiyor
        // 2 tane girilen degerin sadece 1 tanesini listeye ekliyor
        // sekronize edilmiyor

        HashSet<String> hashSet = new HashSet<>();
        hashSet.add("Mavi");
        hashSet.add("Sari");
        hashSet.add("Gri");
        hashSet.add("Yesil");
        hashSet.add("Beyaz");
        hashSet.add("Beyaz");

        System.out.println("hashSet = " + hashSet);// [Sari, Mavi, Beyaz, Gri, Yesil]--> Beyazi 1 defa listeye ekledi
        for(String str : hashSet){
            System.out.println(str.hashCode());
        }
    }
}

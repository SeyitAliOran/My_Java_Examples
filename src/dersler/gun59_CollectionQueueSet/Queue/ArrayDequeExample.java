package dersler.gun59_CollectionQueueSet.Queue;

import java.util.ArrayDeque;

public class ArrayDequeExample {
    public static void main(String[] args) {
        // Ilk eklenen deger 1. sirayi alir
        // bizim ekledigimiz siraya göre verir
        // Deque ile hem basa hem son ekleme yapabiliyoruz
        // Deque ile hem bastan hem sondan cikarma yapabiliyoruz
        ArrayDeque<Integer> arrayDeque = new ArrayDeque<>();
        arrayDeque.add(20);
        arrayDeque.add(10);
        arrayDeque.add(15);
        arrayDeque.add(5);
        System.out.println("arrayDeque = " + arrayDeque);
        System.out.println(arrayDeque.peekFirst()); // 1. objecti aliriz --> 20
        System.out.println(arrayDeque.peekLast()); // Son sirada ki objecti aliriz --> 5
        System.out.println(arrayDeque); // [20, 10, 15, 5]
        System.out.println();

        System.out.println(arrayDeque.pollFirst()); // ilk objecti sileriz
        System.out.println(arrayDeque); // [10, 15, 5]
        System.out.println();

        System.out.println(arrayDeque.pollLast()); // son objecti sileriz
        System.out.println(arrayDeque); // [10, 15]
        System.out.println();

        arrayDeque.addFirst(30); // ilk nesneye 30 ekledik
        System.out.println(arrayDeque); // [30, 10, 15]
        System.out.println();

        arrayDeque.addLast(29); // son nesneye 29 ekledik
        System.out.println(arrayDeque); // [30, 10, 15, 29]
        System.out.println();

        // clear() ile Listeyi tamamen bosaltiyoruz
        arrayDeque.clear();
        System.out.println(arrayDeque); // []
    }
}

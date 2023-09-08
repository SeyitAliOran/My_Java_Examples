package dersler.gun59_CollectionQueueSet.Queue;

import java.util.PriorityQueue;

public class PriorityQueueExample {
    public static void main(String[] args) {

        // Bizim ekledigimiz objectler listenin icinde data türüne göre dogal siralama ile siralarnir
        // O yuzden ilk giren deger cikmaz.Siralandiktan sonraki ilk deger cikar
        // Sayilarda kucukten buyuge dogru siralama yapar
        // En kucuk numara ilk numaraya yerlesir
        PriorityQueue priority = new PriorityQueue();
        priority.add(20);
        priority.add(15);
        priority.add(5);
        priority.add(50);
        priority.add(25);
        priority.add(35);
        // --> Kucukten buyuge dogru siralama yapiyor
        System.out.println("priority.peek() = " + priority.peek()); // --> 5
        System.out.println(priority.poll()); // ilk sirada ki ni sildik
        System.out.println("priority.peek() = " + priority.peek()); // ilk sirayi ---> 15 aldi
        System.out.println();

        // Dogal harf siralamasi
        PriorityQueue priority1 = new PriorityQueue();
        priority1.add("Aaba");
        priority1.add("Zab");
        priority1.add("Baa");
        priority1.add("Aaaa");
        System.out.println("priority1 = " + priority1); // Kendine göre dogal siralama yapti
        System.out.println("priority.peek() = " + priority1.peek());
        System.out.println(priority1.poll()); // ilk nesneyi sildik [Aaaa]
        System.out.println("priority1 = " + priority1);  //  sonuc --> [Aaba, Zab, Baa]

        // get() method can not be used in order to retrieve objects according to index number
        // because PriorityQueue only gives first object
       // priority1.get(0); dogal siralama yaprigi icin icinden her hangi bir degeri indexe gore alamayiz

    }
}

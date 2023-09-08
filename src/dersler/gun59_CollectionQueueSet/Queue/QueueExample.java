package dersler.gun59_CollectionQueueSet.Queue;

import java.util.Deque;
import java.util.LinkedList;
import java.util.NoSuchElementException;
import java.util.Queue;

public class QueueExample {
    public static void main(String[] args) {
        Queue<String> queue = new LinkedList<>();
        queue.add("Cemil");
        queue.add("Ahmet");
        queue.add("Mehmet");
        queue.add("Beyza");

        // Queue ile ilk giren ilk cikar FirstIn FirstOut
        //First in
        System.out.println("queue = " + queue);

        //First out / removes first element from list
        String name = queue.remove(); // [Cemil] siliniyor
        System.out.println("name = " + name);
        System.out.println("queue = " + queue); // [Ahmet, Mehmet, Beyza]
        System.out.println();

        //First out / removes with poll() first element from list
        name= queue.poll(); // poll() ile de silebiliyoruz --> [Ahmet] siliniyor
        System.out.println("name = " + name);
        System.out.println("queue = " + queue); // [Mehmet, Beyza]

        // peek() ile listenin ilk sirasinda ki objecti goruruz
        name = queue.peek();
        System.out.println("name = " + name); // [Mehmet]
        System.out.println("queue = " + queue);
        System.out.println();

        queue.poll();
        queue.poll();
        System.out.println("queue = " + queue);
        queue.poll(); // Listede bir deger olmamasina ragmen silme isleminde hataya dusmez
        // Listede bir deger olmadigin da remove() ile NoSuchElementException hatasi verir
        // try catch ile de handle edebiliriz
       try{
           queue.remove();
       } catch (NoSuchElementException e){
           System.out.println("Your listis empty : " + e.getMessage());
       }
    }
}

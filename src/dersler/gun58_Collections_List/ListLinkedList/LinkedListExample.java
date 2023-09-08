package dersler.gun58_Collections_List.ListLinkedList;
import java.util.LinkedList;
public class LinkedListExample {
    public static void main(String[] args) {
        LinkedList<String> citiesLinkedList = new LinkedList<>();

        citiesLinkedList.add("Ankara");
        citiesLinkedList.add("Kayseri");
        citiesLinkedList.add("Çanakkale");
        citiesLinkedList.add("Çankırı");
        citiesLinkedList.add("Çanakkale");
        citiesLinkedList.add("İstanbul");
        citiesLinkedList.add("Çanakkale");

        System.out.println("Cities LinkedList.....");
        System.out.println(citiesLinkedList);
        System.out.println();

        System.out.println();
        //Traversing an ArrayList classical for loop
        System.out.println("Traversing an LinkedList with classical for loop");
        for (int i = 0; i < citiesLinkedList.size(); i++) {
            System.out.println(citiesLinkedList.get(i));
        }
        System.out.println();

        System.out.println("Traversing an LinkedList with advanced for loop");
        for (String eleman : citiesLinkedList) {
            System.out.println(eleman);
        }

        citiesLinkedList.addFirst("Ordu");
        System.out.println(citiesLinkedList);
        System.out.println();

        citiesLinkedList.addLast("Mardin");
        System.out.println(citiesLinkedList);

        System.out.println("citiesLinkedList.getFirst() = " + citiesLinkedList.getFirst());
        System.out.println("citiesLinkedList.getLast() = " + citiesLinkedList.getLast());
    }
}

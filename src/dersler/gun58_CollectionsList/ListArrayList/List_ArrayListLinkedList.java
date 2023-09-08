package dersler.gun58_CollectionsList.ListArrayList;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class List_ArrayListLinkedList {
    public static void main(String[] args) {
        // ArrayList yerine direkt LinkedList yazabiliriz.Cunku ayni interface implement ediyor
       //  List<String> liste =new ArrayList<>();
        List<String> liste =new LinkedList<>();
        liste.add("Mavi");
        liste.add("Sari");
        liste.add("Siyah");

        for (String elaman:liste){
            System.out.println("elaman = " + elaman);
        }
        System.out.println();

        // LinkedList in kendi methodlarina ulasmak icin LinkedListe CAST etmemiz gerekiyor
        if (liste instanceof LinkedList<String>){
            ((LinkedList<String>)liste).addFirst("Kirmizi");
        }
        if (liste instanceof LinkedList<String> renk){ //Casting yapmadan bu sekilde de LinkedList e ulasilabilir
            renk.addLast("Turuncu");
        }
        System.out.println("liste = " + liste);
    }
}

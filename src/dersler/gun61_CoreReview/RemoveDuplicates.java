package dersler.gun61_CoreReview;

import dersler.gun54_Polymorphism2.DownCasting.A;

import java.util.ArrayList;
import java.util.Collections;

public class RemoveDuplicates {
    public static void main(String[] args) {

        // Bir listede yer alan String leri sort ederek duplicateleri cikaran bir method yaziniz

        ArrayList<String> names = new ArrayList<>();
        names.add("Mike");
        names.add("Smith");
        names.add("John");
        names.add("Mary");
        names.add("Evan");
        names.add("Mary");
        names.add("Mike");
        names.add("Smith");
        names.add("John");
        names.add("Mary");

        Collections.sort(names);
        System.out.println(removeDuplicates(names));

//        Set<String> unique = new HashSet<>(names);
//        System.out.println("unique = " + unique);

    }

    public static ArrayList<String> removeDuplicates(ArrayList<String> list){
        ArrayList<String> temp = new ArrayList<>();

        for(int i=0; i < list.size(); i++){
            if(temp.size() == 0 || !temp.get(temp.size()-1).equals(list.get(i))){
                temp.add(list.get(i));
            }
        }

        return temp;
    }
}

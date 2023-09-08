package dersler.gun58_CollectionsList.Stack;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Stack;

public class StackReversingArrayList {
    public static void main(String[] args) {
        ArrayList<String> arrColors = new ArrayList<>();

        arrColors.add("Red");
        arrColors.add("Blue");
        arrColors.add("Brown");
        arrColors.add("Yellow");
        arrColors.add("Black");
        arrColors.add("Pink");
        arrColors.add("Green");

        System.out.println("ArrayList colors   : " + arrColors);

        ArrayList<String> reversedArray = new ArrayList<>();

      /*
      //Reversing an ArrayList with Classic for loop
        for (int i = arrColors.size()-1; i >= 0 ; i--) {
            reversedArray.add(arrColors.get(i));
        }
        */
        // System.out.println("Reversed ArrayList : " + reversedArray);


        //Reversing an ArrayList with Stack
        Stack<String> stackColors = new Stack<>();
        for (String eleman : arrColors) {
            stackColors.push(eleman);
        }

        System.out.println("Stack colors       : " + stackColors);
        System.out.println("stackColors.pop() = " + stackColors.pop()); //Getting element on top of the Stack

        Collections.reverse(arrColors);
        System.out.println("ArrayList colors(Reversed): " + arrColors);
    }

}
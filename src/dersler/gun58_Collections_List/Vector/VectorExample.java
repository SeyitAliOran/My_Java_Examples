package dersler.gun58_Collections_List.Vector;

import java.util.List;
import java.util.Vector;

public class VectorExample {
    public static void main(String[] args) {
        List<Integer> vectorList = new Vector<>();
        vectorList.add(1234);
        vectorList.add(126734);
        vectorList.add(122234);
        vectorList.add(34);

        System.out.println(((Vector<Integer>) vectorList).elementAt(0)); //Casting to Vector to reach its own methods
        System.out.println(vectorList.get(0));
        System.out.println();
        System.out.println(vectorList);

        for (Integer eleman : vectorList) {
            System.out.println(eleman);
        }
    }
}
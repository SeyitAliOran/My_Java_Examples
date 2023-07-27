package CodingBath;

import java.util.Arrays;

public class ArrayCommonEnd {
    /*
Given 2 arrays of ints, a and b, return true if they have the same first element or
they have the same last element.
 Both arrays will be length 1 or more.
commonEnd([1, 2, 3], [7, 3]) → true
commonEnd([1, 2, 3], [7, 3, 2]) → false
commonEnd([1, 2, 3], [1, 3]) → true
     */
    public static void main(String[] args) {
        int[] array1= {1,2,3};
        int[] arrays2= {1};
        System.out.println("commonEnd(array1,arrays2) = " + commonEnd(array1, arrays2));
    }
    public static boolean commonEnd(int[] a, int[] b) {
        boolean result = false;
        if (a.length > 1 && b.length >1){
            if ((a[0] == b[0]) && (a[a.length-1] == b[b.length-1])){
                result= true;
            }
        }
        return result;
    }

}

package dersler.gun31_Arrays2;
import java.util.Arrays;
public class ArrayCompare {
    public static boolean karsilastir(int[] dizi1, int[] dizi2) {
        boolean result = true;

        System.out.println("Arrays.toString(dizi1) = " + Arrays.toString(dizi1));
        System.out.println("Arrays.toString(dizi2) = " + Arrays.toString(dizi2));

        if (dizi1 == dizi2) return true; //Both arguments reference same object(Array) in heap therefore they are equal.
        if (dizi1.length != dizi2.length)
            return false; //Arguments(array objects) lengths are not equal therefore they are not equal.

        //If above conditions are not met the for each loop is going to compare both arrays element by element.
        for (int i = 0; i < dizi1.length; i++) {
            if (dizi1[i] != dizi2[i]) {
                System.out.println("Farklı elemanlara rastlanılan index = " + i);
                System.out.println(i + ".indexteki elemanlar ---> " + dizi1[i] + "-" + dizi2[i]);
                System.out.println();
                return false;
            }
        }
        return result;
    }

    public static void main(String[] args) {
        int[] sayilar1 = {1, 2, 3, 4, 5, 9};
        int[] sayilar2 = {1, 2, 3, 4, 5, 8};
        int[] sayilar3 = sayilar2;

        System.out.println("sayilar1 = " + sayilar1);
        System.out.println("sayilar2 = " + sayilar2);
        System.out.println("sayilar3 = " + sayilar3);
        if (sayilar2 == sayilar3) {
            System.out.println("Bu iki Array eşittir");
        } else System.out.println("Eşit değillerdir.");
        System.out.println();

        System.out.println("karsilastir(sayilar1,sayilar3) = " + karsilastir(sayilar1, sayilar3));
        System.out.println("karsilastir(sayilar2, sayilar1) = " + karsilastir(sayilar2, sayilar1));
    }
}

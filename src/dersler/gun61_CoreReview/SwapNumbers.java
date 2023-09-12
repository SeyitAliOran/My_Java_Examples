package dersler.gun61_CoreReview;

import dersler.gun30_Array.Array;

import java.util.Arrays;

public class SwapNumbers {
    public static void main(String[] args) {

        // Verilen bir array icerisinde dizedeki ilk sayi ile son sayinin yerini degistirerek
        // arrayi yeniden duzenleyen olusturan bir method yaziniz

        int [] x = {1, 2, 3, 4}; // 4, 2, 3, 1
        int [] y = {1, 5, 7, 9, 11}; // 11, 5, 7, 9, 1
        int [] z = {54, 34, 87, 16, 90}; // 90, 34, 87, 16, 54

        System.out.println(Arrays.toString(swapArray(x)));
        System.out.println(Arrays.toString(swapArray(y)));
        System.out.println(Arrays.toString(swapArray(z)));

    }

    public static int[] swapArray(int [] arr){
        int temp = arr[0];
        arr[0] = arr[arr.length - 1];
        arr[arr.length - 1] = temp;

        return arr;
    }
}


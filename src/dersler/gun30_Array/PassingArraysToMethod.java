package dersler.gun30_Array;

import java.util.Arrays;

public class PassingArraysToMethod {
    public static void main(String[] args) {
        String[] cars ={"Toyota","Mercedes","Honda","Volvo"};
        printArray(cars);

        int[] numbers ={1,5,6,4};
        printArray(numbers);
        String[] birDizi = reverseArray(cars);
        for (String eleman:
             birDizi) {
            System.out.println(eleman);
        }
        System.out.println();
        System.out.println(Arrays.toString(upperCaseElements(cars))); // cars in icindekileri buyuk harf yazdirma


    }
    public static void printArray(String[] dizi){
        System.out.println("Method is invoked...");
        System.out.println("Printing elements of array...");
        System.out.println("-----------------------------");
        for (String eleman: dizi) {
            System.out.println(eleman);
        }
    }
    public static void printArray(int[] dizi){
        System.out.println("Method is invoked...");
        System.out.println("Printing elements of array...");
        System.out.println("-----------------------------");
        for (int eleman: dizi) {
            System.out.println(eleman);
        }
    }
    public static String[] reverseArray(String[] dizi){ // burada arrayi tersten yazdiriyoruz
        String[] result = new String[dizi.length];
        for (int i = 0,j=result.length-1; i < dizi.length; i++,j--) {
           result[i] = dizi[j];
        }
        return result;
    }
    public static String [] upperCaseElements(String[] dizi){ // buyuk harfe ceviren method
        String[] result = new String[dizi.length];
        for (int i = 0; i < dizi.length ; i++) {
            result[i]= dizi[i].toUpperCase();
        }
        return result;
    }
}

package dersler.gun26_Random_Math_Date_Classes;

import java.util.Random;

public class RandomZarAtma {
    public static void main(String[] args) {
       int sumOfTwoZar = 0;
       int zar1 = 1;
       int zar2 = 1;
       int counter = 0;
       while (sumOfTwoZar !=8){
           counter ++;
           zar1 = zarAt();
           zar2 = zarAt();
           System.out.println("Atis sayisin n  = " + counter);
           System.out.println("zar1 = " + zar1);
           System.out.println("zar2 = " + zar2);
           System.out.println();
           sumOfTwoZar = zar1+zar2;

       }
    }
    public static int zarAt(){
        Random random = new Random();
        return random.nextInt(6)+1; // 1-6 her ikiside dahil sayi üretir
    }
}

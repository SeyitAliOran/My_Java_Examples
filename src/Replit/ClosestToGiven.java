package Replit;

public class ClosestToGiven {
    public static void main(String[] args) {
        int[] array = {1,3,5,9,11};
      int bulunanSayi =  closestToGiven(array,6);
        System.out.println("bulunanSayi = " + bulunanSayi);

    }
    public static int closestToGiven(int[] array,int sayi){
        int bulSayi = 0;
        for (int i = 0; i < array.length-2; i++) {
            if (array[i+1] == sayi){
                bulSayi = array[i+1];
            }
        }
        return bulSayi;
    }
}

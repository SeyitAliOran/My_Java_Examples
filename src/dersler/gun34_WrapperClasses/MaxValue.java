package dersler.gun34_WrapperClasses;

public class MaxValue {
    public static void main(String[] args) {
        // Bir integer array dizisi icerisinde en buyuk degeri wrapper constant
        // kullanarak bulan bir program yaiziniz
        int[] numbers = {934,13414,13412,-35251,4,535,4255};
        System.out.println("maxValue(numbers) = " + maxValue(numbers));
    }
    public static int maxValue(int[] array){

        int max = Integer.MIN_VALUE; // MIN_VALUE en dusuk deger sabit oldugu icin onu max'a atadik...

        /* for loop ile yapimi
        for (int i = 0; i < array.length; i++) {
            if (array[i]>max){
                max = array[i];
            }
        }*/

        // for each ile yapimi
      for (int each: array ){
            if (each>max){
                max = each;
            }
        }
       return max;
    }
}

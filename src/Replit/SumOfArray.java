package Replit;

public class SumOfArray {
    public static void main(String[] args) {
        int [] arr={10,5,25};
        System.out.println(sumOfArray(arr));
    }

    public static int sumOfArray(int[] array){
        int sum = 0;
        for (int i = 0; i < array.length; i++) {
            sum += array[i];
        }
        return sum;
    }
}

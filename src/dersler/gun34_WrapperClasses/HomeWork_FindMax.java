package dersler.gun34_WrapperClasses;
/*
Write a method that can find the maximum number from an int Array
Ex: maxValue(int [] n)
 */
public class HomeWork_FindMax {
    public static void main(String[] args) {
        int[] numbers = {10, 5, 20, 8, 15};
        System.out.println(findMaxInArray(numbers));
    }
    public static int findMaxInArray (int[] array){
        int max = array[0];
        for (int i = 0; i < array.length; i++) {
            if (array[i]>max){
                max = array[i];
            }
        }
        return max;
    }
}

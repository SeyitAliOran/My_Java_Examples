package dersler.gun34_WrapperClasses;
/*
Write a method that can find the minimum number from an int Array
Ex: minValue(int [] n)
 */
public class HomeWork_FindMin {
    public static void main(String[] args) {
        int[] numbers = {10, 5, 20, 8, 15};
        System.out.println(findMinInArray(numbers));
    }
    public static int findMinInArray(int[] array){
        int min = array[0];
        for (int i = 0; i < array.length; i++) {
            if (array[i] < min){
                min = array[i];
            }
        }
        return min;
    }
}

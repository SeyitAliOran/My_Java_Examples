package Replit;

public class LongestString {
    public static void main(String[] args) {
        String[] array = {"aaa", "bbbbb", "whatssupppp"};
        String longest = longestArray(array);
        System.out.println("longest = " + longest);
    }

    public static String longestArray(String[] array) {
        String longest = array[0];
        for (int i = 1; i < array.length; i++) {
            if (array[i].length() > longest.length()) {
                longest = array[i];
            }
        }
        return longest;
    }
}





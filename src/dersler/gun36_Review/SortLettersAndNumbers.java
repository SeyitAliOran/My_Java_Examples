package dersler.gun36_Review;

import java.util.Arrays;

public class SortLettersAndNumbers {
    public static void main(String[] args) {

//        Write a method that can sort Letters and Numbers from alphanumeric String
//        For the following alphanumeric example input String below;
//        we need to split the string into substrings of consecutive letters or numbers, sort the individual
//        string and append them back together.
//        Ex:
//        Input: “DC501GCCCA098911"
//        OutPut: “CD015ACCCG011899"

        String input = "DC501GCCCA098911";
        System.out.println("input = " + input);
        System.out.println("newString = " + sortLettersAndNumbersOfString(input));

    }

    public static String sortLettersAndNumbersOfString(String str) {

        String str2 = "";
        for (int i = 0; i < str.length(); i++) {

            str2 += str.charAt(i);

            if (Character.isAlphabetic(str.charAt(i)) && i < str.length() - 1) { // i nin karakter olup olmadigini kontrol et
                if (Character.isDigit(str.charAt(i + 1))) { // i nin digit olup olmadigini kontrol et
                    str2 += ",";
                }
            }

            if (Character.isDigit(str.charAt(i)) && i < str.length() - 1) {
                if (Character.isAlphabetic(str.charAt(i + 1))) {
                    str2 += ",";
                }
            }
        }

        String[] arr = str2.split(",");

        String newStr = "";

        for (String each : arr) {

            char[] chars = each.toCharArray();

            Arrays.sort(chars);

            for (char eachChar : chars) {
                newStr += eachChar;
            }
        }

        return newStr;
    }
}

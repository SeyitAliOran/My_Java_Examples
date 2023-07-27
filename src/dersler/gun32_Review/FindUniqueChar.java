package dersler.gun32_Review;

public class FindUniqueChar {

    //Write a return method that can find the unique characters from the String
    //SAdece 1 defa tekrar edenleri yazdir....
    //Ex: uniqueChar("DDEECGDDEEEEFGGDCDDM") ==> "FM";
    public static void main(String[] args) {
        String word = "DDEECGDDEEEEFGGDCDDM";
        System.out.println("uniqueChar(word) = " + uniqueChar(word));
        System.out.println();
        System.out.println("Bulunan karakter (DDEECGDDEEEEFGGDCDDM) = " + findNumberOccurrence(word, 'F'));
        for (int i = 0; i < word.length(); i++) {
            System.out.println(word.charAt(i) + " harfi " + findNumberOccurrence(word, word.charAt(i)));
        }
        System.out.println();
        System.out.println("newUniqueNumber(word) = " + newUniqueNumber(word));
    }

    public static String uniqueChar(String str) {
        String result = "";
        int counter = 0;
        for (int i = 0; i < str.length(); i++) {
            for (int j = 0; j < str.length(); j++) {
                if (str.charAt(i) == str.charAt(j)) {
                    counter++;
                }
            }
            if (counter == 1) { // bu yol ile 1 defa tekar edenleri buluyoruz...
                result += str.charAt(i);
            }
            counter = 0;
        }
        return result;
    }

    public static int findNumberOccurrence(String str, char harf) { // harflerin kacar defa tekrarladigini bulan method
        int counter = 0;
        for (int i = 0; i < str.length(); i++) {
            if (str.charAt(i) == harf) {
                counter++;
            }
        }
        return counter;
    }
    public static String newUniqueNumber(String str){
        String result="";
        int counter = 0;
        for (int i = 0; i < str.length(); i++) {
            counter = findNumberOccurrence(str,str.charAt(i));
            if (counter == 1){
                result += str.charAt(i);
            }
            counter = 0;
        }
        return result;
    }
}

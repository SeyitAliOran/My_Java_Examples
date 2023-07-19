package Ders_Tekrarlarim;

public class FrequencyOfChar {
    public static void main(String[] args) {
        String word ="AAABBCDD";
        System.out.println(uniqueChar(word));
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
            if (counter == 3 || counter ==2) { // bu yol ile 1 defa tekar edenleri buluyoruz...
                result += str.charAt(i);
            }
            counter = 0;
        }
        return result;
    }
}

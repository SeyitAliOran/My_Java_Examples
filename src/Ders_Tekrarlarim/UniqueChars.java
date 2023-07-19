package Ders_Tekrarlarim;

public class UniqueChars {
    public static void main(String[] args) {
        String word = "AAABBBCCCDEF";
        System.out.println(uniqueChars(word));
    }
    public static String uniqueChars(String word){
        int counter = 0;
        String result = "";
        for (int i = 0; i < word.length(); i++) {
            for (int j = 0; j < word.length(); j++) {
                if (word.charAt(i) == word.charAt(j)){
                    counter++;
                }
            }
            if (counter == 1){
                result += word.charAt(i);
            }
            counter = 0;
        }
        return result;
    }
}

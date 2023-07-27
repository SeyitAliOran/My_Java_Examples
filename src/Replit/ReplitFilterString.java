package Replit;

public class ReplitFilterString {
    public static void main(String[] args) {
        String s = "(((W&e**_lco73me %t%o co!@$,,<r>e <J>>>$@av```~a777.||}";
        System.out.println(filterString(s));
    }
    public static String filterString(String word){
        String newWord = "";
        for (int i = 0; i < word.length(); i++) {
            if (Character.isAlphabetic(word.charAt(i)) || word.charAt(i) == ' '){
                newWord += word.charAt(i);
            }
        }
        return newWord;
    }
}

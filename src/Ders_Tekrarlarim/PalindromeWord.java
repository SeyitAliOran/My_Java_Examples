package Ders_Tekrarlarim;

public class PalindromeWord {
    public static void main(String[] args) {
        String word ="radar";
        String reversedWord = "";
        for (int i = word.length()-1; i >=0; i--) {
            reversedWord += word.charAt(i);
        }
        if (word.equals(reversedWord)){
            System.out.println("polindrome");
        }else {
            System.out.println("not");
        }
    }
}

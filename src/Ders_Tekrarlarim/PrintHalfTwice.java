package Ders_Tekrarlarim;

public class PrintHalfTwice {
    public static void main(String[] args) {
        String word = "javada";
        String newWord = "";
        newWord = word.substring(0,word.length()/2);
        newWord += newWord;
        System.out.println("newWord = " + newWord);
    }
}

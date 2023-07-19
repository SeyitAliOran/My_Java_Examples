package Ders_Tekrarlarim;

public class RemoveExtraSpace {
    public static void main(String[] args) {
        String word = " Hello world     I    love         Java ";
        word=word.replaceAll(" ","");
        System.out.println(word);
        String word1 = word.substring(0,5).concat(" ");
        System.out.println(word1);
        String word2 = word.substring(5,10).concat(" ");
        System.out.println(word2);
        String word3 = word.substring(10,11).concat(" ");
        System.out.println(word3);
        String word4 = word.substring(11,15).concat(" ");
        System.out.println(word4);
        String word5 = word.substring(15, word.length());
        System.out.println(word5);
        System.out.println(word1.concat(word2).concat(word3).concat(word4).concat(word5));
    }
}

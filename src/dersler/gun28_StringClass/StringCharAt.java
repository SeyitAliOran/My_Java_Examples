package dersler.gun28_StringClass;

public class StringCharAt {
    public static void main(String[] args) {
        String word = "Computer";
        System.out.println(word.charAt(0));
        System.out.println(word.charAt(1));
        System.out.println(word.charAt(2));
        System.out.println(word.charAt(3));
        System.out.println(word.charAt(4));
        System.out.println(word.charAt(5));
        System.out.println(word.charAt(6));
        System.out.println(word.charAt(7));
       // System.out.println(word.charAt(8)); ---> Karakter sayisi 7 oldugu icin 8 de hata verir .StringIndexOutOfBoundsException

        System.out.println();

        String word2 = "Apple";
        System.out.println(word2.charAt(0));
        if (word2.charAt(0) == 'A'){
            System.out.println("Ilk karakter A dir");
        }else{
            System.out.println("Ilk karakter A degildir");
        }
        System.out.println();

        String word3 = "civic";
        if (word3.charAt(0) == word3.charAt(4)){
            System.out.println("word3.charAt(0) = " + word3.charAt(0));
            System.out.println("word3.charAt(4) = " + word3.charAt(4));
            System.out.println("Karakterler aynidir");
        }else{
            System.out.println("Karakterler ayni degildir");
        }

    }
}

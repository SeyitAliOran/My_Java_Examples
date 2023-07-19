package dersler.gun29_StringMethods2;

public class StringSubstring {
    // Stringi bolme islemine yarar
    // int parametre alir
    // bolme isleminden sonraki kismi donderiri
    // 2 index vererek kesme isleminin baslangic ve bitis noktasini berlirleriz...
    // keislmeye baslanan 1. index no karaktere dahil ancak 2. index dahil edilmez
    public static void main(String[] args) {
        String str = "Java String manupilation is fun!";
        System.out.println(str);
        System.out.println(str.substring(5)); // 5. indexten itibaren kesti geriye "String manupilation is fun" kaldi.
        System.out.println(str.substring(5, 11)); // 5-11 arasini alir "String"...
        System.out.println(str.substring(0, 4)); // ekran da Java kalir

        System.out.println();
        System.out.println(str.substring(5, str.length() - 5)); // length kullanarak dinamik bir sistem olusturabiliriz...
        System.out.println();
        
        String symbols = "{{}}";
        String word = "JAVA IS COOL";
        System.out.println("symbols = " + symbols);
        System.out.println("word = " + word);
        String newStr = symbols.substring(0,2).concat(word).concat(symbols.substring(2,symbols.length()));
        System.out.println("newStr = " + newStr); // {{JAVA IS COOL}}
    }
}

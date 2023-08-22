package dersler.gun29_StringMethods2;

public class StringIndexOf {
    public static void main(String[] args) {
        // indexOf methdu byte, char, String, int kabul eder....
        String word = " Germany";
        System.out.println(word.indexOf("G"));
        System.out.println("word.indexOf(\"rman\") = " + word.indexOf("rman")); // ilk karakterin bulundugu indexi verir
        System.out.println(word.indexOf("zzz")); // böyle bir karakter olmadigi icin -1 yazar...

        String url = "www.eurotechschool.com";
        int index = url.indexOf(".");
        System.out.println("index = " + index);
        System.out.println("url.charAt(index) = " + url.charAt(index)); // charAt indexi  karaktere cevirir.
        System.out.println(url.indexOf(".", index + 1)); // +1 birinci noktadan kurtulmak icin ve digerini bulmak icin

    }
}

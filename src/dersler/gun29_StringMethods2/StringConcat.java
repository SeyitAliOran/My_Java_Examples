package dersler.gun29_StringMethods2;

public class StringConcat {
    // concat methodu (birlestirme methodu)
    public static void main(String[] args) {
        String word = "Hello ";
        System.out.println(word);
        System.out.println(word.concat("World"));
        System.out.println(word);
        word = word.concat("World");
        System.out.println(word);
        System.out.println();
        word= word+123;
        // word = word.concat(123); ==> bire bir String parametre bekledigi icin STRING deger girmek gerekir.
        // word.concat('C'); ==> char i  da ekleyemeyiz...

       word= word.concat(" -Hi ").concat(" -How are you?").concat(" -I am good");
       System.out.println(word);
    }
}

package dersler.gun34_WrapperClasses;

public class CharacterMethod {
    public static void main(String[] args) {

        System.out.println("Character.isAlphabetic('a') = "+Character.isAlphabetic('a')); // True
        System.out.println("Character.isAlphabetic('6') = "+Character.isAlphabetic('6')); // False
        System.out.println();

        System.out.println("Character.isLetter('K') = " + Character.isLetter('K')); // True
        System.out.println("Character.isLetter('4') = " + Character.isLetter('4')); // False
        System.out.println("Character.isLetter('&') = " + Character.isLetter('&')); // False
        System.out.println();

        System.out.println("Character.isDigit('3') = " + Character.isDigit('3')); // True
        System.out.println("Character.isDigit('*') = " + Character.isDigit('*')); // False
        System.out.println();

        String word = "Java2023";
        System.out.println("Character.isAlphabetic(word) = " + Character.isAlphabetic(word.charAt(2))); // True
        System.out.println("Character.isLetter(word.charAt(0)) = " + Character.isLetter(word.charAt(0))); // True
        System.out.println("Character.isDigit(word.charAt(word.length()-1)) = " + Character.isDigit(word.charAt(word.length() - 1))); // True
        System.out.println();

        System.out.println("Character.isLetter('V') = " + Character.isLetter('V')); // True
        System.out.println("Character.isAlphabetic('V') = " + Character.isAlphabetic('V')); // True
        System.out.println();

        // \u2164 roma rakami ile Ⅴ e denk geldigi icin isLetter da False isAlphabetic de True cikar
        System.out.println("Character.isLetter('V') = " + Character.isLetter('\u2164')); // False
        System.out.println("Character.isAlphabetic('V') = " + Character.isAlphabetic('\u2164')); // True


    }
}

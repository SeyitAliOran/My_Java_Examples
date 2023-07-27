package dersler.gun36_Review;

public class CharToString {
    public static void main(String[] args) {
        // char data tipinde bir degiskenin 2 farkli sekilde Stringe cevirebiliriz
        char ch = 'C';
        String str = String.valueOf(ch);
        System.out.println("str = " + str);
        String str1 = Character.toString(ch);
        System.out.println("str1 = " + str1);


    }
}

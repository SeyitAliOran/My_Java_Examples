package dersler.gun32_Review;

import dersler.gun29_StringMethods2.StringReplace;

public class StringImmutable {
    public static void main(String[] args) {
        // Java'da String Class'i immutable dir... yani degistirilemez...
        String str1 = "Java";
        System.out.println("System.identityHashCode(str1) = " + System.identityHashCode(str1));
        System.out.println("str1 = " + str1);

        str1 = "Programlama";
        System.out.println("System.identityHashCode(str2) = " + System.identityHashCode(str1));
        System.out.println("str1 = " + str1);


    }
}

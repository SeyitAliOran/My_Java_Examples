package dersler.gun32_Review;

public class StringEmptyNullBlank {
    public static void main(String[] args) {

        // Hepsinin referans adresleri birbirinden farkli
        String str1 = ""; // Empty
        String str2= null;
        String str3 = " a"; // Blank
        String str4; // it is not created. So it does not have any address.
        System.out.println("System.identityHashCode(str1) = " + System.identityHashCode(str1));
        System.out.println("System.identityHashCode(str2) = " + System.identityHashCode(str2));
        System.out.println("System.identityHashCode(str3) = " + System.identityHashCode(str3));
        //System.out.println("System.identityHashCode(str4) = " + System.identityHashCode(str4));

       // System.out.println("str2.toUpperCase() = " + str2.toUpperCase()); //NullPointerException hatasi

    }
}

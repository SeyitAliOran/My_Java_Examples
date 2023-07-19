package dersler.gun29_StringMethods2;

public class StringEquals {
    // equals methodu String degerlerini kontrol eder
    // == methodu object i kontrol eder.
    public static void main(String[] args) {
        String str1 = "Hello World";
        String str2 = "Hello World";
        String str3 = "Hello Mars";
        String str4 = new String("Hello World");

        boolean compare = str1.equals(str2); // true
        boolean compare2 = str1.equals(str3); // false
        System.out.println("compare = " + compare);
        System.out.println("compare2 = " + compare2);
        System.out.println();

        boolean compare3 = str1 == str2; // true
        boolean compare4 = str1 == str3; // false
        System.out.println("compare3 = " + compare3);
        System.out.println("compare4 = " + compare4);
        System.out.println();

        boolean compare5 = str1.equals(str4);  // String object degerlerini karsilastirir
        boolean compare6 = str1 == str4;       // String objectlerin kendilerini karsilastirir  - ayni object olup olmadigini
        System.out.println("compare5 = " + compare5); // true
        System.out.println("compare6 = " + compare6); // false

    }
}

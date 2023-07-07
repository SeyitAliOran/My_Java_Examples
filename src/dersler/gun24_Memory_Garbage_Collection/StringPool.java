package dersler.gun24_Memory_Garbage_Collection;

public class StringPool {
    public static void main(String[] args) {
        String s1 = "Ali"; // Heap memory - string pool da yeni bir nesne olusturur.
        String s2 = "Ali"; // String pool a bakar ayni deger varsa yeni bir nesne olusturmaz.HAvuzda ki nesnenin adresimi bu degiskene atar.

        System.out.println("s1 == s2 --> "+(s1 == s2)); // s1 ve s2 ayni degeri referans ettigi icin sonuc TRUE yazar.

        String s3 = new String("Ali");
        String s4 = "Ali";
        System.out.println("s1 = " + s1 + " s2 = " + s2 + " s3 = " + s3+" s4 = " + s4);
        System.out.println("s3 == s1 --> "+(s3 == s1)); // s3 new anahtar kelimesi ile olusturuldugu icin sonuc FALSE olur...

        System.out.println("System.identityHashCode(s1) = " + System.identityHashCode(s1)); // s1 ve s2 adresleri ayni
        System.out.println("System.identityHashCode(s2) = " + System.identityHashCode(s2));
        System.out.println("System.identityHashCode(s3) = " + System.identityHashCode(s3)); // s3 adresi farkli
        System.out.println("System.identityHashCode(s4) = " + System.identityHashCode(s4));

        System.out.println();
        s1 = "Veli"; // yeni bir obje create edildiginden toplam 3 tane farkli adreste obje olusur.
        System.out.println("System.identityHashCode(s1) = " + System.identityHashCode(s1)); // s1 ve s2 adresleri ayni
        System.out.println("System.identityHashCode(s2) = " + System.identityHashCode(s2));
        System.out.println("System.identityHashCode(s3) = " + System.identityHashCode(s3)); // s3 adresi farkli
        System.out.println("System.identityHashCode(s4) = " + System.identityHashCode(s4));

        System.out.println();
        System.out.println("String immutable ---> degistirilemez");
        System.out.println("System.identityHashCode(s1) = " + System.identityHashCode(s1));
        System.out.println("s1 = " + s1);
        s1 = s1.concat(" Selami"); // yeni bir obje create eder.
        System.out.println("System.identityHashCode(s1) = " + System.identityHashCode(s1));
        System.out.println("s1 = " + s1);

    }
}

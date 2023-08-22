package dersler.gun47_AccessModifiers.PackageB;

public class AccessModifiersTest {
    public static void main(String[] args) {
        // Ayni package icerisinden diger classda kilere ulasmaya calisiypruz
        // Access Modifiers i private olanlarin disinda ki butun method ve degiskenlere ulasiriz
        AccessModifiers obj = new AccessModifiers();
        obj.defaultMethod();
        obj.protectedMethod();
        obj.publicMethod();
    }
}

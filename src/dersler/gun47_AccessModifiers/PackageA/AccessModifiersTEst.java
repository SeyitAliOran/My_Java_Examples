package dersler.gun47_AccessModifiers.PackageA;

import dersler.gun47_AccessModifiers.PackageB.AccessModifiers;

public class AccessModifiersTEst {
    public static void main(String[] args) {
        // Package Anin icerisinden Package B ye erismeye calisiyoruz
        AccessModifiers obj = new AccessModifiers();
        obj.publicMethod(); // Farkli package oldugu icin sadece paublic olanlara erisiriz.
        obj.name = "Ali"; // --> Public oldugundan erisim saglandi
    }
}

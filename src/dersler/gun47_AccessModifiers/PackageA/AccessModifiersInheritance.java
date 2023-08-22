package dersler.gun47_AccessModifiers.PackageA;

import dersler.gun47_AccessModifiers.PackageB.AccessModifiers;

public class AccessModifiersInheritance extends AccessModifiers {
    public static void main(String[] args) {
        // Miras alma Inheritance uyerinden sadece protected ve public uyelere erisim saglayabiliriz
        AccessModifiersInheritance obj =  new AccessModifiersInheritance();
        obj.publicMethod();
        obj.protectedMethod();
        obj.name = "Public"; // Public
        obj.TCNO = 1234134; // Protected

    }

}

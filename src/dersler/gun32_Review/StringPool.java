package dersler.gun32_Review;

import dersler.gun31_Arrays2.Person;

public class StringPool {
    public static void main(String[] args) {
        // String class i degistirilemez bir classtir.
        Person person1 = new Person();
        Person person2 = new Person();
        Person person3 = new Person();
        person1.name = "Ahmet";
        person2.name = "Ahmet";
        person3.name = "Mehmet";

        System.out.println("System.identityHashCode(person1) = " + System.identityHashCode(person1.name));
        System.out.println("System.identityHashCode(person2) = " + System.identityHashCode(person2.name));
        System.out.println("System.identityHashCode(person3) = " + System.identityHashCode(person3.name));

    }

}

package dersler.gun53_Polymorphism1.Animal;

public class PolymorphicObject {
    public static void main(String[] args) {

        // Non-polymorphic way of object creation
        Animal a = new Animal();
        a.sound(); // Animal makes a sound
        Dog dog = new Dog();
        dog.sound(); // Dog says : Hav Hav
        Cat cat = new Cat();
        cat.sound(); // Cat says : Miyav Miyav
        Duck duck = new Duck();
        duck.sound(); // Duck says : Vak Vak

        // Polymorphic way of object creation
        Animal a2 = new Animal();
        a2.sound(); // Animal makes a sound
        Animal dog1 = new Dog();
        dog1.sound(); // Dog says : Hav Hav
        Animal cat1 = new Cat();
        cat1.sound(); // Cat says : Miyav Miyav
        Animal duck1 = new Duck();
        duck1.sound(); // Duck says : Vak Vak

        // Same object name, same method name, different form / Polymorphism
        Animal animal = new Animal();
        animal.sound(); // Animal makes a sound
        animal = new Dog();
        animal.sound(); // Dog says : Hav Hav
        animal = new Cat();
        animal.sound(); // Cat says : Miyav Miyav
        animal = new Duck();
        animal.sound(); // Duck says : Vak Vak

    }
}

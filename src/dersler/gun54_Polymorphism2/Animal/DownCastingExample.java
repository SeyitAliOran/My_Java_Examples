package dersler.gun54_Polymorphism2.Animal;

public class DownCastingExample {
    public static void main(String[] args) {
        Animal animal = new Dog(); // Animal da ki makeSound methoduna ulastik override edildigi icin dog da ki method cagirildi
        animal.makeSound();
       //  animal.wagTail(); ERROR

       Dog dog = (Dog) animal;
        dog.makeSound();
        dog.wagTail();

        // Downcasting and calling method in one line
        Animal animal1 = new Cat();
        ((Cat) animal1).mirr();


    }
}

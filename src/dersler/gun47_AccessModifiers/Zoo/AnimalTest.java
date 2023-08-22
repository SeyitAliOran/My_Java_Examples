package dersler.gun47_AccessModifiers.Zoo;

public class AnimalTest {
    public static void main(String[] args) {
        Animal animal = new Animal("Animal",1,"Beyaz");
        System.out.println("animal = " + animal);
        animal.makeSound();
        animal.eat();
        animal.move();

        System.out.println("------------------------------------------------------");

        Dog dog = new Dog("Karabas",12,"Siyah");
        System.out.println("dog = " + dog);
        dog.makeSound();
        dog.move();

        System.out.println("------------------------------------------------------");

        Bird bird = new Bird("Cici kus",3,"Yellow");
        System.out.println("bird = " + bird);
        bird.fly();
        bird.move();
        bird.makeSound();
        bird.eat();

    }
}

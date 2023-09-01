package dersler.gun54_Polymorphism2.Animal;


public class Animal {
    public void makeSound() {
        System.out.println("Make sound");
    }
}
class Dog extends Animal{
    @Override
    public void makeSound() {
        System.out.println("Hav Hav");
    }
    public void wagTail(){
        System.out.println("Dog wags tail");
    }
}
class Cat extends Animal{
    @Override
    public void makeSound() {
        System.out.println("Miyav Miyav");
    }
    public void mirr(){
        System.out.println("Cat mirrrs");
    }
}

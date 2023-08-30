package dersler.gun52_Interface_Enum_Record.Interface.AnimalFarm;

public class Bird extends Animal implements Ucabilir,Kosabilir {

    public Bird(String name, int age, String color) {
        super(name, age, color);
    }

    @Override
    public void eat() {
        System.out.println("I am a bird and, I eat worms and wheat.");
    }

    @Override
    public void sleep() {
        System.out.println("I am bird and, I sleep at trees.");
    }

    @Override
    public void run() {
        System.out.println("I run with my two legs.");
    }

    @Override
    public void fly() {
        System.out.println("I fly with my wings.");
    }
}

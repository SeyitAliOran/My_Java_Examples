package dersler.gun52_Interface_Enum_Record.Interface.AnimalFarm;

public class Kurbaga extends Animal implements Yuzebilir,Kosabilir{
    public Kurbaga(String name, int age, String color) {
        super(name, age, color);
    }

    @Override
    public void eat() {
        System.out.println("I am a frog. I eat flies.");
    }

    @Override
    public void sleep() {
        System.out.println("I am frog and, I sleep under rocks.");
    }

    @Override
    public void run() {
        System.out.println("I am a frog and, I run my four legs.");
    }

    @Override
    public void swim() {
        System.out.println("I am frog and, I swim.");
    }
}

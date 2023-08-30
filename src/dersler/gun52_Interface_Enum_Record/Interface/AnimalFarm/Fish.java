package dersler.gun52_Interface_Enum_Record.Interface.AnimalFarm;

public class Fish extends Animal implements Yuzebilir{
    public Fish(String name, int age, String color) {
        super(name, age, color);
    }

    @Override
    public void eat() {
        System.out.println("I eat small fishes.");
    }

    @Override
    public void sleep() {
        System.out.println("I sleep under water with my eyes open.");
    }

    @Override
    public void swim() {
        System.out.println("I am a fish and, I swim in water.");
    }
}

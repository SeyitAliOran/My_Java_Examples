package dersler.gun47_AccessModifiers.Zoo;

public class Dog extends Animal {
    public Dog(String name, int age,String colour){
        super(name,age,colour);
    }

    @Override
    protected void makeSound() {
        System.out.println("I am a dog. And Hav...hav...hav");
    }
    @Override
    public void move(){
        System.out.println("I am a dog. I run with my 4 legs");
    }

    @Override
    public String toString() {
        return "I am a dog.\n" + super.toString();
    }
}
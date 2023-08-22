package dersler.gun47_AccessModifiers.Zoo;

public class Bird extends Animal {
    public Bird(String name,int age,String colour){
        super(name, age, colour);
    }
    @Override
    public void move(){
        super.move();
        System.out.println("I am a bird and I can move my 2 legs");
    }
    @Override
    public void makeSound(){ // protected access modifier is overridden as public
        System.out.println("I am a bird and make sound cik... cik...");
    }
    public void fly(){
        System.out.println("I am a bird and I fly with my wings");
    }

    @Override
    public String toString() {
        return "I am a bird\n" + super.toString();
    }
}

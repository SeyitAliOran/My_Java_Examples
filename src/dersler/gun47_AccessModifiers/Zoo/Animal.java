package dersler.gun47_AccessModifiers.Zoo;

public class Animal {
    private String name;
    private int age;
    private String colour;
    protected Animal(){

    }

    protected Animal(String name,int age, String colour){
        this.name = name;
        this.age = age;
        this.colour = colour;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getColour() {
        return colour;
    }

    public void setColour(String colour) {
        this.colour = colour;
    }
    protected void move(){
        System.out.println("I ma a animal. I am moving");
    }
    protected void eat(){
        System.out.println("I am a animal. I am eating");
    }
    protected void makeSound(){
        System.out.println("I am a animal. I make sound.");
    }

    @Override
    public String toString() {
        return "Animal{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", colour='" + colour + '\'' +
                '}';
    }
}

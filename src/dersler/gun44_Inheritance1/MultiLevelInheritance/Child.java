package dersler.gun44_Inheritance1.MultiLevelInheritance;

public class Child extends Parent {
    int age;
    public Child(String name, String lastName, int age){
        super(name,lastName);
        this.age = age;
    }
    public void display(){
        super.display();
        System.out.println("Age of Child: " + age);
    }
}

package dersler.gun44_Inheritance1.MultiLevelInheritance;

public class Parent extends GrandParent {
    String lastName;
    public Parent(String name,String lastName){
        super(name);
        this.lastName = lastName;
    }

    public void display(){
        super.display();
        System.out.println("Last name of Parent: " + lastName);
    }
}

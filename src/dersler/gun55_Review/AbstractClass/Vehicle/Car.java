package dersler.gun55_Review.AbstractClass.Vehicle;

public class Car extends Vehicle {

    public Car(){
        wheels =4;
    }
    @Override
    public void drive() {
        System.out.println("Driving a " + color + " car with " + wheels + " wheels");
    }
}

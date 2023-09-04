package dersler.gun55_Review.AbstractClass.Vehicle;

public class Bicycle extends Vehicle {
    public Bicycle(){
        wheels = 2;
    }
    @Override
    protected void drive() {
        System.out.println("Driving a " + color + " bicycle with " + wheels + " wheels");

    }
}

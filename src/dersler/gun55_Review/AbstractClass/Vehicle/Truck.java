package dersler.gun55_Review.AbstractClass.Vehicle;

public class Truck extends Vehicle{
    protected Truck(){
      wheels = 6;
}
    @Override
    protected void drive() {
        System.out.println("Driving a " + color + " truck with " + wheels + " wheels");

    }
}

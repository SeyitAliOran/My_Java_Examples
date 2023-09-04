package dersler.gun55_Review.AbstractClass.Vehicle;

public class Motocycle extends Vehicle{
    public Motocycle(){
        wheels = 2;
    }

    @Override
    public void drive() {
        System.out.println("Driving a " + color + " motocycle with " + wheels + " wheels");

    }
}

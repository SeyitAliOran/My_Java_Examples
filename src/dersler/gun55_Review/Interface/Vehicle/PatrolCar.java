package dersler.gun55_Review.Interface.Vehicle;

public class PatrolCar implements PatrolVehicle {

    @Override
    public void start() {
        System.out.println("PatrolCar started...");
    }

    @Override
    public void stop() {
        System.out.println("PatrolCar stopped...");
    }
    @Override
    public void takeGas() {
        System.out.println("PatrolCar took gas...");
    }
}

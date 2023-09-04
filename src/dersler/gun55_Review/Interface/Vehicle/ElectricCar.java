package dersler.gun55_Review.Interface.Vehicle;

public class ElectricCar implements ElektricVehicle {
    @Override
    public void start() {
        System.out.println("ElectricCar started...");
    }

    @Override
    public void stop() {
        System.out.println("ElectricCar stopped...");
    }
    @Override
    public void charge() {
        System.out.println("ElectricCar is charged...");
    }
}

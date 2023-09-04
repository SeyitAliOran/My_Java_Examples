package dersler.gun55_Review.AbstractClass.Vehicle;

public class VehicleTest {
    public static void main(String[] args) {
        Car car = new Car();
        car.setColor("Red");
        car.drive();

        Motocycle motocycle = new Motocycle();
        motocycle.setColor("Black");
        motocycle.drive();

        Truck truck = new Truck();
        truck.setColor("White");
        truck.drive();

        Bicycle bicycle = new Bicycle();
        bicycle.setColor("Blue");
        bicycle.drive();
    }
}

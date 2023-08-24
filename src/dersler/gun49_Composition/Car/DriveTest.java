package dersler.gun49_Composition.Car;

public class DriveTest {
    public static void main(String[] args) {
        Engine engine = new Engine(250);
        Transmission transmission = new Transmission(6);
        Steering steering = new Steering(20);
        Car car = new Car(engine,transmission,steering,4);
        car.drive();
    }



}

package dersler.gun49_Composition.Car;

public class Car {
    private Engine engine;
    private Transmission transmission;
    private Steering steering;
    private int tyres;

    public Car(Engine engine, Transmission transmission, Steering steering, int tyres) {
        this.engine = engine;
        this.transmission = transmission;
        this.steering = steering;
        this.tyres = tyres;
    }
    public void drive(){
        engine.start();
        transmission.shiftGear(1);
        steering.turn(45);
        System.out.println("Driving with " + tyres + " tyres");
        System.out.println("Car has been driven for 5 miles");
        engine.stop();
    }
}

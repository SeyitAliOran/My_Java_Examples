package dersler.gun55_Review.Interface.Vehicle;

public class DriveTest {
    public static void main(String[] args) {
        PatrolCar car1 = new PatrolCar();
        car1.start();
        car1.takeGas();
        car1.stop();

        ElectricCar car2 = new ElectricCar();
        car2.start();
        car2.charge();
        car2.stop();

    }
}

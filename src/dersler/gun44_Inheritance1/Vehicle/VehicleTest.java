package dersler.gun44_Inheritance1.Vehicle;

public class VehicleTest {
    public static void main(String[] args) {
        Car car = new Car(); // Car obj eklendiginde once parent classda ki Vehicle Constructor sonra Car Constructor cagirilir
        car.name = "Audi";
        car.weight = 2344;
        car.length = 3;
        car.brand = "a4";
        car.doorNumber = 2;
        car.tiresSize = 17;
        car.seats = 4;

        System.out.println("car.name = " + car.name);
        System.out.println("car.weight = " + car.weight);
        System.out.println("car.length = " + car.length);
        System.out.println("car.brand = " + car.brand);
        System.out.println("car.doorNumber = " + car.doorNumber);
        System.out.println("car.tiresSize = " + car.tiresSize);
        System.out.println("car.seats = " + car.seats);
        car.start();
        car.stop();
        car.move();
        car.handBreak();
        car.honk();
        car.openTrunk();
        System.out.println("-------------------------");
        // car.engineType = "blabla"; ---> is a relation sadece parent ve child arasinda olusur. childlar birbirine ulasamaz
        Plane plane = new Plane();// Plane obj eklendiginde once parent classda ki Vehicle Constructor sonra Plane Constructor cagirilir
        plane.name = "Boeing";
        plane.weight = 22452342;
        plane.length = 30;
        plane.seats = 150;
        plane.propellerSize = 10;
        plane.engineType = "Jet";
        System.out.println("plane.name = " + plane.name);
        System.out.println("plane.weight = " + plane.weight);
        System.out.println("plane.length = " + plane.length);
        System.out.println("plane.seats = " + plane.seats);
        System.out.println("plane.propellerSize = " + plane.propellerSize);
        System.out.println("plane.engineType = " + plane.engineType);
        plane.start();
        plane.stop();
        plane.move();
        plane.rotorRpm();
        plane.pressureCheck();
        plane.taxi();

    }
}

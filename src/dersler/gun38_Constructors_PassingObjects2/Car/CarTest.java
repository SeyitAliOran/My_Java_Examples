package dersler.gun38_Constructors_PassingObjects2.Car;

public class CarTest {
    public static void main(String[] args) {
        Car car1 = new Car("Toyota","Corolla");
        car1.collectPart();
        System.out.println();

        Car car2 = new Car("Honda","Civic",2023);
        car2.collectPart();
        System.out.println();

        Car car3 = new Car("Opel","Astra",2022,"Blue");
        car3.collectPart();
        System.out.println();

        Car car4 = new Car("Audi","A6",2024,"Grey",true);
        car4.collectPart();
    }
}

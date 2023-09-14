package dersler.gun62_OopReview.ClassRelationShip.Aggregation;

import dersler.gun62_OopReview.ClassRelationShip.Composition.EnumColors;

public class CarTest {
    public static void main(String[] args) {
        Engine engine = new Engine(EnumEngine.PETROL,1800);
        EngineRec engineRec = new EngineRec(EnumEngine.DIESEL,2000);
        Tire tire = new Tire(195);

        Car car = new Car(EnumBrands.HONDA, EnumColors.WHITE,engine,tire);
        Car car1 = new Car(EnumBrands.FORD,EnumColors.BLUE,tire,engineRec);

        System.out.println("car = " + car);
        System.out.println("car1 = " + car1);
    }
}

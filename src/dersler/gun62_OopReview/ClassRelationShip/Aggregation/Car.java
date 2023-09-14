package dersler.gun62_OopReview.ClassRelationShip.Aggregation;

import dersler.gun62_OopReview.ClassRelationShip.Composition.EnumColors;

public class Car {
    private EnumBrands brand;
    private EnumColors color;
    private Engine engine; //Has-a
    private EngineRec engineRec;
    private Tire tire; //Has-a

    public Car(EnumBrands brand, EnumColors color, Engine engine, Tire tire) {
        this.brand = brand;
        this.color = color;
        this.engine = engine;
        this.tire = tire;
    }
    public Car(EnumBrands brand, EnumColors color, Tire tire, EngineRec engineRec) {
        this.brand = brand;
        this.color = color;
        this.engineRec = engineRec;
        this.tire = tire;
    }
    public EnumBrands getBrand() {
        return brand;
    }

    public void setBrand(EnumBrands brand) {
        this.brand = brand;
    }

    public EnumColors getColor() {
        return color;
    }

    public void setColor(EnumColors color) {
        this.color = color;
    }

    public Engine getEngine() {
        return engine;
    }

    public void setEngine(Engine engine) {
        this.engine = engine;
    }

    public Tire getTire() {
        return tire;
    }

    public void setTire(Tire tire) {
        this.tire = tire;
    }

    @Override
    public String toString() {
        return "Car{" +
                "brand=" + brand +
                ", color=" + color +
                ", engine=" + engine +
                ", engineRec=" + engineRec +
                ", tire=" + tire +
                '}';
    }
}

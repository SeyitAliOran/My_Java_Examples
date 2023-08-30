package dersler.gun52_Interface_Enum_Record.Enum;

public class Car {
    BrandName brandName;
    String model;
    Colors color;

    enum BrandName {
        HONDA, TOYOTA, MERCEDES, TOGG;
    }

    public Car(BrandName brandName, String model, Colors color) {
        this.brandName = brandName;
        this.model = model;
        this.color = color;
    }

    @Override
    public String toString() {
        return "Car{" +
                "brandName='" + brandName + '\'' +
                ", model='" + model + '\'' +
                ", color=" + color +
                '}';
    }

    public static void main(String[] args) {
        Car araba = new Car(BrandName.MERCEDES, "Civic", Colors.SIYAH);

        System.out.println(araba);

    }
}

package dersler.gun53_Polymorphism1.Shape;

public class Circle implements Shape{
    public double radius = 2.5;

    public double getArea() {
        return Math.PI * radius * radius;
    }
}

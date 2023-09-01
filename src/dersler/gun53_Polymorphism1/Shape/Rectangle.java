package dersler.gun53_Polymorphism1.Shape;

public class Rectangle implements Shape{
    public double width = 3.0;
    public double length = 5.0;

    public double getArea() {
        return width * length;
    }
}

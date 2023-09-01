package dersler.gun53_Polymorphism1.Shape;

public class Triangle implements Shape{
    public double height = 4.0;
    public double base = 5.0;

    public double getArea() {
        return (height * base) / 2;
    }
}

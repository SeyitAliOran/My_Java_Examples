package dersler.gun53_Polymorphism1.Shape;

public class Square implements Shape{
    public double side = 5.0;

    public double getArea() {
        return side * side;
    }
}

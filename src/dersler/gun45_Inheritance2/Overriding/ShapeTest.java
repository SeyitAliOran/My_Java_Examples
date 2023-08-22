package dersler.gun45_Inheritance2.Overriding;

public class ShapeTest {
    public static void main(String[] args) {
        Shape shape = new Shape();
        shape.draw();
        shape.getArea();

        Circle circle = new Circle();
        circle.draw();
        circle.getArea();

        Square square = new Square();
        square.draw();
        square.getArea();
        square.getArea(10,20);
    }
}

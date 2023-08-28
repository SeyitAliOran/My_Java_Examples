package dersler.gun51_AbstractClass.Shape;

public class ShapeTest {
    public static void main(String[] args) {
        // Shape shape = new Shape(); // Abstract class lardan instance olusturulamaz
        Rectangle rectangle = new Rectangle(5,3);
        double area = rectangle.calculateArea();
        System.out.println("Rectangle area = " + area);
        rectangle.draw();
        System.out.println();
        Circle circle = new Circle(5);
        double circleArea = circle.calculateArea();
        System.out.println("circleArea = " + circleArea);
        circle.draw();
        circle.merhaba();
        circle.showInfo();
    }


}

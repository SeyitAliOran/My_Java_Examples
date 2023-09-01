package dersler.gun53_Polymorphism1.Shape;

public class ShapeTest {
    public static void main(String[] args) {

        Shape[] shapes = new Shape[4];
        shapes[0] = new Circle();
        shapes[1] = new Square();
        shapes[2] = new Triangle();
        shapes[3] = new Rectangle();

        // Ayni methodun getArea(); farkli objectler uzerinden cagirildiginda farkli forma girmesi durumu
        // Polymorphism

        for(Shape shape : shapes){
            System.out.println("The area of the shape is : " + shape.getArea());
        }
    }
}

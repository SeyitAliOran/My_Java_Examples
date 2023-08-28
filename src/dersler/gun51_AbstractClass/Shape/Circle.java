package dersler.gun51_AbstractClass.Shape;

public class Circle extends Shape {
    private double radius;

    public Circle(double radius) {
        setRadius(radius);
    }

    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius>0 ? radius:1;
    }

    @Override
    protected double calculateArea() {
        // return Math.pow(radius,2) * Shape.PI; // pow ile radiusun karesini aliriz (istersek bu sekildede kullanabiliriz)
        return radius * radius * PI; // PI sayisi Parent classinda tanimlandigindan otomatik burada kullanabiliriz.
    }

    @Override
    protected void draw() {
        System.out.println("I am a circle and I am drawing a circle object");
    }

    @Override
    protected void showInfo() {
        System.out.println("I am a circle object of Shape Class");
    }
}

package dersler.gun51_AbstractClass.Shape;

public class Rectangle extends Shape {
    private double width;
    private double length;

    protected Rectangle(double width, double length) {
        setWidth(width);
        setLength(length);
    }

    public double getWidth() {
        return width;
    }

    public void setWidth(double width) {
        if (width>0) {
            this.width = width;
        } else this.width = 1;
    }

    public double getLength() {
        return length;
    }

    public void setLength(double length) {
        this.length = length > 0 ? length : 1; // ternary kullanarak yapilis sekli
    }

    @Override
    protected double calculateArea() {
        return getWidth() * getLength();
    }

    @Override
    protected void draw() {
        System.out.println("I am a rectangle and I am drawing a rectangle object");
    }
}

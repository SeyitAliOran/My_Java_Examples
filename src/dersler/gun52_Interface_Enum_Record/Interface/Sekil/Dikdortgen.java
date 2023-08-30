package dersler.gun52_Interface_Enum_Record.Interface.Sekil;

public class Dikdortgen implements Sekil{
    double width;
    double length;

    public Dikdortgen() {
    }

    public Dikdortgen(double width, double length) {
        if (width <= Sekil.MAX_WIDTH){
            this.width = width;
        }
        if (length <= Sekil.MAX_LENGTH) {
            this.length = length;
        }
    }

    @Override
    public void draw() {
        System.out.println("I am a Dikdortgen");
    }

    @Override
    public double getArea(int en, int boy) {
        return en * boy;
    }

    @Override
    public double getArea() {
        return width * length;
    }

    @Override
    public double getPerimeter() {
        return (width + length) * 2;
    }

    @Override
    public void drawDefault() {
        Sekil.super.drawDefault();
    }
}

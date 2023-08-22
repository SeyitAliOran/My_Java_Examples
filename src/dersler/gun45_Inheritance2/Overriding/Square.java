package dersler.gun45_Inheritance2.Overriding;

public class Square extends Shape{
    @Override
    public void draw(){
        System.out.println("I am a method of Square Class.");
    }
    @Override
    public void getArea(){
        System.out.println("Calculate the area of Square");
    }
    // Method overloading
    public void getArea(int width, int length){
        System.out.println("Area of square is:" + (width*length));
    }
}

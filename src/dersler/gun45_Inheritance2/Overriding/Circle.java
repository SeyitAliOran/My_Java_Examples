package dersler.gun45_Inheritance2.Overriding;

public class Circle extends Shape{
    @Override
    public void draw(){
        System.out.println("I am a method of Circle Class.");
    }
    @Override
    public void getArea(){
        System.out.println("Calculate the area of Circle");

    }
}

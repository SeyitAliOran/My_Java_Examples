package dersler.gun55_Review.AbstractClass.Vehicle;

public abstract class Vehicle {
    protected int wheels;
    protected String color;

    protected abstract void  drive();
    public void setColor(String color){
        this.color = color;
    }



}

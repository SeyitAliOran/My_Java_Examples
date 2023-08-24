package dersler.gun49_Composition.Car;

public class Steering {
    private int size;

    public Steering(int size) {
        this.size = size;
    }
    public void turn(int degree){
        System.out.println("Truning steering wheel by " + degree + " degrees with " + size + " inches size");
    }
}

package dersler.gun55_Review.AbstractClass.Parent;

public abstract class Parent  extends GrandParent{
    // Parent ve grandParent classlar abstract oldugundan dolayi implement edilmek zorunda degiller

    @Override
    void move() {
        System.out.println("Parent class");
    }

    abstract void moveOnceAgain();
}

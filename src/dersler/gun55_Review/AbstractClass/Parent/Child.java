package dersler.gun55_Review.AbstractClass.Parent;

public class Child extends Parent {
    @Override
    void move() { // move methodu Parent te override edildigi icin implement etmek zorunda degiliz

    }

    @Override
    void moveOnceAgain() { // Parent class daki abstract class implement edilmek zorunda

    }

    @Override
    void moveAgain() { // grandParent class daki abstract class parent classda override edilmediginden implement edilmek zorunda

    }
}

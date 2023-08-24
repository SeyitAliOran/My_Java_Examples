package dersler.gun49_Composition.Car;

public class Transmission {
    private int gears;
    public Transmission(int gears){
        this.gears = gears;
    }
    public void shiftGear(int gear){
        System.out.println("Shifting to gear " + gear + " out of " + gears);
    }
}

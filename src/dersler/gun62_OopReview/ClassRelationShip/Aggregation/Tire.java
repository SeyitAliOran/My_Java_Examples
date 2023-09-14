package dersler.gun62_OopReview.ClassRelationShip.Aggregation;

public class Tire {
    private int size;

    public Tire(int size) {
        this.size = size;
    }

    public int getSize() {
        return size;
    }

    public void setSize(int size) {
        this.size = size;
    }

    @Override
    public String toString() {
        return "Tire{" +
                "size=" + size +
                '}';
    }
}

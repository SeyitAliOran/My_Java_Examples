package dersler.gun50_Review.Composition;

public class Table {
    private int number;
    private int seats;

    Table(int number, int seats){
        this.number = number;
        this.seats = seats;
    }
    public void reserve(int guests){
        if (guests <= seats){
            System.out.println("Table number " + number + " is reserved for " + guests + " guests");
        }else System.out.println("Table number " + number + " only seat " + seats + " guests");
    }

    public int getNumber() {
        return number;
    }
}

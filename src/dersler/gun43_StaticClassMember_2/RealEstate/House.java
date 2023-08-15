package dersler.gun43_StaticClassMember_2.RealEstate;

public class House {

    private int houseId;
    private static int nextHouseId;
    private String address;
    private int numRooms;
    private double rentAmount;

    static {
        nextHouseId = 101;
    }

    {
        houseId = nextHouseId++;
        address = "Unknown";
        numRooms = 0;
        rentAmount = 0;
    }
    public House(){ }
    public House(String address, int numRooms, double rentAmount) {
        this.address = address;
        this.numRooms = numRooms;
        this.rentAmount = rentAmount;
    }

    public int getHouseId() {
        return houseId;
    }

    public void setHouseId(int houseId) {
        this.houseId = houseId;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public int getNumRooms() {
        return numRooms;
    }

    public void setNumRooms(int numRooms) {
        this.numRooms = numRooms;
    }

    public double getRentAmount() {
        return rentAmount;
    }

    public void setRentAmount(double rentAmount) {
        this.rentAmount = rentAmount;
    }
}

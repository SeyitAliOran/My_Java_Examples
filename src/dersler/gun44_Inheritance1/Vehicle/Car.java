package dersler.gun44_Inheritance1.Vehicle;

public class Car extends Vehicle {
    int tiresSize;
    String brand;
    int doorNumber;
    public Car(){
        System.out.println("Car Constructor");
    }

    public void honk(){
        System.out.println("Araba korna caliyor...");
    }
    public void handBreak(){
        System.out.println("El freni cekiliyor...");
    }
    public void openTrunk(){
        System.out.println("Bagaj aciliyor...");
    }
}

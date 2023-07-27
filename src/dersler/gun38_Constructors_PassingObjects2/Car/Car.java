package dersler.gun38_Constructors_PassingObjects2.Car;

public class Car {
    String make;
    String model;
    int year;
    String color;
    boolean hasSunroof;
    public Car(String make,String model){
        this.make = make;
        this.model = model;
    }
    public Car (String make, String model,int year){
        this.make = make;
        this.model = model;
        this.year = year;

    }
    Car (String make, String model,int year,String color){
        this.make = make;
        this.model = model;
        this.year = year;
        this.color = color;
    }
    Car (String make, String model,int year,String color,boolean hasSunroof){
        this.make = make;
        this.model = model;
        this.year = year;
        this.color = color;
        this.hasSunroof = hasSunroof;
    }

    public void collectPart(){
        if (this.color != null && this.hasSunroof == false){
            System.out.println("Collect paint as well");
        } else if (this.year != 0 && this.hasSunroof == false ) {
            System.out.println("Collect parts according to year");
        } else if (this.hasSunroof == true) {
            System.out.println("Collect sunroof parts as well.");
        }else{
            System.out.println("Collect necessary parts");
        }
    }
}

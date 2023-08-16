package dersler.gun44_Inheritance1.Vehicle;

public class Plane extends  Vehicle{
    double propellerSize;
    String engineType;
    public Plane(){
        System.out.println("Plane Constructor");
    }

    public void rotorRpm(){
        System.out.println("rotorRpm");
    }
    public void pressureCheck(){
        System.out.println("pressureCheck");
    }
    public void taxi(){
        System.out.println("taxi");
    }
}

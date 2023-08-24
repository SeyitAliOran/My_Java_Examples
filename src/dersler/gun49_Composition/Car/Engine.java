package dersler.gun49_Composition.Car;

public class Engine {
    private int horsePower;
    public Engine(int horsePower){
        this.horsePower = horsePower;
    }
    public void start(){
        System.out.println("Engine started with " + horsePower + " horse power");
    }
    public void stop(){
        System.out.println("Engine stopped and car parked");
    }

}

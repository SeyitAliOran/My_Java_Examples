package dersler.gun51_AbstractClass.Vehicle;

public class Sedan extends Arac{
    private int doors;
    private boolean isStarted;

    public Sedan(String marka, String model, int year, String renk,int doors) {
        super(marka, model, year, renk);
       setDoors(doors);
    }

    public int getDoors() {
        return doors;
    }

    public void setDoors(int doors) {
        this.doors = doors;
    }

    @Override
    protected void start() {
        System.out.println("Started successfully");
        isStarted = true;
    }

    @Override
    protected void stop() {
        System.out.println("Stopped");
        isStarted = false;
    }

    @Override
    protected void drive() {
        if (isStarted){
            System.out.println(getMarka() + " - " + getModel() + " arac hareket etti.");
        }else System.out.println("Arac calismiyor. Hareket edemem.");

    }

    @Override
    protected void turnRight(int angle) {
        if (angle > 0 && angle < 120){
            System.out.println(angle + " derece saga dondu");
        }else System.out.println("En fazla 120 derece saga donebilirim!!!" + (angle-120)+ " derece limitlerimin disinda ");

    }

    @Override
    protected void turnLeft(int angle) {
        if (angle > 0 && angle < 120){
            System.out.println(angle + "derece sola dondu");
        }else System.out.println("En fazla 120 derece sola donebilirim!!!" + (angle-120)+ " derece limitlerimin disinda ");
    }

    @Override
    void printInfo() {
        super.printInfo();
        System.out.println("Kapi sayisi: " + doors);
    }
}

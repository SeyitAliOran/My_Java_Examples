package dersler.gun51_AbstractClass.Vehicle;

public class Otobus extends  Arac{
    private int doors;
    private boolean isStarted;
    public Otobus(String marka, String model, int year, String renk,int doors) {
        super(marka, model, year, renk);
        this.doors = doors;
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
        if (angle > 0 && angle < 90){
            System.out.println(angle + " derece saga dondu");
        }else System.out.println("En fazla 120 derece saga donebilirim!!!" + (angle-90)+ " derece limitlerimin disinda ");

    }

    @Override
    protected void turnLeft(int angle) {
        if (angle > 0 && angle < 90){
            System.out.println(angle + "derece sola dondu");
        }else System.out.println("En fazla 90 derece sola donebilirim!!!" + (angle-90)+ " derece limitlerimin disinda ");
    }
}

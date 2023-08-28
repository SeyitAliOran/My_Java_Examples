package dersler.gun51_AbstractClass.Vehicle;

public abstract class Arac {
    // instance variables
    private String marka;
    private String model;
    private int year;
    private String renk;

    public Arac(String marka, String model, int year, String renk) {
        this.marka = marka;
        this.model = model;
        this.year = year;
        this.renk = renk;
    }

    // Subclasses must implement these methods
    protected abstract void start();
    protected abstract void stop();
    protected abstract void drive();
    protected abstract void turnRight(int angle);
    protected abstract void turnLeft(int angle);

    public String getMarka() {
        return marka;
    }

    public void setMarka(String marka) {
        this.marka = marka;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public String getRenk() {
        return renk;
    }

    public void setRenk(String renk) {
        this.renk = renk;
    }

    void printInfo(){
        System.out.println("Marka: " + marka);
        System.out.println("Model: " + model);
        System.out.println("Yil  : " + year);
        System.out.println("Renk : " + renk);

    }


}

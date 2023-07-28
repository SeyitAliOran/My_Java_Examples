package dersler.gun40_Encapculation_2.HomeWork;

public class Araba {
    private String araba;
    private String model;
    private double motor;
    private String vites;
    private String renk;

    public Araba(String araba, String model, double motor, String vites, String renk) {
        this.araba = araba;
        this.model = model;
        this.motor = motor;
        this.vites = vites;
        this.renk = renk;
    }
    public Araba(){

    }

    public String getAraba() {
        return araba;
    }

    public void setAraba(String araba) {
        this.araba = araba;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public double getMotor() {
        return motor;
    }

    public void setMotor(double motor) {
        this.motor = motor;
    }

    public String getVites() {
        return vites;
    }

    public void setVites(String vites) {
        this.vites = vites;
    }

    public String getRenk() {
        return renk;
    }

    public void setRenk(String renk) {
        this.renk = renk;
    }

    @Override
    public String toString() {
        return  "isim  = " + araba + "\n" +
                "model = " + model + "\n" +
                "motor = "  + motor +"\n" +
                "vites = " + vites + "\n" +
                "renk  = " + renk;
    }
}

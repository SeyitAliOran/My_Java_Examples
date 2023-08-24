package dersler.gun49_Composition.Ev;

public class Cati {
    private double yukseklik;
    private String renk;

    public Cati(double yukseklik, String renk) {
        this.yukseklik = yukseklik;
        this.renk = renk;
    }
    public void tut(){
        System.out.println("Cati tütüyor");
    }

    public double getYukseklik() {
        return yukseklik;
    }

    public String getRenk() {
        return renk;
    }
}

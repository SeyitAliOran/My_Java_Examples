package dersler.gun49_Composition.Ev;

public class Mutfak {
    private String tarz;
    private int metreKare;
    private String dolap;
    private String zemin;

    public Mutfak(String tarz, int metreKare, String dolap, String zemin) {
        this.tarz = tarz;
        this.metreKare = metreKare;
        this.dolap = dolap;
        this.zemin = zemin;
    }
    public void yemekYap(){
        System.out.println("Mutfakta yemek yapabilirsiniz");
    }

    public String getTarz() {
        return tarz;
    }

    public int getMetreKare() {
        return metreKare;
    }

    public String getDolap() {
        return dolap;
    }

    public String getZemin() {
        return zemin;
    }
}

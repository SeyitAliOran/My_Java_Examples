package dersler.gun49_Composition.Ev;

public class Bahce {
    private String zemin;
    private String cit;
    private String mangal;
    private boolean havuz;

    public Bahce(String zemin, String cit, String mangal, boolean havuz) {
        this.zemin = zemin;
        this.cit = cit;
        this.mangal = mangal;
        this.havuz = havuz;
    }
    public void sulamaYap(){
        System.out.println("Bahce sulaniyor");
    }

    public String getZemin() {
        return zemin;
    }

    public String isCit() {
        return cit;
    }

    public String  Mangal() {
        return mangal;
    }

    public boolean isHavuz() {
        return havuz;
    }
}

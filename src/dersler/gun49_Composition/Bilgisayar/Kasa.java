package dersler.gun49_Composition.Bilgisayar;

public class Kasa {
    private String model;
    private String uretici;
    private String gucKaynagi;
    private Boyut boyut; // boyut classini ismi ile obje olusturduk...

    public Kasa(String model, String uretici, String gucKaynagi, Boyut boyut) {
        this.model = model;
        this.uretici = uretici;
        this.gucKaynagi = gucKaynagi;
        this.boyut = boyut;
    }
    public void calistir(){
        System.out.println("Bilgisayar calisiyor!!");
    }

    public String getModel() {
        return model;
    }

    public String getUretici() {
        return uretici;
    }

    public String getGucKaynagi() {
        return gucKaynagi;
    }

    public Boyut getBoyut() {
        return boyut;
    }

}

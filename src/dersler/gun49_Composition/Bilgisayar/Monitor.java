package dersler.gun49_Composition.Bilgisayar;

public class Monitor {
    private String model;
    private String uretici;
    private int ekranBoyutu;
    private Cozunurluk cozunurluk;

    public Monitor(String model, String uretici, int ekranBoyutu, Cozunurluk cozunurluk) {
        this.model = model;
        this.uretici = uretici;
        this.ekranBoyutu = ekranBoyutu;
        this.cozunurluk = cozunurluk;
    }

    public String getModel() {
        return model;
    }

    public String getUretici() {
        return uretici;
    }

    public int getEkranBoyutu() {
        return ekranBoyutu;
    }

    public Cozunurluk getCozunurluk() {
        return cozunurluk;
    }
}

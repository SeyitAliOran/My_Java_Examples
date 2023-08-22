package Ders_Tekrar.Galeri;

public class Araba {
    private  String isim;
    private  String model;
    private  int yil;
    private  String renk;
    private  String vites;
    private double fiyat;

    public Araba() {
    }

    public String getIsim() {
        return isim;
    }

    public void setIsim(String isim) {
        this.isim = isim;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public int getYil() {
        return yil;
    }

    public void setYil(int plaka) {
        this.yil = plaka;
    }

    public String getRenk() {
        return renk;
    }

    public void setRenk(String renk) {
        this.renk = renk;
    }

    public String getVites() {
        return vites;
    }

    public void setVites(String vites) {
        this.vites = vites;
    }
    public double getFiyat() {
        return fiyat;
    }

    public void setFiyat(double fiyat) {
        this.fiyat = fiyat;
    }

    @Override
    public String toString() {
        return "Araba{" +
                "isim='" + isim + '\'' +
                ", model='" + model + '\'' +
                ", yil=" + yil +
                ", renk='" + renk + '\'' +
                ", vites='" + vites + '\'' +
                ", fiyat=" + fiyat +
                '}';
    }
}

package dersler.gun46_Review.Galeri;

public class Araba {
    private String name;
    private String model;
    private String VIN; // Sase no
    private String plaka;

// NonStatic Block
   /* {
        System.out.println("Yeni bir araba instance olusturuldu");
    }

    */

    public Araba(String name, String model, String VIN, String plaka) {
        setName(name);
        setModel(model);
        setVIN(VIN);
        setPlaka(plaka);
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public String getVIN() {
        return VIN;
    }

    public void setVIN(String VIN) {
        this.VIN = VIN;
    }

    public String getPlaka() {
        return plaka;
    }

    public void setPlaka(String plaka) {
        this.plaka = plaka;
    }

    @Override
    public String toString() {
        return "Araba{" +
                "name='" + name + '\'' +
                ", model='" + model + '\'' +
                ", VIN='" + VIN + '\'' +
                ", plaka='" + plaka + '\'' +
                '}';
    }
}

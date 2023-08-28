package dersler.gun51_AbstractClass.Vehicle;

public class OtoparkTest {
    public static void main(String[] args) {
        Otopark otopark = new Otopark("Halk Otopark","Cumhuriyet caddesi No:193");
        Sedan otomobil1 = new Sedan("Renault","Megane",2022,"Kirmizi",4);
        Sedan otomobil2 = new Sedan("Honda","Accord",2020,"Gri",2);
        Otobus otobus = new Otobus("Mercedes","Neoplan",2012,"Siyah",6);

        otopark.addArac(otobus);
        otopark.addArac(otomobil1);
        otopark.addArac(otomobil2);
        otopark.aracListe();

    }
}

package dersler.gun40_Encapculation_2.HomeWork;

public class GaleriYonetimi {
    public static void main(String[] args) {
        Galeri galeri1 = new Galeri();
        Araba araba1 = new Araba("Mercedes","2022",2.2,"Otomatik","Mavi");
        galeri1.arabaEkle(araba1);
        galeri1.arabalariGoster();
        System.out.println();

        Araba araba2 = new Araba();
        araba2.setAraba("Nissan");
        araba2.setModel("2015");
        araba2.setMotor(1.6);
        araba2.setVites("Otomatik");
        araba2.setRenk("Gri");
        galeri1.arabaEkle(araba2);
        galeri1.arabalariGoster();



    }
}

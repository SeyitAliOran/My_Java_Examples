package dersler.gun40_Encapculation_2.HomeWork;

import java.util.ArrayList;

public class Galeri {
   private final ArrayList<Araba> arabalar;

    public Galeri() {
        this.arabalar = new ArrayList<>();
    }
    public void arabaEkle(Araba araba){
        this.arabalar.add(araba);
    }
    public void modelEkle(Araba model){
        this.arabalar.add(model);
    }
    public void motorEkle(Araba motor){
        this.arabalar.add(motor);
    }
    public void vitesEkle(Araba vites){
        this.arabalar.add(vites);
    }
    public void renkEkle(Araba renk){
        this.arabalar.add(renk);
    }
    public void arabalariGoster(){
       int counter = 0;
             System.out.println("                  Oran Galeri                     ");
            System.out.println("***************************************************");
        for (Araba araba: arabalar) {
            System.out.println(araba);
            counter++;
            System.out.println("....................................................");
        }
        System.out.println("Galerinizde toplam " + counter + " arac bulunmaktadir...");
    }


    public ArrayList<Araba> getArabalar() {
        return arabalar;
    }

    @Override
    public String toString() {
        return "Oran Galeri" + "\n"+
                "Araba isimleri = " + arabalar;
    }
}

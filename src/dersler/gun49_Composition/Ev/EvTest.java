package dersler.gun49_Composition.Ev;

public class EvTest {
    public static void main(String[] args) {
        Oda oda1 = new Oda("Yatak Odasi","Mavi");
        Oda oda2 = new Oda("Cocuk Odasi","Beyaz");
        Oda oda3 = new Oda("Oturma odasi","Turuncu");
        Oda oda4 = new Oda("Yemek Odasi","Sari");
        Bahce bahce = new Bahce("cim","Demir cit","Elektrikli mangal ",true);
        Mutfak mutfak = new Mutfak("Amerikan",40,"Gomme dolap","fayans");
        Cati cati = new Cati(10,"Beyaz");
        Ev evim = new Ev("Villa",bahce,mutfak,cati,oda1,oda2,oda3,oda4);
        evim.kapiAc();
        evim.getCati().tut();
        evim.getMutfak().yemekYap();
        evim.getBahce().sulamaYap();
        System.out.println(evim.getOda1().getNeOdasi());
        System.out.println(evim.getOda1().getRenk());
        System.out.println("Evim de havuz var mi ? " + evim.getBahce().isHavuz());


    }
}

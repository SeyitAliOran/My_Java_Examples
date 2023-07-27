package dersler.gun35_ArrayList;

import java.util.ArrayList;

public class Otopark {
    String adi;
    String adresi;
    ArrayList<Araba> arabalar = new ArrayList<>();

    public void showInfo(){
        System.out.println("Otopark adı : " + adi);
        System.out.println("Adresi      : " + adresi);
        System.out.println("Otopark araç listesi :" + " toplam " + arabalar.size() + " araç var.");
        System.out.println("---------------------------------------");
        for (Araba araba:arabalar){
            araba.showInfo();
            System.out.println();
        }
    }
    public void aracEkle(Araba araba){
        if(!araba.plaka.isBlank()){
            arabalar.add(araba);
        } else System.out.println("Palaka bilgisi boş olamaz!!!");
    }
}
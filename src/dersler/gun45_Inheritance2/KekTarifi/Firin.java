package dersler.gun45_Inheritance2.KekTarifi;

import java.util.ArrayList;

public class Firin {
    private int derece;
    private int sure;
    private ArrayList<Kek> tepsiler;
    Firin(){
        this.tepsiler = new ArrayList<>();
    }
    Firin(int derece,int sure){
        this();
        this.derece = derece;
        this.sure = sure;
    }

    public int getDerece() {
        return derece;
    }

    public void setDerece(int derece) {
        this.derece = derece;
    }

    public int getSure() {
        return sure;
    }

    public void setSure(int sure) {
        this.sure = sure;
    }

    public ArrayList<Kek> getTepsiler() {
        return tepsiler;
    }
    public void tepsiyeEkle(Kek kek){
        this.tepsiler.add(kek);
    }

    public void showTepsiler(){
        if (tepsiler.size()>0){
            System.out.println("Firinda sua an pisen kekler");
            for (Kek kek: this.tepsiler){
                if (kek instanceof Kek){
                    System.out.println("Sade keki pisiriyrum");
                }if (kek instanceof CevizliKek){
                    System.out.println("Cevizli keki pisiriyrum");
                }
                if (kek instanceof CikolataliKek){
                    System.out.println("Cikolatali Kek keki pisiriyrum");
                }
                System.out.println(kek.name);
        }

        }else System.out.println("Firinda kek yok");
    }

}

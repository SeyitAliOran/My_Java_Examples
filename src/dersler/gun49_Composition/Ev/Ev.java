package dersler.gun49_Composition.Ev;

public class Ev {
    private String isim;
    private Bahce bahce;
    private Mutfak mutfak;
    private Cati cati;
    private Oda oda1;
    private Oda oda2;
    private Oda oda3;
    private Oda oda4;


    public Ev(String isim, Bahce bahce, Mutfak mutfak, Cati cati, Oda oda1, Oda oda2, Oda oda3, Oda oda4) {
        this.isim = isim;
        this.bahce = bahce;
        this.mutfak = mutfak;
        this.cati = cati;
        this.oda1 = oda1;
        this.oda2 = oda2;
        this.oda3 = oda3;
        this.oda4 = oda4;
    }

    public void kapiAc(){
        System.out.println("Kapi aciliyor");
    }

    public String getIsim() {
        return isim;
    }

    public Bahce getBahce() {
        return bahce;
    }

    public Mutfak getMutfak() {
        return mutfak;
    }

    public Cati getCati() {
        return cati;
    }

    public Oda getOda1() {
        return oda1;
    }

    public Oda getOda2() {
        return oda2;
    }

    public Oda getOda3() {
        return oda3;
    }

    public Oda getOda4() {
        return oda4;
    }
}

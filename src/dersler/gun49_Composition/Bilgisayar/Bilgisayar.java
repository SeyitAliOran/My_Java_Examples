package dersler.gun49_Composition.Bilgisayar;

import dersler.gun18_Branching_Labelled_Statements.PrimeNumberAsalSayi;

public class Bilgisayar {
    private Anakart anakart;
    private Monitor monitor;
    private Kasa kasa;

    public Bilgisayar(Anakart anakart, Monitor monitor, Kasa kasa) {
        this.anakart = anakart;
        this.monitor = monitor;
        this.kasa = kasa;
    }

    public Anakart getAnakart() {
        return anakart;
    }

    public Monitor getMonitor() {
        return monitor;
    }

    public Kasa getKasa() {
        return kasa;
    }

    @Override
    public String toString() {
        return "Bilgisayar{" +
                "anakart=" + anakart +
                ", monitor=" + monitor +
                ", kasa=" + kasa +
                '}';
    }
}

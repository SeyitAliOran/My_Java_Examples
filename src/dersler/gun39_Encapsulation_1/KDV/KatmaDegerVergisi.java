package dersler.gun39_Encapsulation_1.KDV;

public class KatmaDegerVergisi {
    // final sabit degerler icin kullanilir. KDV_TEMIZLIK-KDV_EGITIM-KDV_YIYECEK sabit degerler
    private final double KDV_TEMIZLIK = 0.19; // final sabit degerler icin kullanilir
    private final double KDV_EGITIM = 0.12;
    private final double KDV_YIYECEK = 0.18;
    private double tutar;
    private double result;

    public KatmaDegerVergisi(){

    }
    public KatmaDegerVergisi(double tutar) {
        setTutar(tutar);
    }

    public double getTutar() {
        return tutar;
    }

    public void setTutar(double tutar) {
        if (tutar>0)  this.tutar = tutar;
    }
    public void kdvHesaplaTemizlik(){
        this.result = tutar  * KDV_TEMIZLIK + tutar;
    }
    public void kdvHesaplaEgitim(){
        this.result = tutar  * KDV_EGITIM + tutar;
    }
    public void kdvHesaplaYiyecek(){
        this.result = tutar  * KDV_YIYECEK + tutar;
    }

    public double getResult() {
        return result;
    }
}

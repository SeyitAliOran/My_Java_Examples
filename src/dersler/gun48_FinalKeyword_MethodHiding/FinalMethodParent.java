package dersler.gun48_FinalKeyword_MethodHiding;

public class FinalMethodParent {
    final double KDV_ORANI = 0.18;

    public final double kdvHesapla(double miktar){
        return miktar += KDV_ORANI * miktar;
    }

    public void normalMethod(String mesaj){
        System.out.println(mesaj);
    }

}

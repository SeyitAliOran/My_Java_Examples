package dersler.gun39_Encapsulation_1.KDV;

public class KdvTest {
    public static void main(String[] args) {
        KatmaDegerVergisi kdv1 = new KatmaDegerVergisi(100);
        kdv1.kdvHesaplaTemizlik();
        System.out.println("kdv1.getResult() = " + kdv1.getResult());
        System.out.println();

        kdv1.setTutar(200);
        kdv1.kdvHesaplaEgitim();
        System.out.println("kdv1.getResult() = " + kdv1.getResult());
        kdv1.kdvHesaplaYiyecek();
        System.out.println("kdv1.getResult() = " + kdv1.getResult());
    }
}

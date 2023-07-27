package dersler.gun40_Encapculation_2.WriteReadClass;

public class ReadOnlyTest {
    public static void main(String[] args) {
        ReadOnlyClass readOnlyClass = new ReadOnlyClass(34,"Istanbul");
        System.out.println("Plaka  = " + readOnlyClass.getPlaka());
        System.out.println("Il Adi = " + readOnlyClass.getIlAdi());

    }

}

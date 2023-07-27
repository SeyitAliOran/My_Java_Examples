package dersler.gun40_Encapculation_2.WriteReadClass;

import java.util.ArrayList;

public class ReadOnlyClass {
    // Read only Class'lar da degiskenlere final eklemek daha dogru olur..
    // Final olarak tanimlanmis bir objeye ilk deger atandiktan sonradadeger atanamaz.
    // Bu nedenle de setter olusturulamaz
    private final int plaka;
    private final String ilAdi;

    public ReadOnlyClass(int plaka, String ilAdi) {
        this.plaka = plaka;
        this.ilAdi = ilAdi;

    }

    public int getPlaka() {
        return plaka;
    }

    public String getIlAdi() {
        return ilAdi;
    }


}

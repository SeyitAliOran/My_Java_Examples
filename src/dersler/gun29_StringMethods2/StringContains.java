package dersler.gun29_StringMethods2;

public class StringContains {
    public static void main(String[] args) {
        String email ="test@gmail.com";
        System.out.println("email.contains(\"@\") = " + email.contains("@"));

        String liste = "domates,patates,havuc,salatalik";
        if (liste.contains("muz")){
            System.out.println("aradiginiz urun mevcut");
        }else{
            System.out.println("Aradiginiz urun mevcut degil");
        }
        boolean havucVarMi = liste.contains("havuc");
        System.out.println("havucVarMi = " + havucVarMi);
        boolean muzVarMi = liste.contains("muz");
        System.out.println("muzVarMi = " + muzVarMi);
    }
}

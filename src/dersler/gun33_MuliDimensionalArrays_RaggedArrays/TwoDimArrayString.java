package dersler.gun33_MuliDimensionalArrays_RaggedArrays;

public class TwoDimArrayString {
    public static void main(String[] args) {
        String[][] siniflar = new String[5][10];

        for (int i = 0; i < siniflar.length; i++) {
            for (int j = 0; j < siniflar[i].length; j++) {
                siniflar[i][j] = "isimsiz";
            }
        }
        siniflar[4][5] = "Ahmet";
        siniflar[2][7] = "Ayşe";

        System.out.println();
        for (int i = 0; i < siniflar.length; i++) {
            for (int j = 0; j < siniflar[i].length; j++) {
                if (!siniflar[i][j].equals("isimsiz")){
                    siniflar[i][j] = siniflar[i][j].toUpperCase();
                }
            }
        }

        for (String[] ogrenciler : siniflar ){
            for (String ogrenci : ogrenciler){
                System.out.print(ogrenci + " ");
            }
            System.out.println();
        }
    }
}

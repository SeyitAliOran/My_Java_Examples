package dersler.gun30_Array;

public class PrintingArrayReversed {
    public static void main(String[] args) {
        String[] sehirler = {"Ankara","Canakkale","Konya"};
        for (int i = 0; i < sehirler.length; i++) {
            System.out.println(sehirler[i]);
        }
        System.out.println();
        for (int j = sehirler.length-1; j >=0 ; j--) {
            System.out.println(sehirler[j]);
        }
    }
}

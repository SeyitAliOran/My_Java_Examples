package Alistirmalarim;

public class MantiksalOperatorler {
    public static void main(String[] args) {
        int a= 10,b = 20, c = 5, d = 50;
        boolean kosul1 = a<b;
        boolean kosul2 = d>c;
        boolean sonuc2 = (a<b) && (d<c);
        System.out.println("sonuc2 = " + sonuc2); // her iki kosulda true oldugu icin sonuc TRUE olur

        boolean sonuc3 = (kosul1 || kosul2);
        System.out.println("sonuc3 = " + sonuc3 +"\n"); // her ikisinden biri saglaniyorsa veya baglacinda TRUE alinir
        boolean kosul3 = a > b;
        boolean kosul4 = d<c;
        boolean sonuc4 = (kosul3 || kosul4);
        System.out.println("sonuc4 = " + sonuc4);


    }
}

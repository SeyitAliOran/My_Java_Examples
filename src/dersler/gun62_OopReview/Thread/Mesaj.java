package dersler.gun62_OopReview.Thread;

import java.util.Date;

public class Mesaj extends Thread {

    private static final int TEKRAR = 10;
    private static final int BEKLE = 1000;

    private String mesaj;

    public Mesaj(String mesaj) {
        this.mesaj = mesaj;
    }

    //Multi-thread- Every thread runs this method Ã¼
    public void run() {
        try {
            for (int i = 1; i <= TEKRAR; i++) {
                Date now = new Date();
                System.out.println(now + " " + mesaj);
                Thread.sleep(BEKLE);
            }
        } catch (InterruptedException exception) {
        }
    }
}

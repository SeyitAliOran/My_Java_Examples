package dersler.gun62_OopReview.Thread;

public class MesajThreadTest {
    public static void main(String[] args) {
        //Created 4 intance of Mesaj class
        Mesaj msj1 = new Mesaj("Hello");
        Mesaj msj2 = new Mesaj("Goodbye");
        Mesaj msj3 = new Mesaj("Merhaba");
        Mesaj msj4 = new Mesaj("ByeBye");

        //Every thread runs an instance
        Thread thread1 = new Thread(msj1);
        Thread thread2 = new Thread(msj2);
        Thread thread3 = new Thread(msj3);
        Thread thread4 = new Thread(msj4);

        thread1.start();
        thread2.start();
        thread3.start();
        thread4.start();
    }
}
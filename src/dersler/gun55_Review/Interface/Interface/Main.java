package dersler.gun55_Review.Interface.Interface;

public class Main {
    public static void main(String[] args) {
        // Sekil sekil = new Sekil(); --> Interface lerden object create edemeyiz

        Sekil.myMethod5(); // method static oldugundan dolayi direkt ulasabiliyoruz
        System.out.println(Sekil.MAX_SIZE);
        System.out.println(Sekil.DEFAULT_NAME);

    }
}

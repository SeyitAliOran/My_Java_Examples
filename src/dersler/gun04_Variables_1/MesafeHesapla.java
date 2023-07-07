package dersler.gun04_Variables_1;

public class MesafeHesapla {
    public static void main(String[] args) {
        int speedKm;
        int timeHr;
        int distanceKm;

        speedKm = 170;
        timeHr = 3;
        distanceKm = speedKm * timeHr;
        System.out.println("Arabanin hizi           :" + speedKm +" km/saat");
        System.out.println("Gidilen sure            :" + timeHr + " saat");
        System.out.println("Toplam katedilen mesafe :" + distanceKm + " km");

        System.out.println();

        speedKm = 220;
        timeHr = 5;
        distanceKm = speedKm * timeHr;
        System.out.println("Arabanin hizi           :" + speedKm +" km/saat");
        System.out.println("Gidilen sure            :" + timeHr + " saat");
        System.out.println("Toplam katedilen mesafe :" + distanceKm + " km");

    }
}

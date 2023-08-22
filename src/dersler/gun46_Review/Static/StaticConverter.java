package dersler.gun46_Review.Static;

public class StaticConverter {
    // Bir constructoru private yaparak bu classin disinda ki erisimi engellemis oluruz. Bu neden instance/Object olusturamayiz
    private StaticConverter(){

    }
    public static double milesToKilometers(double mile){
        return mile * 1.609;
    }
    public static double KilometersToMiles(double km){
        return km / 1.609;
    }
    public static double kdvHesapla(double miktar){
        return miktar * 0.18;
    }

}

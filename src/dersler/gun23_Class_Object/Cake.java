package dersler.gun23_Class_Object;

public class Cake {

    String baker;
    int slice; // dilim sayisi
    boolean isChocolate;
    boolean isEgg;
    double weight;
    static int cakeSlice = 10; // bu deger sadece classa ait

    public void eating(){
        slice--;
        System.out.println(baker+ "'s cake slice is " + slice);
        cakeSlice--;
        System.out.println("CakeSlice is " + cakeSlice);
    }
}


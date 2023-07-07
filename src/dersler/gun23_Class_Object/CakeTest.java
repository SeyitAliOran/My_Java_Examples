package dersler.gun23_Class_Object;

public class CakeTest{
    public static void main(String[] args) {

        Cake cake1 = new Cake();
        cake1.baker = "Ahmet";
        cake1.isChocolate = true;
        cake1.isEgg = true;
        cake1.weight = 2;
        cake1.slice = 10;

        Cake cake2 = new Cake();
        cake2.baker = "Ayse";
        cake2.isChocolate = false;
        cake2.isEgg = true;
        cake2.weight = 2;
        cake2.slice = 10;

        // Instance degisken ile static degisken arasindaki hareket tarzi farki...
        cake1.eating(); // Ahmet's cake slice is 9 CakeSlice is 9
        cake1.eating(); // Ahmet's cake slice is 8 CakeSlice is 8
        cake2.eating(); // Ahmet's cake slice is 9 CakeSlice is 7


    }
}

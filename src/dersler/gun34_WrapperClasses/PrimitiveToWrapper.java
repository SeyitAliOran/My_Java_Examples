package dersler.gun34_WrapperClasses;

public class PrimitiveToWrapper {
    public static void main(String[] args) {

        // Primitive data turlerini objecte cevirme
        int num = 10;
        double num2 = 25.3;
        boolean b = true;

        Integer object1 = Integer.valueOf(num);
        Double object2 = Double.valueOf(num2);
        Boolean object3 = Boolean.valueOf(b);
        System.out.println("object1 = " + object1);
        System.out.println("object2 = " + object2);
        System.out.println("object3 = " + object3);
        System.out.println();

        if (object1 instanceof Integer){ // object1 degiskeninin wrapper objecte cevrilip cevrilmedigini kontrol eder.
            System.out.println(num + " degiskeni " + object1 + " wrapper objecte cevrilmistir");
        }
        System.out.println();
        if (object3 instanceof Boolean){ // object1 degiskeninin wrapper objecte cevrilip cevrilmedigini kontrol eder.
            System.out.println(b + " degiskeni " + object3 + " wrapper objecte cevrilmistir");
        }
        System.out.println();

      /* object2 double oldugu icin objecte cevirelemeyecek buy yuzden else kullanmaya gerek yok
      if (object2 instanceof Integer){ // object1 degiskeninin wrapper objecte cevrilip cevrilmedigini kontrol eder.
            System.out.println(object1 + " degiskeni wrapper objecte cevrilmistir");
        }else{
            System.out.println(object1 + " degiskeni wrapper objecte cevrilmemistir");
        }
*/
    }
}

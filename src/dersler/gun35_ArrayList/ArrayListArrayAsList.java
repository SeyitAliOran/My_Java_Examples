package dersler.gun35_ArrayList;

import dersler.gun31_Arrays2.Person;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;

public class ArrayListArrayAsList{
    public static void main(String[] args) {
        ArrayList<String> sehirlerList = new ArrayList<>();
        ArrayList<Integer> plakalarList = new ArrayList<>();

        sehirlerList.add("Adana");
        sehirlerList.add("Konya");
        sehirlerList.add("Canakkale");

        plakalarList.add(1);
        plakalarList.add(42);
        plakalarList.add(17);

        System.out.println("Printing elements of arrayLists added order");
        System.out.println("-------------------------------------------");
        System.out.println(sehirlerList);
        System.out.println(plakalarList);
        System.out.println();

        Collections.sort(sehirlerList); // ArrayList i Collections.sort() methodunu kullanarak harf sirasina gore siralayabiliriz.
        System.out.println(sehirlerList);
        Collections.sort(plakalarList);
        System.out.println(plakalarList);// ArrayList i Collections.sort() methodunu kullanarak numara sirasina gore siralayabiliriz.
        System.out.println();


        // Creating ArrayList with initial values...
        String[] isimler ={"Ahmet","Mehmet","Ali"};
        ArrayList<String> isimlerList = new ArrayList<>(Arrays.asList("Hasan","Ali","Hakan","Ayse"));
        System.out.println(isimlerList);
        ArrayList<String > isimler2 = new ArrayList<>(Arrays.asList(isimler)); // Arrayde ki bir listeyide  Arrays.asList ile ekleyebiliyoruz
        System.out.println(isimler2);
        Collections.sort(isimler2);
        System.out.println(isimler2); // Isim listesine gore siralanmis hali




      /*
      Onceden olusturdugumuz person class indan aldik
      Person person = new Person();
        Person person1 = new Person();
        ArrayList<Person> persons = new ArrayList<>();
        person.name = "Ali";
        person1.name = "Hasan";
        persons.add(person1);
        persons.add(person);
        Collections.sort(person);
        bunu kullanamiyoruz cunku person listesinde fazla degisken oldugu icin hangi sile siralama yapacagini bilmediginden
        farkli method kullanmamiz gerekiyor....
*/
    }
}

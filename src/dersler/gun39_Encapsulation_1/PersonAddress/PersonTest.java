package dersler.gun39_Encapsulation_1.PersonAddress;

public class PersonTest {
    public static void main(String[] args) {
        Adres adres1 = new Adres("    Abc   ","Ankara    ",1234);
        Adres adres2 = new Adres("       ","Konya",0);
        Adres adres3 = new Adres("Sahil","Bodrum",1245);
        Adres adres4 = new Adres("Siemens","Berlin/Germany",16789);

        System.out.println("adres1 = " + adres1.toString());
        System.out.println("adres2 = " + adres2);

        Person person1 = new Person("     Ahmet Falanca      ",45,adres1,adres2);
        person1.addAdres(adres3);
        person1.addAdres(adres4);

        for (int i = 0; i < 1000000; i++) {
            person1.addAdres(adres4);
        }
        System.out.println(person1);
    }
}

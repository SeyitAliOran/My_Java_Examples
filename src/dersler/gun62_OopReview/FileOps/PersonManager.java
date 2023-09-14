package dersler.gun62_OopReview.FileOps;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.Scanner;

public class PersonManager {

    public static void main(String[] args) {
        String dosya = "Person.txt";
        Scanner scanner = new Scanner(System.in);
        String name = "";
        String adres = "";

        while (true) {
            System.out.print("Kişinin adını giriniz: ");
            name = scanner.nextLine();
            if (name.isBlank() | name.isEmpty())
                break;
            System.out.print("Adresini giriniz : ");
            adres = scanner.nextLine();
            //Person person = new Person("Ahmet Falanca","Ankara-Türkiye");
            Person person = new Person(name, adres);

            try {
                PrintWriter dosyaYaz = new PrintWriter(new FileOutputStream(dosya, true));
                dosyaYaz.println(person.getName() + "," + person.getAdresi());
                dosyaYaz.close();

            } catch (FileNotFoundException e) {
                throw new RuntimeException(e);
            }
        }
        ArrayList<Person> personArrayList = new ArrayList<>();
        try {
            Scanner dosyaOku = new Scanner(new File("Person.txt"));
            while (dosyaOku.hasNext()) {
                //System.out.println(dosyaOku.nextLine());
                String[] kayit = dosyaOku.nextLine().split(",");
                // Person person = new Person(kayit[0], kayit[1]);
                personArrayList.add(new Person(kayit[0], kayit[1]));

            }
        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        }
        System.out.println(personArrayList);
    }
}

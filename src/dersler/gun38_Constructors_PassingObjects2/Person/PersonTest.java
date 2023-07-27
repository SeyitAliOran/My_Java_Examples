package dersler.gun38_Constructors_PassingObjects2.Person;

public class PersonTest {
    public static void main(String[] args) {
        Person person1 = new Person("Ali");
        System.out.println("person1.name = " + person1.name);
        System.out.println();
        Person person2 = new Person("Ahmet",15);
        System.out.println("person2.name = " + person2.name);
        System.out.println("person2.age = " + person2.age);
        System.out.println();
        Person person3 = new Person("Ayse",22,"Ankara");
        System.out.println("person3.name = " + person3.name);
        System.out.println("person3.age = " + person3.age);
        System.out.println("person3.address = " + person3.address);
        System.out.println();
        Person person4 = new Person("Hatice",25,"Istanbul","Manager");
        System.out.println("person4.name = " + person4.name);
        System.out.println("person4.age = " + person4.age);
        System.out.println("person4.address = " + person4.address);
        System.out.println();
        Person person5 = new Person("Fatma",35,"Amasya","Java",'F');
        System.out.println("person5.name = " + person5.name);
        System.out.println("person5.age = " + person5.age);
        System.out.println("person5.address = " + person5.address);
        System.out.println("person5.gender = " + person5.gender);
        System.out.println();
        // toString() metodu ile butun hepsini tek satirda yazdirabiliriz...
        System.out.println("person5.toString() = " + person5.toString());
    }
}

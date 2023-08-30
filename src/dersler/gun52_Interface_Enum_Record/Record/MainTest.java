package dersler.gun52_Interface_Enum_Record.Record;

public class MainTest {
    public static void main(String[] args) {
        Person person = new Person("Ali","ankara",2);
        System.out.println(person);
        System.out.println();
        PersonRecord personRecord = new PersonRecord("ahmet","amasya",3,123,"merkez");
        System.out.println(personRecord);
    }
}

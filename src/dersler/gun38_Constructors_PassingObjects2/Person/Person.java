package dersler.gun38_Constructors_PassingObjects2.Person;

public class Person {
    String name;
    int age;
    String address;
    String job;
    char gender;
// Metod Chaining this(...) ile constructorlarin icine constructor ekleyebiliyoruz...
    public Person(String name) {
        this.name = name;
    }

    public Person(String name, int age) {
        this(name);
        this.age = age;
    }

    public Person(String name, int age, String address) {
        this(name,age);
        this.address = address;
    }
    public Person(String name, int age, String address,String job){
        this(name,age,address);
        this.job= job;
    }
    public Person(String name, int age, String address,String job, char gender){
        this(name,age,address,job);
        this.gender = gender;
    }

    // sag tiklayip generate basip toString() secerek otomatik ekliyoruz...
    // metodun icerisini kendimiz istedigimiz sekilde degistirebiliyoruz...
    @Override
    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", address='" + address + '\'' +
                ", job='" + job + '\'' +
                ", gender=" + gender +
                '}';
    }
}

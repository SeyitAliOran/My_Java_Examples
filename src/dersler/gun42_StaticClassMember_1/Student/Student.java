package dersler.gun42_StaticClassMember_1.Student;

public class Student {
    String name;
    int age;
    int idNummer;
    static String school = "Eurotech";
    static int schoolNumber = 1000;

    /*public Student(String name, int age, int idNummer, String school) {
        this.name = name;
        this.age = age;
        this.idNummer = idNummer;
        this.school = school;
    }
     */
// bu sekilde okul ismini sabit giriyoruz
    /*public Student(String name, int age, int idNummer) {
        this.name = name;
        this.age = age;
        this.idNummer = idNummer;
    }
     */
// Static olan scholNumber dan artirilan degeri static olmayan idNumber a atayarak id numberi 1 artirdik
    public Student(String name, int age) {
        this.name = name;
        this.age = age;
        schoolNumber++; // static int schoolNumber = 1000; static oldugundan bu sekilde id numberi otomatik olarak burada 1 artiriyoruz...
        this.idNummer = schoolNumber;
    }

    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", idNummer=" + idNummer +
                ", school='" + school + '\'' +
                '}';
    }
}

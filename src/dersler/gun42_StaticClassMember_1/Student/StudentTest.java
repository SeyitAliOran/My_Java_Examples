package dersler.gun42_StaticClassMember_1.Student;

public class StudentTest {
    public static void main(String[] args) {
       /* Student student1 = new Student("Mehmet", 15,1000,"Eurotech");
        Student student2 = new Student("Osman", 16,1001,"Eurotech");
        Student student3 = new Student("Elif", 17,1002,"CyberTech");7

        */
        /*Student student1 = new Student("Mehmet", 15,1000);
        Student student2 = new Student("Osman", 16,1001);
        Student student3 = new Student("Elif", 17,1002);



        // student3.school = "as"; ---> school degiskenini static yaparak sonradan onceden atanmis butun okul isimlerini degistirebiliriz

         */
        Student student1 = new Student("Mehmet", 15);
        Student student2 = new Student("Osman", 16);
        Student student3 = new Student("Elif", 17);
        System.out.println(student1.toString());
        System.out.println(student2.toString());
        System.out.println(student3.toString());


        student1.school = "TechPro";
        System.out.println(student1);

        //  eger deger static ise sadeeona class uzerinden ulasabiliirz.school static oldugu icin ulastik
        Student.school ="AnotherSchool";
        System.out.println(student1.toString());
        System.out.println(student2.toString());
        System.out.println(student3.toString());



    }
}

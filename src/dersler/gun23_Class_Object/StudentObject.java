package dersler.gun23_Class_Object;

public class StudentObject {
    public static void main(String[] args) {
        Student student1 = new Student();
        student1.name = "Ahmet";
        student1.surName = "Ates";
        student1.className = "11A";
        student1.schoolNumber = 1234;
        student1.age = 14;
        student1.weight =1.56;

        System.out.println("student1.name = " + student1.name);
        System.out.println("student1.surName = " + student1.surName);
        System.out.println("student1.className = " + student1.className);
        System.out.println("student1.schoolNumber = " + student1.schoolNumber);
        System.out.println("student1.age = " + student1.age);
        System.out.println("student1.weight = " + student1.weight);
        student1.code();
        student1.eat();
        student1.run();
        student1.study();
    }
}

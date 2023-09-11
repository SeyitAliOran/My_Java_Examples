package dersler.gun60_Maps;

import java.util.HashMap;
import java.util.Map;

public class StudentMap {
    public static void main(String[] args) {

        // id ile butun Studen classini gosteriyoruz
        // map de de hep objectler ile ugrasiyoruz
        Map <Integer,Student> students = new HashMap<>();

        Student student1 = new Student("Ali",1234,95.5);
        Student student2 = new Student("Veli",4321,87.3);
        Student student3 = new Student("Delo",5678,65.5);

        students.put(student1.getId(),student1); // student id yi student1 e mapledik
        students.put(4321,student2); // student id yi student2 e mapledik
        students.put(student3.getId(),student3); // student id yi student3 e mapledik

        System.out.println("Student with 1234 id: " + students.get(1234));
        System.out.println("Student with 4321 id: " + students.get(student1.getId()));
        System.out.println("Student with 5678 id: " + students.get(5678));
    }
}
class Student{
    public String name;
    public int id;
    public double grade;

    public Student(String name, int id, double grade) {
        this.name = name;
        this.id = id;
        this.grade = grade;
    }

    public String getName() {
        return name;
    }

    public int getId() {
        return id;
    }

    public double getGrade() {
        return grade;
    }

    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", id=" + id +
                ", grade=" + grade +
                '}';
    }
}

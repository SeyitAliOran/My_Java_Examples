package dersler.gun38_Constructors_PassingObjects2.Student;

public class StudentTest {
    public static void main(String[] args) {
        Student student1 = new Student("Ayse",20);
        System.out.println("student1.toString() = " + student1.toString()); // Student{name='Ayse', age=20, department='Not Assigned'}

        Student student2 = new Student("Ali",22,"Computer Science");
        System.out.println("student2.toString() = " + student2.toString()); //Student{name='Ali', age=22, department='Computer Science'}

        Student student3 = new Student(23);
        System.out.println("student3.toString() = " + student3.toString()); //Student{name='Unkonown', age=23, department='Not Assigned'}

        Student student4 = new Student();
        System.out.println("student4.toString() = " + student4.toString());//Student{name='Unkonown', age=0, department='Not Assigned'}
    }
}

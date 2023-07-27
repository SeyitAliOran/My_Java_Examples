package dersler.gun40_Encapculation_2.CourseManager;

public class CourseManager {
    public static void main(String[] args) {
        Course course1 = new Course("SDET");
        Course course2 = new Course("Mobile Development");




        Student student1 = new Student("Ahmet");
        Student student2 = new Student("Hasan");
        Student student3 = new Student("Kadriye");
        Student student4 = new Student("Ali");
        Student student5 = new Student("Fatma");

        Teacher teacher1 = new Teacher("Kenan Bey");
        Teacher teacher2 = new Teacher("Ayse Hanim");
        Teacher teacher3 = new Teacher("Seda Hanim");

        Lesson lesson1= new Lesson("Java");
        Lesson lesson2= new Lesson("Android dev.");
        Lesson lesson3= new Lesson("Selenium");

        lesson1.addStudent(student2);
        lesson1.addStudent(student3);

        lesson3.addStudent(student4);
        lesson3.addStudent(student2);
        lesson3.addStudent(student5);

        lesson3.addTeacher(teacher3);

        lesson1.addTeacher(teacher1);
        lesson1.addTeacher(teacher2);

        course1.addLesson(lesson1);
        course1.addLesson(lesson3);
        course1.addTeacher(teacher1);
        course1.addTeacher(teacher3);
        course1.addStudent(student1);
        course1.addStudent(student2);
        course1.addStudent(student3);
        course1.addStudent(student4);
        course1.addTeacher(teacher1);
        course1.addTeacher(teacher2);
        course1.showLessons();

       /* course1.showTeachers();
        course1.showStudents();
        System.out.println(course1);
        */
    }
}

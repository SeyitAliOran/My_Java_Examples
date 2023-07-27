package dersler.gun40_Encapculation_2.CourseManager;

import java.util.Scanner;

public class CourseManagerScannerClass {
    public static void main(String[] args) {

        createCourse();
    }

    public static void createCourse(){
        Scanner scanner = new Scanner(System.in);
        Course course = null;
        Lesson lesson = null;


            String courseName;
            System.out.print("Please enter your the name of Course : ");
            courseName= scanner.nextLine();
            course = new Course(courseName);

        while (true){
           // Ders ekleme
            String dersAdi = "";
            System.out.print("Ders adini giriniz : ");
            dersAdi = scanner.nextLine();
            if (dersAdi.isBlank() || dersAdi.isEmpty()){
                break;
            }else {
                lesson = new Lesson(dersAdi);
                addTeacher(lesson);
                addStudent(lesson);
                course.addLesson(lesson);
            }
        }
        course.showLessons();

    }


    public static void addTeacher(Lesson lesson){
        Teacher teacher = null;
        Scanner scanner = new Scanner(System.in);
        String teacherName = "";
        while (true) {
            System.out.print("Ogretmenin adini giriniz: ");
            teacherName = scanner.nextLine();
            if (teacherName.isEmpty()||teacherName.isBlank()){
                break;
            }
            else {
                teacher = new Teacher(teacherName);
                lesson.addTeacher(teacher);
            }
        }
    }

    public static void addStudent(Lesson lesson){
        Student student = null;
        Scanner scanner = new Scanner(System.in);
        String studentName = "";
        while (true) {
            System.out.print("Ogrencinin adini giriniz: ");
            studentName = scanner.nextLine();
            if (studentName.isEmpty()||studentName.isBlank()){
                break;
            }
            else {
                student = new Student(studentName);
                lesson.addStudent(student);
            }
        }
    }



}

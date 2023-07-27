package dersler.gun40_Encapculation_2.CourseManager;

import java.util.ArrayList;

public class Lesson {
    // verilere ulasmak icin direkt elemanlara degil de metodlar uzerinden ulasabiliriz
    private String lessonName;
    private final ArrayList<Teacher> teachers; // Teacher class'in daki ogretmenleri ArrayListe eklemek icin olusturduk
    private final ArrayList<Student> students; // Student class'in daki ogrencilere ArrayListe eklemek icin olusturduk

    // Constructor
    public Lesson(String lessonName) {
        this.lessonName = lessonName;
        this.students = new ArrayList<>();
        this.teachers = new ArrayList<>();
    }

    public String getLessonName() {
        return lessonName;
    }

    public void setLessonName(String lessonName) {
        this.lessonName = lessonName;
    }
    public ArrayList<Student> getStudents() {
        return students;
    }
    public void addStudent(Student student){
        if (this.students.contains(student)){
            System.out.println(student.getName() + " adli ogrenci daha once bu derse eklenmis!!");
        }else this.students.add(student);
    }
    public ArrayList<Teacher> getTeachers() {
        return teachers;
    }

    public void addTeacher(Teacher teacher){
        if (this.getTeachers().contains(teacher)){ // getTeachers() ile ya da teachers ile de yazabiliriz
            System.out.println(teacher.getName() + " adli ogretmen daha once bu derse eklenmis!!");
            return;
        }
        this.teachers.add(teacher);
    }

    public void showStudents(){
        System.out.println("List of students for lesson: " + this.lessonName);
        for (Student student: getStudents()) {
            System.out.println(student);
        }
    }
    public void showTeachers(){
        System.out.println("List of teacher for lesson: " + this.lessonName);
        for (Teacher teacher: getTeachers()) {
            System.out.println(teacher);
        }
    }

    @Override
    public String toString() {
        return getLessonName();
    }
}

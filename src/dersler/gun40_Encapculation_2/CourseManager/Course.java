package dersler.gun40_Encapculation_2.CourseManager;

import java.util.ArrayList;

public class Course {
    private String courseName;
    private final ArrayList<Lesson> lessons;
    private final ArrayList<Student> students; // Student class'in daki ogrencilere ArrayListe eklemek icin olusturduk
    private final ArrayList<Teacher> teachers; // Teacher class'in daki ogretmenleri ArrayListe eklemek icin olusturduk

    public Course(String courseName) { // Kullanici sadece kurs ismini girecek. Bizde ogretmenleri,ogrenciler,dersleri,arraye atayacagiz
        this.courseName = courseName;
        this.lessons = new ArrayList<Lesson>();
        this.students = new ArrayList<Student>();
        this.teachers = new ArrayList<Teacher>();
    }

    public String getCourseName() {
        return courseName;
    }

    public void setCourseName(String courseName) {
        this.courseName = courseName;
    }
    public void addLesson(Lesson lesson){
        this.lessons.add(lesson);
    }
    public void addTeacher(Teacher teacher){
        this.teachers.add(teacher);
    }
    public void addStudent(Student student){
        this.students.add(student);
    }

    public ArrayList<Lesson> getLessons() {
        return lessons;
    }
    public void showLessons(){
        System.out.println("List of lessons for course : " + this.getCourseName());
        System.out.println("----------------------------------------------------");
        for (Lesson lesson:getLessons()) { // derslerin adini ve dersleri alan ogrencileri listeliyoruz
            System.out.println(lesson);

            lesson.showTeachers(); // Course Manager cagirdiginda dersin ogretmenlerini gpsteriri
            System.out.println();
            lesson.showStudents();// Course Manager cagirdiginda dersin ogrencilerini gpsteriri
            System.out.println();
        }
    }
    public void showTeachers(){
        System.out.println("List of teachers for course : " + this.getCourseName());
        for (Teacher teacher:getTeachers()) {
            System.out.println(teacher);
        }
    }
    public void showStudents(){

        System.out.println("List of students for course : " + this.getCourseName());
        for (Student student:getStudents()) {
            System.out.println(student);
        }
    }


    public ArrayList<Student> getStudents() {
        return students;
    }

    public ArrayList<Teacher> getTeachers() {
        return teachers;
    }

    @Override
    public String toString() {
        return "Course{" +
                "courseName='" + courseName + '\'' +
                ", lessons=" + lessons +
                ", students=" + students +
                ", teachers=" + teachers +
                '}';
    }
}


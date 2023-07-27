package dersler.gun40_Encapculation_2.CourseManager;

public class Student {
    private String name;

    public Student(String name) {
        this.name = name;
    }

    public String getName() {
        return name.toUpperCase();
    }

    public void setName(String name) {
        this.name = name.trim();
    }

    @Override
    public String toString() {
        return getName();
    }
}

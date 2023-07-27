package dersler.gun38_Constructors_PassingObjects2.Student;

public class Student {
    String name;
    int age;
    String department;
    // Constructor Overloading and Constructor Chaining
    // Constructur'a assign edilmemis bir parametreyi kendimiz de ekleyebiliriz...
    public Student(String name, int age) {
        this.name = name;
        this.age = age;
        this.department = "Not Assigned";
    }
    public Student(String name, int age, String department) {
       this(name,age);
       this.department = department;
    }

    public Student(int age){
        this("Unkonown",age);
    }
    public Student(){
        this(0); // bu sekilde butun Constructor'lara default deger Assign edebiliriz...
    }

    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", department='" + department + '\'' +
                '}';
    }
}

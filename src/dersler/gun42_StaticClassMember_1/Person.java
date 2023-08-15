package dersler.gun42_StaticClassMember_1;

public class Person {
    private static String name;
    public Person(String name){
        this.name = name;
    }
    public void printName(){
        System.out.println("Name : " + name);
    }

    public static void main(String[] args) {
        // degiskene static eklendiginide class duzeyinde kalir ve en son eklenen degeri alir
        // Hangi object olursa olsun son degeri alir
        Person person1 = new Person("Ahmet");
        Person person2 = new Person("Ayse");

        person1.printName(); // Ahmet  private static String name; degiskeni static oldugundan bir onceki degerde ---> Ayse olur
        person2.printName(); // Ayse  static---> Ayse
        Person person3 = new Person("Ali"); // burada object sonradan olusturuldugu icin burada Ali olarak atanir...
        person3.printName(); // Ali // static --> Ali
    }
}

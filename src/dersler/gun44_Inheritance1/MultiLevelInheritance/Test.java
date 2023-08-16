package dersler.gun44_Inheritance1.MultiLevelInheritance;

public class Test {
    public static void main(String[] args) {
        /*Child child = new Child("AHmet","Yilmaz",12);
        child.name = "Yusuf";
        child.lastName = " Orhan";
        child.age = 10;
        child.display();

        Parent parent = new Parent("Ayse","Okur");
        parent.name = "Ali";
        parent.lastName = "Orhan";
        // parent.age = 12; --> Parent ilskisi sadece GrandParent ile olabilir, child ile iliskisi olamaz...

         */

        Child child = new Child("Ahmet","Yilmaz",12);
        child.display();
        System.out.println("------------------------------------------");
        Parent parent = new Parent("Ayse","Okur");
        parent.display();

    }
}

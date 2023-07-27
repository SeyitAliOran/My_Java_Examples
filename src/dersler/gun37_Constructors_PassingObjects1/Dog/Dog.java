package dersler.gun37_Constructors_PassingObjects1.Dog;

public class Dog {
    String name;
    int age;
   // No-argument constructor...
    public Dog(){
        name = "Unknown";
        age = 0;
    }

    // Klavyeden sag tiklayip Generate basarak otomatik olarak Constructor olusturabiliriz..

   // Parameterised constructor
    //public Dog(String name,int age){
   //     name= name;
    //    age= age;
 //   }

    public Dog(String name, int age) {
        this.name = name; // this bize class da ki name kullandirir.
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }
}

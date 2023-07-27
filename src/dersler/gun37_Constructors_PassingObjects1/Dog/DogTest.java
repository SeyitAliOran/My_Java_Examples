package dersler.gun37_Constructors_PassingObjects1.Dog;

public class DogTest {
    public static void main(String[] args) {
        // Creating object with no-argument constructor
        Dog dog1= new Dog();
        System.out.println(dog1.name);
        System.out.println(dog1.age);
        System.out.println();

        // Deger atanan Constructor u olusturdu isek default Constructor u kendimiz olsturmamaiz gerekiyor
        Dog dog2 = new Dog("Artis",8);
        System.out.println(dog2.name);
        System.out.println(dog2.age);
    }
}

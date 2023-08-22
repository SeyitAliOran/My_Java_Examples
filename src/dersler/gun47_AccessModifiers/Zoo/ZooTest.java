package dersler.gun47_AccessModifiers.Zoo;

public class ZooTest {
    public static void main(String[] args) {
        Zoo hayvanatBahcesi = new Zoo("Ali baanin ciftligi","Ali baba caddesi");
        Dog dog = new Dog("Karabas",3,"Siyah");
        hayvanatBahcesi.addAnimal(dog);
        hayvanatBahcesi.addAnimal(new Dog("Boby",1,"beyaz")); // bu sekilde de ekleme yapilabiliyor
        hayvanatBahcesi.addAnimal(new Bird("Cici kus",6,"sari"));// bu sekilde de ekleme yapilabiliyor

        for (Animal animal: hayvanatBahcesi.getAnimals()){
            //System.out.println("animal = " + animal);
            animal.makeSound();
            animal.move();
            if (animal instanceof Bird){ // if instanceof ile genel arraylisten icinde ki  kusa ulastik
                ((Bird) animal).fly();
            }
        }
    }
}

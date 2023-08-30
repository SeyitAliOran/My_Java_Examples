package dersler.gun52_Interface_Enum_Record.Interface.AnimalFarm;

public class AnimalFarmTest {
    public static void main(String[] args) {
        Bird kus = new Bird("Kanarya",3,"Sarı-Lacivert");
        kus.eat();
        kus.fly();
        kus.sleep();
        kus.run();
        System.out.println("-----------------------");
        Kurbaga kurbaga = new Kurbaga("Kermit",5,"Yeşil-Kahverengi");
        kurbaga.eat();
        kurbaga.sleep();
        kurbaga.swim();
        kurbaga.run();
    }
}

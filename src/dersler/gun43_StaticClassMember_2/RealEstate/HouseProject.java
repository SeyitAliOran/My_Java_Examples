package dersler.gun43_StaticClassMember_2.RealEstate;

public class HouseProject {
    public static void main(String[] args) {
        RealEstate realEstate = new RealEstate();

        House house1 = new House();
        House house2 = new House("123 Main Street",3,20000.0);
        House house3 = new House("234 Elm Road",4,300000.0);
        House house4 = new House("15 London Road",5,500000.0);
        realEstate.addHouse(house1);
        realEstate.addHouse(house2);
        realEstate.addHouse(house3);
        realEstate.addHouse(house4);
        realEstate.displayAvailableHouses();
    }
}

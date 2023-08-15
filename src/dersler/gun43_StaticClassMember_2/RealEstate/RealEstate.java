package dersler.gun43_StaticClassMember_2.RealEstate;

import java.util.ArrayList;

public class RealEstate {

    ArrayList<House> availableHouses;
    static {
        System.out.println("Real Estate Project is started");
    }

    {
        availableHouses = new ArrayList<>();
    }

    public void addHouse(House house){
       availableHouses.add(house);
    }

    public void displayAvailableHouses(){
        System.out.println("Available House List");
        System.out.println("--------------------");
        for (House house: availableHouses){
            System.out.println("house.getHouseId() = " + house.getHouseId());
            System.out.println("house.getAddress() = " + house.getAddress());
            System.out.println("house.getNumRooms() = " + house.getNumRooms());
            System.out.println("house.getRentAmount() = " + house.getRentAmount());
            System.out.println("--------------------");
        }

    }
}

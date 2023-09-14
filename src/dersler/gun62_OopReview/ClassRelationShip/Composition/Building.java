package dersler.gun62_OopReview.ClassRelationShip.Composition;

import java.util.ArrayList;

public class Building {
    private EnumBuildingTypes type;
    private ArrayList<Room> rooms;
    private Room room; //Has-a

    public Building(EnumBuildingTypes type) {
        this.type = type;
        this.rooms = new ArrayList<>();
        this.room = new Room();
    }

    public EnumBuildingTypes getType() {
        return type;
    }

    public void setType(EnumBuildingTypes type) {
        this.type = type;
    }

    public ArrayList<Room> getRooms() {
        return rooms;
    }

    public void setRooms(ArrayList<Room> rooms) {
        this.rooms = rooms;
    }

    public Room getRoom() {
        return room;
    }

    public void setRoom(Room room) {
        this.room = room;
    }

    public void addRoom(String name,int size, int windows, int doors, EnumColors color){
       /* Room room1 = new Room();
        room1.setName(name);
        room1.setSize(size);
        room1.setWindows(windows);
        room1.setDoors(doors);
        room1.setColor(color);

        rooms.add(room1);*/
        rooms.add(new Room(name,size,windows,doors,color));
    }
    @Override
    public String toString() {
        return "Building{" +
                "type=" + type +
                ", rooms=" + rooms +
                '}';
    }
}

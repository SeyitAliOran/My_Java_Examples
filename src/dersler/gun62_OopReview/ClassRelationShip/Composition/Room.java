package dersler.gun62_OopReview.ClassRelationShip.Composition;

public class Room {
    private String name;
    private int size;
    private int windows;
    private int doors;
    private EnumColors color;

    public Room() {
    }

    public Room(String name, int size, int windows, int doors, EnumColors color) {
        this.name = name;
        this.size = size;
        this.windows = windows;
        this.doors = doors;
        this.color = color;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getSize() {
        return size;
    }

    public void setSize(int size) {
        this.size = size;
    }

    public int getWindows() {
        return windows;
    }

    public void setWindows(int windows) {
        this.windows = windows;
    }

    public int getDoors() {
        return doors;
    }

    public void setDoors(int doors) {
        this.doors = doors;
    }

    public EnumColors getColor() {
        return color;
    }

    public void setColor(EnumColors color) {
        this.color = color;
    }

    @Override
    public String toString() {
        return "Room{" +
                "name='" + name + '\'' +
                ", size=" + size +
                ", windows=" + windows +
                ", doors=" + doors +
                ", color=" + color +
                '}';
    }
}

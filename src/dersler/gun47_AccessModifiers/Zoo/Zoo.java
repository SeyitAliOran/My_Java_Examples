package dersler.gun47_AccessModifiers.Zoo;

import java.util.ArrayList;

public class Zoo {
    private String name;
    private String address;
    private ArrayList<Animal> animals;

    public Zoo(String name, String address) {
        this.name = name;
        this.address = address;
        this.animals = new ArrayList<>();
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public ArrayList<Animal> getAnimals() {
        return animals;
    }

    public void setAnimals(ArrayList<Animal> animals) {
        this.animals = animals;
    }
    public void addAnimal(Animal animal){
        this.animals.add(animal);
    }

    @Override
    public String toString() {
        return "Zoo{" +
                "name='" + name + '\'' +
                ", address='" + address + '\'' +
                ", animals=" + animals +
                '}';
    }
}

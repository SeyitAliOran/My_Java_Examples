package dersler.gun42_StaticClassMember_1;

public class Dinner {
    static int pizzaSlice = 8;

    public void takeSlice(){
        pizzaSlice--;
    }
    public void takeSlice(int slice){
        pizzaSlice -= slice;
    }
}

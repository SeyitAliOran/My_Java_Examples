package dersler.gun42_StaticClassMember_1;

public class DinnerTest {
    public static void main(String[] args) {
        Dinner dad = new Dinner();
        Dinner mam = new Dinner();
        Dinner kid = new Dinner();
        System.out.println("Total Slice: " + Dinner.pizzaSlice); // class ismi ustunde variable ulastik


        dad.takeSlice();
        System.out.println("Total Slice: " + Dinner.pizzaSlice); // class ismi ustunde variable ulastik


        mam.takeSlice();
        System.out.println("Total Slice: " + Dinner.pizzaSlice); // class ismi ustunde variable ulastik

        kid.takeSlice();
        System.out.println("Total Slice: " + Dinner.pizzaSlice); // class ismi ustunde variable ulastik

        dad.takeSlice(3); // baba 3 dilim aliyor
        System.out.println("Total Slice: " + Dinner.pizzaSlice);

    }
}
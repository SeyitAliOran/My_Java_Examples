package dersler.gun50_Review.Composition;

public class Test {
    public static void main(String[] args) {
        Chef chef = new Chef("Ahmet","Iskender Kebap");
        Waiter[] waiters = {new Waiter("Mehmet",true), new Waiter("Osman",false)};
        Table[] tables = {new Table(1,4),new Table(2,3)};
        Restaurant restaurant = new Restaurant(chef,waiters,tables);
        restaurant.serve("Iskender Kebap",1,4);
    }
}

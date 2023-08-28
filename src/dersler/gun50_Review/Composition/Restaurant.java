package dersler.gun50_Review.Composition;

public class Restaurant {
    private Chef chef;
    private Waiter[] waiters;
    private Table[] tables;

    public Restaurant(Chef chef, Waiter[] waiters, Table[] tables) {
        this.chef = chef;
        this.waiters = waiters;
        this.tables = tables;
    }
    public void serve(String order, int tableNumber,int guests){
        chef.cook();
        for (Waiter waiter:waiters){
            waiter.takeOrder(order);
        }
        for (Table table:tables){
            if (table.getNumber() == tableNumber){
                table.reserve(guests);
                break;
            }
        }


    }

}

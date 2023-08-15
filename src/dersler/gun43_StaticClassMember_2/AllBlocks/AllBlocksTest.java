package dersler.gun43_StaticClassMember_2.AllBlocks;

public class AllBlocksTest {
    public static void main(String[] args) {
        System.out.println("Execution started");
        // ilk once static block sonra Init Block daha sonra digerleri cagiriliyor
        AllBLocks obj1 = new AllBLocks();
        AllBLocks obj2 = new AllBLocks(5);
        AllBLocks obj3 = new AllBLocks(10); // Init block her object create edildiginde cagirilir.
    }
}

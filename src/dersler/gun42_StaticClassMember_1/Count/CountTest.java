package dersler.gun42_StaticClassMember_1.Count;

public class CountTest {
    public static void main(String[] args) {
        Count obj1 = new Count();
        Count obj2 = new Count();
        Count obj3 = new Count();

        int objCount;
        objCount = obj1.getInstanceCount();
        objCount = obj2.getInstanceCount();

        System.out.println("objCount = " + objCount);
    }
}

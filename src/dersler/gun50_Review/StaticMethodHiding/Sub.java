package dersler.gun50_Review.StaticMethodHiding;

public class Sub extends Super {
    public static boolean question(){
        return false;
    }
    public void getSubDescription(){
        System.out.println("Description " + question());
    }
}

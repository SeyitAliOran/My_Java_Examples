package dersler.gun50_Review.StaticMethodHiding;

public class Super {
    public static boolean question(){
        return true;
    }

    public void getSuperDescription(){
        System.out.println("Description " + question());
    }

}

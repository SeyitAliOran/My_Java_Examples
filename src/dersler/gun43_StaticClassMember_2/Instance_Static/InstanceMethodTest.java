package dersler.gun43_StaticClassMember_2.Instance_Static;

public class InstanceMethodTest {
    public static void main(String[] args) {
        InstanceMethods example = new InstanceMethods();
        example.instanceMethod(); // No error

        InstanceMethods.staticMethod(); // Error --> cagirilabilir fakat hata alir...
        staticMethod(); // cagirilabilir fakat hata alir...
    }
    public static void staticMethod(){
        // System.out.println("Instance variable value:" + instanceVar);
    }
    public  void instanceMethod(){
        // Can not access a instance variable from a static method
         System.out.println("Instance variable value:"); // main method static oldugu icin cagirilamaz
    }
}

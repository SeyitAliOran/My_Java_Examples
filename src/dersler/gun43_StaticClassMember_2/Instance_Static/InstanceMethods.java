package dersler.gun43_StaticClassMember_2.Instance_Static;

public class InstanceMethods {
    int instanceVar = 10;
    public void instanceMethod(){
        // Access instance variable directly an instance method
        System.out.println("Instance variable value:" + instanceVar);
        System.out.println("Instance variable value:" + this.instanceVar);
    }
    public static void staticMethod(){
        // Can not access instance variable directly a static method
        // System.out.println("Instance variable value:" + instanceVar);
       // System.out.println("Instance variable value:" + this.instanceVar); // this static method ile kullanilmaz
    }

}

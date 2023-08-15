package dersler.gun43_StaticClassMember_2.AllBlocks;

public class AllBLocks {
    public AllBLocks(){
        System.out.println("No Argument Constructor");
    }
    public AllBLocks(int a){
        System.out.println("One Argument Constructor");
    }
    // static block (class load edildiginde bir kez cagirilir)
    static {
        System.out.println("First Static Block");
    }
    // Init Block (her object olusturuldugunda cagirilir)
    {
        System.out.println("First Init Block");
    }
    {
        System.out.println("Second Init Block");
    }
    static {
        System.out.println("Second Static Block");
    }
}

package dersler.gun42_StaticClassMember_1.Count;

public class Count {
   static int instanceCount = 0;

    public Count(){
        // static int number = 0; static variable constructor icerisinde kullanilamaz
        instanceCount++;
    }

    public int getInstanceCount() {
        // static int number = 0; static variable constructor icerisinde declare edilemez
        return instanceCount;
    }
}

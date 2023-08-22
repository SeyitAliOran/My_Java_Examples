package dersler.gun45_Inheritance2.BaseChildClass;

public class ChildClass extends BaseClass {
    public static void main(String[] args) {
        ChildClass childClassInstance = new ChildClass();
        ChildClass childClassArgs = new ChildClass();
        ChildClass childClassArgs1 = new ChildClass();
        childClassInstance.publicName = " Public Name";
        // Private tanimlanmis Child class da ki degiskene setterlar ile ulasiyoruz
        childClassInstance.setName("Name prop of Base Class via setter method");
    }
    public String ChildName;

    public ChildClass() {
        super(); // Default Constructor icin super(); ifadesini yazmadan da otomatik olarak Constructor cagiriliyor
    }
    public ChildClass(String name, String publicName, String baseName) {
        super(name, publicName);
        this.ChildName = baseName;
    }

}

package dersler.gun44_Inheritance2.BaseChildClass;

public class BaseClass {

    private String name;
    public String publicName;

    public BaseClass() {
        System.out.println("BaseClass default Constructor invoked/called");
    }
    public BaseClass(String name, String publicName) {
        System.out.println("BaseClass args Constructor invoked/called");
        this.name = name;
        this.publicName = publicName;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPublicName() {
        return publicName;
    }

    public void setPublicName(String publicName) {
        this.publicName = publicName;
    }
}

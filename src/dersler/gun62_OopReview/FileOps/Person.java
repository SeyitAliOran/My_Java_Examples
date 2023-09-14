package dersler.gun62_OopReview.FileOps;

public class Person {
    private String name;
    private String adresi;
    public Person(String name, String adresi) {
        this.name = name;
        this.adresi = adresi;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAdresi() {
        return adresi;
    }

    public void setAdresi(String adresi) {
        this.adresi = adresi;
    }


    @Override
    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                ", adresi='" + adresi + '\'' +
                '}';
    }
}

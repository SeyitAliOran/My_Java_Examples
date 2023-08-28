package dersler.gun50_Review.Composition;

public class Chef {
    private String name;
    private String special;
    public Chef(String name, String special){
        this.name = name;
        this.special = special;
    }
    public void cook(){
        System.out.println(name + " chef is cooking " + special);
    }

}

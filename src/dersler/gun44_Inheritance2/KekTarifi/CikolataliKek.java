package dersler.gun44_Inheritance2.KekTarifi;

public class CikolataliKek extends Kek{
    int cikolata;
    public CikolataliKek() {
        super();
    }
    public CikolataliKek(int cikolata,String name, int seker, int un, int yag, int sut, int kabartmaTozu, int yumurta, int vanilya) {
        super(name,seker,un,yag,sut,kabartmaTozu,yumurta,vanilya);
        this.cikolata = cikolata;
    }
    public String toString(){
        String str = super.toString(); // Kek Class da ki toString metodundaki bilgileri getiriyor
        str += "Cikolata miktari  : " + this.cikolata + "\n";
        return str;
    }

}

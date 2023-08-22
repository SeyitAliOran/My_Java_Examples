package dersler.gun45_Inheritance2.KekTarifi;

public class Kek {
     String name;
     int seker;
     int un;
     int yag;
     int sut;
     int kabartmaTozu;
     int yumurta;
     int vanilya;

     public Kek() {
          System.out.println("Default Constructor is called");
     }

     public Kek(String name, int seker, int un, int yag, int sut, int kabartmaTozu, int yumurta, int vanilya) {
          System.out.println("All args Constructor is called");
          this.name = name;
          this.seker = seker;
          this.un = un;
          this.yag = yag;
          this.sut = sut;
          this.kabartmaTozu = kabartmaTozu;
          this.yumurta = yumurta;
          this.vanilya = vanilya;
     }
     public String toString(){
          String str = "";
          str += "Kekin adi      : " + this.name +"\n";
          str += "Seker miktari  : " + this.seker +"\n";
          str += "Un miktari     : " + this.un +"\n";
          str += "Yag miktari    : " + this.yag +"\n";
          str += "Sut miktari    : " + this.sut +"\n";
          str += "Kabartma Tozu  : " + this.kabartmaTozu +"\n";
          str += "Yumurta miktari: " + this.yumurta +"\n";
          str += "Vanilya miktari: " + this.vanilya +"\n";

          return str;
     }
}

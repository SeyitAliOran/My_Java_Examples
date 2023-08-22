package dersler.gun45_Inheritance2.KekTarifi;

public class CevizliKek extends Kek {
     int ceviz;

     public CevizliKek() {
          super();
     }

     public CevizliKek(int ceviz,String name, int seker, int un, int yag, int sut, int kabartmaTozu, int yumurta, int vanilya) {
          super(name,seker,un,yag,sut,kabartmaTozu,yumurta,vanilya);
          this.ceviz = ceviz;
     }

     public String toString(){
          String str = super.toString(); // Kek Class da ki toString metodundaki bilgileri getiriyor
          str += "Ceviz miktari  : " + this.ceviz + "\n";
          return str;
     }
}

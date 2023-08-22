package dersler.gun46_Review.Static;

public class Ogrenci {
    private String name;
    private int okulNo;
    private static int nextNumber = 1000;
    private static String okulAdi = "ABC Lisesi"; // Okul adi ve adresi degiseyecegi icin sabitledik
    private static String okulAdresi = "ABC caddesi no:30";

    public Ogrenci(String name) {
        /*
        nextNumber++; // nextNumber i static yaparak ogrenci numarasini 1 artirabildik. Static olmasa idi artirma yapamazdik...
        this.name = name;
        this.okulNo = nextNumber;
        */
        setName(name);
        setOkulNo(nextNumber++); // nextNumber i okul no ya Assign ettik
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getOkulNo() {
        return okulNo;
    }

    public void setOkulNo(int okulNo) {
        this.okulNo = okulNo;
    }

    public String getOkulAdi() {
        return okulAdi;
    }

    public String getOkulAdresi() {
        return okulAdresi;
    }
    @Override
    public String toString() {
        return "Ogrencinin{" +
                "name='" + name + '\'' +
                ", okulNo=" + okulNo +
                ", okulAdi='" + okulAdi + '\'' +
                ", okulAdresi='" + okulAdresi + '\'' +
                '}';
    }
}

package dersler.gun41_Review;

import java.util.Scanner;

/*
Bir class olustrurken dikkat edilmesi gereken kural
her seyi getter ve setter ile yapacagiz
 */
public class Car {
    private String marka;
    private String model;
    private int year;
    private String plateNumber;
    private String vinNumber; // Sase no
    private int kilometer;
    private String color;
    private long price;

    public Car() {
        // No args Constructor
        // Bu sekilde gerceklesme olasiligi olan NullPointerExeptipn hatasindan kurtulduk
        // Hic bir bilgiye sahip degilsem sonradan olusturmak istiyorsam bunu kullanabiliriz....
        setMarka("Belirtilmemis");
        setModel("Belirtilmemis");
        setPlateNumber("Belirtilmemis");
        setVinNumber("Belirtilmemis");
        setColor("Belirtilmemis");
        /*this.marka ="";
        this.model = "";
        this.plateNumber = "";
        this.vinNumber = "";
        this.color = "";
         */
    }

    public Car(String marka, String model) {
        this(); // Constructor chaining chain yapacagimiz Constructor en ust satirda olmak zorunda ve sadece 1 tane alir.
        /*this.marka = marka;
        this.model = model;
         */
        setMarka(marka);
        setModel(model);
    }

    public Car(String marka, String model, int year) {
        this(marka, model);
        setYear(year);
        // this.year = year;
    }

    /**
     * Bu metodun isminin uzerine gelip beklersek aciklamayi gorebiliriz
     * Car Class icin butun parametreleri alan constructor metodu
     *
     * @param marka       Arabanin markasi
     * @param model       Arabanin modeli
     * @param year        Arabanin uretim yili
     * @param plateNumber Arabanin plakasi
     * @param vinNumber   Arabanin sase nosu
     * @param kilometer   Arabanin km
     * @param color       Arabanin rengi
     * @param price       Arabanin fiyati
     */
    public Car(String marka, String model, int year, String plateNumber, String vinNumber, int kilometer, String color, long price) {
        /*this.marka = marka;
        this.model = model;
        this.year = year;
         */
        this(marka, model, year); // bu sekilde de kullanabiliriz
        setPlateNumber(plateNumber);
        setVinNumber(vinNumber);
        setKilometer(kilometer);
        setColor(color);
        setPrice(price);
        /*this.plateNumber = plateNumber;
        this.vinNumber = vinNumber;
        this.kilometer = kilometer;
        this.color = color;
        this.price = price;
         */
    }

    /**
     * Bu metodun isminin uzerine gelip beklersek aciklamayi gorebiliriz
     * Bu method Car Class'i field icin setter metodur...
     *
     * @param marka arabanin markasi
     */
    public void setMarka(String marka) {
        this.marka = marka;
    }

    /**
     * @return Marka bilgisini return eder
     */
    public String getMarka() {
        return marka;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public String getPlateNumber() {
        return plateNumber;
    }

    public void setPlateNumber(String plateNumber) {
        this.plateNumber = plateNumber.toUpperCase();
    }

    public String getVinNumber() {
        return vinNumber;
    }

    public void setVinNumber(String vinNumber) {
        this.vinNumber = vinNumber;
    }

    public int getKilometer() {
        return kilometer;
    }

    public void setKilometer(int kilometer) {
        this.kilometer = kilometer;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public long getPrice() {
        return price;
    }

    public void setPrice(long price) {
        this.price = price;
    }

    /**
     * toString metodunu istedigimiz gibi ozellestirebiliyoruz
     *
     * @return
     */
    @Override
    public String toString() {
        String str = "";
                str += "Marka = " + getMarka() + "\n";
                str += "Model = " + getModel() + "\n";
                str += "Year  = " + getYear() + "\n";
                str += "Plate = " + getPlateNumber() + "\n";
                str += "Vin   = " + getVinNumber() + "\n";
                str += "Km    = " + getKilometer() + "\n";
                str += "Color = " + getColor() + "\n";
                str += "Price = " + getPrice();
                return str;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Car araba1 = new Car();
        Car araba2 = new Car("Toyota", "Corolla");
        Car araba3 = new Car("Toyota", "Corolla", 2016, "34 abc 233", "VIN 123123123", 5670, "Beyaz", 850000);
        System.out.println(araba3); // car classin da ki toString metodu kullanarak yazdiriyoruz
        System.out.println();


        System.out.print("Marka bilgisini giriniz: ");
        String marka = scanner.nextLine();
        System.out.print("Model bilgisini giriniz: ");
        String model = scanner.nextLine();

        Car araba5 = new Car(marka, model);
        System.out.println(araba5);

/*
// scanner i direkt buraya koyarak da yapabiliriz.
        Scanner scanner = new Scanner(System.in);
        System.out.print("Marka bilgisini giriniz:");
        araba1.setMarka(scanner.nextLine());
        System.out.print("Model bilgisini giriniz:");
        araba1.setModel(scanner.nextLine());
        System.out.println(araba1);

 */
    }
}

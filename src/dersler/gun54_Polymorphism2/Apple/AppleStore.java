package dersler.gun54_Polymorphism2.Apple;

public class AppleStore {
    public static void main(String[] args) {
        AppleDevice mac = new Mac(); // bu sekil obj olusturursak sadece override edilen methodlara erisilebilir.
        mac.use(); // use methoda override edildigi icin ulasilir.
        // mac.code(); polmorphic olarak obj create edildigi icin mac in icindeki code methoduna ulasamayiz

        Mac mac1 = new Mac(); // bu sekilde mac class'inin icinde ki butun methodlara ulasabiliriz
        mac1.use();
        mac1.code();

        AppleDevice ipad = new Ipad();
        ipad.use();
        // ipad.draw(); ERROR

        Ipad ipad1 = new Ipad();
        ipad1.use();
        ipad1.draw();

        AppleDevice appelWatch = new AppleWatch();
        appelWatch.use();
        // appleWatch.wear(); ERROR

        AppleWatch appleWatch = new AppleWatch();
        appleWatch.use();
        appleWatch.wear();
    }
}

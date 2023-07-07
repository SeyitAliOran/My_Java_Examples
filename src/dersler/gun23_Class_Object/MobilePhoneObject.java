package dersler.gun23_Class_Object;

import javax.naming.ldap.ManageReferralControl;

public class MobilePhoneObject {
    public static void main(String[] args) {
        MobilePhone handy1 = new MobilePhone();
        handy1.marka = "Iphone 13";
        handy1.boyut = 4.7;
        handy1.renk = "Blau";
        handy1.model = "Pro max";
        handy1.uretimYili = 2021;
        handy1.fiyat = 800;

        System.out.println("handy1 marka = " + handy1.marka);
        System.out.println("handy1 model = " + handy1.model);
        System.out.println("handy1 boyut = " + handy1.boyut);
        System.out.println("handy1 renk = " + handy1.renk);
        System.out.println("handy1 uretimYili = " + handy1.uretimYili);
        System.out.println("handy1 fiyat = " + handy1.fiyat);
        handy1.arama();
        handy1.fotografCekme();
        handy1.interneteBaglanma();
        handy1.mesajAtma();

    }
}

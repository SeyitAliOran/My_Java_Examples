package dersler.gun13_ternary_operator;

import Alistirmalarim.KarsilastirmaOperatorleri;

public class MultiConditionTernary {
    public static void main(String[] args) {

        String ogrenci = "Ahmet";
        int diplomaNotu = 80;
        int sinavSonucu = 95;
        String kayitSonucu;

        kayitSonucu = diplomaNotu > 70 && sinavSonucu > 85 ? "ogrencinin kaydi kabul edilmistir" : "ogrencinin kaydi kabul edilmemistir";
        System.out.println(ogrenci + " isimli " + kayitSonucu);
    }
}

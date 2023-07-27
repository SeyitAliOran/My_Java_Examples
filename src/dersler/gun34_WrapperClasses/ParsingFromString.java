package dersler.gun34_WrapperClasses;

public class ParsingFromString {
    public static void main(String[] args) {
        // Bir String deger primitive bu sekillerde degistirilir.

        String strNumber = "2023";
        // 1. method
        int number = Integer.valueOf(strNumber);
        // 2. method
        int number2 = Integer.parseInt(strNumber);
        System.out.println("number = " + number);
        System.out.println("number2 = " + number2);
        strNumber = strNumber + 5;
        System.out.println("strNumber = " + strNumber);// strNumber String bir deger oldugu icin concanation olur 20235 yazilir
        number2 = number2 + 5;
        System.out.println("number2 = " + number2); // 2028
        Double number3 = Double.parseDouble(strNumber);
        System.out.println("number3 = " + number3);
        String str ="2023";
        int number4 = Integer.parseInt(str);
        System.out.println("number4 = " + number4);
        // String str1 ="2023as"; eger String degerin icinde rakam disinda bir deger varsa hata verir ....

    }
}

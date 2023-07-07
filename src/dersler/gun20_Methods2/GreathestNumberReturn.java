package dersler.gun20_Methods2;

public class GreathestNumberReturn {
    public static void main(String[] args) {
        //Write a method that accepts 3 int type numbers and displays/returns the greatest number.
        int enbuyukSayi = greatestNumber2(1, 3);
        System.out.println("en buyuk 2 Sayi = " + enbuyukSayi);

        enbuyukSayi = greatestNumber3(1, 3435, 2555);
        System.out.println("en buyuk 3 Sayi = " + enbuyukSayi);

        enbuyukSayi = greatestNumber4(100, 2000, 300, 400);
        System.out.println("en buyuk 4 Sayi = " + enbuyukSayi);

        enbuyukSayi = greatestNumber6(100000, 2888880, 300, 400, 596, 3488);
        System.out.println("en buyuk 6 Sayi = " + enbuyukSayi);
    }

    public static int greatestNumber2(int sayi1, int sayi2) {
        int enBuyukSayi = 0;
        if (sayi1 > sayi2) {
            enBuyukSayi = sayi1;
        } else enBuyukSayi = sayi2;
        return enBuyukSayi;
    }

    public static int greatestNumber3(int sayi1, int sayi2, int sayi3) {
        int enBuyukSayi = 0;
       /* if(sayi1 > sayi2 && sayi1 > sayi3){
            enBuyukSayi = sayi1;
        } else if (sayi2 > sayi3) {
            enBuyukSayi = sayi2;
        } else enBuyukSayi = sayi3;*/
        int max = greatestNumber2(sayi1, sayi2);

        if (max > sayi3) {
            enBuyukSayi = max;
        } else enBuyukSayi = sayi3;
        return enBuyukSayi;
    }

    public static int greatestNumber4(int sayi1, int sayi2, int sayi3, int sayi4) {
        int enBuyukSayi = 0;
/*
    if(sayi1 > sayi2 && sayi1 > sayi3 && sayi1 > sayi4){
        enBuyukSayi = sayi1;
    } else if (sayi2 > sayi3 && sayi2 > sayi4) {
        enBuyukSayi = sayi2;
    } else if(sayi3 > sayi4){
        enBuyukSayi = sayi3;
    } else enBuyukSayi = sayi4;
*/
        enBuyukSayi = greatestNumber3(sayi1, sayi2, sayi3);
        if (enBuyukSayi > sayi4) {
            return enBuyukSayi;
        } else enBuyukSayi = sayi4;
        return enBuyukSayi;
    }

    public static int greatestNumber6(int sayi1, int sayi2, int sayi3, int sayi4, int sayi5, int sayi6) {
        int enbuyukSayi = 0;
        int max = greatestNumber4(sayi1, sayi2, sayi3, sayi4);
        enbuyukSayi = greatestNumber3(max, sayi5, sayi6);
        //Asagidaki sekildeki gibi de kullanim olabilir....
       // enbuyukSayi = greatestNumber3(greatestNumber4(sayi1, sayi2, sayi3, sayi4), sayi5, sayi6);
        return enbuyukSayi;
    }
}

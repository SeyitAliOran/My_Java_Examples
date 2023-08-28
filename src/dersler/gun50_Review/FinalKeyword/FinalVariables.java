package dersler.gun50_Review.FinalKeyword;

public class FinalVariables {
    public static void main(String[] args) {
        final int MAX_AMOUNT = 5;
        // final variable can not be modified (final olarak tanimlanan degere yeniden deger ASSIGN edilemez)
        // MAX_AMOUNT = 6;

        final float TC_NO; // sadece local variable lar icin sonradan degisken atanabilir...
        TC_NO = 25759131508f;

    }

      // final int MAX_RANGE;
       //MAX_RANGE = 4;
    public final int MIN_RANGE =2;

    // public final int MAX_VALUE; --> bu sekilde hata alinir
    public final int MIN_VALUE;
    public final int MAX_VALUE;

    public static final int ID = 12345;

   //  public static final int CUSTOMER_NO; --> deger assign etmemiz gerekiyor ya da static blokta deger assign edebiliriz.
    public static final int ADMIN_NO;

     // Static olarak olusturulan bir variable sadece sonradan static blockta deger assign edebiliriz
    static{
        ADMIN_NO =3413;
    }


    // init(her object create edildiginde constructordan da once create edilir.) icinde final degiskene deger Assign edebiliriz
    {
        MAX_VALUE = 2;

    }

    //Instance variable larda deger sonradan sadece Constructor ve initlerde assign edilebilir
    public FinalVariables() {
        MIN_VALUE = 10; // --> Constructor icinde deger assign edilebilir

    }

    public FinalVariables(int MIN_VALUE) {
        this.MIN_VALUE = MIN_VALUE; // --> Constructor icinde deger assign edilebilir
    }
}

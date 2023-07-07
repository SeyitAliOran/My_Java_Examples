package dersler.gun09_Review;

import java.text.DecimalFormat;

public class FloatFormatter {
    public static void main(String[] args) {
        System.out.println("Float ve Double veri tipindeki degerleri formatli gosterim. ");

        float floatDeger = 25.1234527F; // float noktadan sonra 6 hane gosterir
        double doubleDeger = 12.1234567890123456789; // double noktadan sonra 16 hane gosterir



        System.out.println("floatDeger = " + floatDeger);
        System.out.println("doubleDeger = " + doubleDeger);

        // .printf() metodu ile
        System.out.println(".printf() metodu ile formatli gosterim");
        System.out.printf("Merhaba ben printF metoduyum\n");
        System.out.printf("Merhaba ben printF metoduyum\n\n");

        System.out.printf("Float : %.2f\n", floatDeger); //noktanin sagina 2 haneye azaltir
        System.out.printf("Float : %.4f\n", floatDeger);//noktanin sagina 4 haneye azaltir
        System.out.printf("Float : %.1f\n", floatDeger); //noktanin sagina 1 haneye azaltir
        System.out.printf("Float : %12.0f\n", floatDeger);//noktanin sol tarfaina 12 adet bosluk birakir.
        System.out.printf("Float : %-12.0f\n\n", floatDeger); // noktanin sag tarafina 12 adet bosluk birakir.

        //String.format metodu ile
        System.out.println("String.metodu() ile formatli gosterim. ");
        System.out.println(String.format("Float(String.format() : %.2f", floatDeger));

        // DecimalFormat Class ile
        System.out.println("Decimal Formal Class ile formatli gosterim. ");
        DecimalFormat decimalFormat = new DecimalFormat("#.##");
        System.out.println("Float(DecimalFormat) : " + decimalFormat.format(floatDeger));
        System.out.println();

        //.printf metodu
        System.out.printf("%.4f TL\n" , floatDeger);
        System.out.printf("$%.4f\n\n" , floatDeger);

        //.printf metodu icinde birden fazla degiskeni yazdirabiliyoruz.
        System.out.printf("Double : %.4f - Float : %.2f", doubleDeger,floatDeger);



    }
}

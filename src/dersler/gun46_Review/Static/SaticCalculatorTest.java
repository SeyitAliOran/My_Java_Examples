package dersler.gun46_Review.Static;

import java.time.LocalDate;

public class SaticCalculatorTest {
    public static void main(String[] args) {
        System.out.println("StaticCalculator.topla(2,6) = " + StaticCalculator.topla(2, 6));
        System.out.println("StaticCalculator.topla(2,4,5,6) = " + StaticCalculator.topla(2, 4, 5, 6));
        int yas = StaticCalculator.calculateAge(LocalDate.of(1987,4,17));
        System.out.println("yas = " + yas);
        int yas1 = StaticCalculator.calculateAge(1987,4,17);
        System.out.println("yas1 = " + yas1);
    }
}

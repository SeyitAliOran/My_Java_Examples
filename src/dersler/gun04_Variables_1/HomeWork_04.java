package dersler.gun04_Variables_1;

public class HomeWork_04 {
    public static void main(String[] args) {

        double itemOne;
        double itemTwo;
        double itemThree;
        double itemFour;
        double subTotal;
        double loyaltyListener;
        double totalAmount;
        double cash;
        double change;

        itemOne = 23.50;
        itemTwo = 3.21;
        itemThree = 67.98;
        itemFour = 12.39;
        loyaltyListener = 5.00;
        cash = 105.00;
        subTotal = itemOne + itemTwo + itemThree + itemFour;
        totalAmount = subTotal - loyaltyListener;
        change = cash - totalAmount;
        System.out.println();
        System.out.println("        L O V E , T A Y  P O D C A S T   ");
        System.out.println("   -----------------------------------------");
        System.out.println("                                    ");
        System.out.println("   Item One                         $" + itemOne);
        System.out.println("                                    ");
        System.out.println("   Item Two                         $" + itemTwo);
        System.out.println("                                    ");
        System.out.println("   Item Three                       $" + itemThree);
        System.out.println("                                    ");
        System.out.println("   Item Four                        $" + itemFour);
        System.out.println("                                    ");
        System.out.println("   -----------------------------------------");
        System.out.println("                                    ");
        System.out.println("   SUBTOTAL                         $" + subTotal);
        System.out.println("   Loyalty Listener                 -$5.00   ");
        System.out.println("                                    ");
        System.out.println("   ----------------------------------------");
        System.out.println("                                    ");
        System.out.println("   TOTAL AMOUNT                     $" + totalAmount);
        System.out.println("   Cash                             $" + cash);
        System.out.println("   Change                           $" + change);
        System.out.println("                                    ");
        System.out.println("   -----------------------------------------");
        System.out.println("           THANK YOU FOR LISTENING!     ");
        System.out.println("   -----------------------------------------");


    }
}
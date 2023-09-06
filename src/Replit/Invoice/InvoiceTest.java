package Replit.Invoice;

public class InvoiceTest {
    public static void main(String[] args) {
        Invoice invoice = new Invoice("1","Urun1",2,2.4);
        double in = invoice.getInvoice(2,2.4);
        System.out.println(in);
        System.out.println("invoice = " + invoice);
    }
}

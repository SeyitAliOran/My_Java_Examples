package dersler.gun37_Constructors_PassingObjects1.Bank;

public class BankTest {
        public static void main(String[] args) {

            Bank obj1 = new Bank();
            obj1.name = "Isbank";
            obj1.address = "Sisli - Istanbul";
            obj1.accountNumber = 11232024;

            obj1.deposit(100);
            obj1.withdraw(200);
            obj1.showDetails();

            // default constructor otomatik olarak arka planda cagirildiginda
            // class icerisinde declare edilen instance variable lara
            // default degerleri assign eder
//        Bank obj2 = new Bank();
//        System.out.println(obj2.name); // String --> null
//        System.out.println(obj2.address); // String --> null
//        System.out.println(obj2.accountNumber); // int --> 0

            Bank obj3 = new Bank();
            System.out.println(obj3.name); // String --> Banka
            System.out.println(obj3.address); // String --> Eyup - Istanbul
            System.out.println(obj3.accountNumber); // int --> 98765

        }
}

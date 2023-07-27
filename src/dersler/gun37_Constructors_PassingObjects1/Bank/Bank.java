package dersler.gun37_Constructors_PassingObjects1.Bank;

public class Bank {

    String name;
    String address;
    int accountNumber;

//    public Bank(){
//        System.out.println("Contructor is called");
//    }

    public Bank(){
        name = "Banka";
        address = "Eyup - Istanbul";
        accountNumber = 98765;
    }

    // Basit bir method,
    // class ismi ile ayni ancak return type mevcut
//    public void Bank(){
//        name = "Banka";
//        address = "Eyup - Istanbul";
//        accountNumber = 98765;
//    }

    public void deposit(int amount){

        System.out.println(amount + " is deposited to your account");
    }

    public void withdraw(int amount){

        System.out.println(amount + " is witdrawn from your account");
    }

    public void showDetails(){
        System.out.println("Your account details");
        System.out.println("--------------------");
        System.out.println("Bank Name : " + name);
        System.out.println("Bank Address : " + address);
        System.out.println("Account Number : " + accountNumber);
        System.out.println("--------------------");

    }
}

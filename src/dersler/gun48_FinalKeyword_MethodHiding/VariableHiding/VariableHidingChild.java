package dersler.gun48_FinalKeyword_MethodHiding.VariableHiding;

public class VariableHidingChild extends VariableHidingParent {
    public String name = "Child class isim"; //Parent class name variable is hided
    public static double number = 0.18; //Parent class number variable type is changed and variable is hided

    @Override
    public void displayName() {
        System.out.println("Child class displayName()");
        System.out.println(name);
    }

    @Override
    public void displayNumber() {
        System.out.println("Child class displayNumber()");
        System.out.println(number);
    }

    public void displayParentName() {
        //Parent class'ın gizlenen değişkenine erişim
        //Parent class'ın gizlenen değişkenine super anahtar kelimesini kullanılarak erişilebilir.
        System.out.println(super.name);
    }

    public void displayParentNumber() {
        //Parent class'ın gizlenen değişkenine erişim
        //Parent class'ın gizlenen değişkenine super anahtar kelimesini kullanılarak erişilebilir.
        System.out.println(super.number);
    }

    public static void main(String[] args) {
        VariableHidingParent vrbParent = new VariableHidingParent();
        VariableHidingChild vrbChild = new VariableHidingChild();

        VariableHidingParent parentRefChild = new VariableHidingChild(); //Parent class referansı ile child class instance oluşturmak.

        vrbParent.displayName(); //Parent class displayName() method
        vrbChild.displayName(); //Child class displayName() method
        vrbChild.displayParentName();

        System.out.println();

        vrbParent.displayNumber(); //Parent class displayNumber() method
        vrbChild.displayNumber(); //Child class displayNumber() method
        vrbChild.displayParentNumber(); //Prints the parent class number from child class displayParentNumber() method
        System.out.println();

        parentRefChild.displayName(); //Child class'ın metodu çalışır
        parentRefChild.displayNumber(); //Child class'ın metodu çalışır
        /*
        Metod(overriding) geçersiz kılmada, child sınıftaki metodlar parent sınıftaki  metodların yerini alır.
        Dolayısıyla, child nesneyi tutan parent referansından bir metoda eriştiğimizde, child sınıfın metoduna erişilir.
        parentRefChild.displayName() metod çağrısının child class'ın name dedğerini yazdırmasının nedeni budur.
         */


        System.out.println(parentRefChild.name); //Parent class'ın değişkenine erişir.
        /*
        Değişken gizlemede(variable hiding), child sınıftaki değişkenler parent sınıftaki değişkenler ile
        aynı isimde tanımlanırlarsa parent sınıfın değişkenleri gizlenir.
        Dolayısıyla, child nesneyi tutan parent'ın referansından bir değişkene eriştiğimizde,
        parent sınıfının değişkenine erişilir.
        ParentRefChild.name'in VariableHidingParent class'ının name property sini yazdırmasının nedeni budur.
         */
    }
}
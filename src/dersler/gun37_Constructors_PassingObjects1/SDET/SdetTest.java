package dersler.gun37_Constructors_PassingObjects1.SDET;

public class SdetTest {
    public static void main(String[] args) {
        SDET sdet1 = new SDET("Ali",22,'M',"Microsoft",100000,true);
        System.out.println("Name = " + sdet1.name);
        System.out.println("Age = " + sdet1.age);
        System.out.println("Gender = " + sdet1.gender);
        System.out.println("Company = " + sdet1.company);
        System.out.println("Salary = " + sdet1.salary);
        System.out.println("Is Succesfull = " + sdet1.isSuccessful);
        System.out.println("--------------------------------------------");

        SDET sdet2 = new SDET();
        System.out.println("Name = " + sdet2.name);
        System.out.println("Age = " + sdet2.age);
        System.out.println("Gender = " + sdet2.gender);
        System.out.println("Company = " + sdet2.company);
        System.out.println("Salary = " + sdet2.salary);
        System.out.println("Is Succesfull = " + sdet2.isSuccessful);
        System.out.println("--------------------------------------------");

        sdet1.increaseSalary(15000);
        System.out.println("New salary = " + sdet1.salary);
        sdet1.companyChange("Google");
        System.out.println("New company = " + sdet1.company);
    }
}

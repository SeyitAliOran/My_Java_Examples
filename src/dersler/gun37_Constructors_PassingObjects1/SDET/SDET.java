package dersler.gun37_Constructors_PassingObjects1.SDET;

public class SDET{
    String name;
    int age;
    char gender;
    String company;
    int salary;
    boolean isSuccessful;

    public SDET(){
        this.name = "Unknown";
        this.age = 0;
        this.gender= 'U';
        this.company= "Unknown";
        this.salary = 0;
        this.isSuccessful = false;

    }
    public SDET(String name,int age,char gender,String company,int salary, boolean isSuccessful){
    this.name = name;
    this.age = age;
    this.gender= gender;
    this.company= company;
    this.salary = salary;
    this.isSuccessful = isSuccessful;


    }
    public int increaseSalary(int amount){
        this.salary += amount;
        return salary;
    }
    public String companyChange(String newCompany){
        this.company = newCompany;
        return company;
    }
}

package dersler.gun47_AccessModifiers.Constructor;

public class Ogrenci {
    private String firstName; // Private ---> ayni classtan erisim saglanabilir.
    private String lastName;
     int schoolNo; // Default ---> ayni package den erisim saglanilabilir...
    public String okulAdi;

    Ogrenci(){ // Access modifiers belirtilmemisse default degerini alir ve farkli package den erisime izin verilmez
    }
    public Ogrenci(String firstName,String lastName){ // Access modifiers public oldugundan heryerden erisim saglanir
        this.firstName = firstName;
        this.lastName = lastName;
    }
    protected Ogrenci(String firstName,String lastName,int schoolNo){ // Access modifiers protected oldugundan sadece ayni package den yada sub classdan erisim saglanir
        this.firstName = firstName;
        this.lastName = lastName;
        this.schoolNo = schoolNo;
    }
}

package dersler.gun48_FinalKeyword_MethodHiding;

public class Local_InstanceVariables {
    //Instance variables
    // public String name = "Ali"; // Declaration and initialization in same statement
    public String name; // Declaration --> default is null
    public int age; // Declaration --> default is 0

    // instance (ornek-nesne )degiskenlere Constructors, init blocks ve metodlar icerisinde baslangic degeri atamasi yapilabilir.
    // name = "Ali"; --> can not be here initialized ---- baslangic degeri atamasi yapilamaz
    // age =12; --> can not be here initialized ---- baslangic degeri atamasi yapilamaz



    // No-args Constructor
    public Local_InstanceVariables(){
        // instance (ornek-nesne) degiskenlere constructor icerisinde veri atamasi yapilabilir.
        name = "Ali";
        age = 45;
        // Local variable access modifier almazlar
        // sadece suslu parantezin icerisinde gecerli bir degisken
        // public String str; local degiskenler access modifier almazlar
        // Local degiskenlere baslangic atamak zorunludur. Initialization is mandatory
        String strConstructor;
        // System.out.println(strConstructor);baslangic degeri atanmadigindan dolayi hata verir.
    }

    // Constructor
    public Local_InstanceVariables(String name1,int age1){
     name1 = ""; // Local variable - scope is constructor block - blogun disinda var olamazlar
     age1 = 0;   // Local variable
    }


    // Method
    public void method(){
        // instance (ornek-nesne) degiskenlere method icerisinde veri atamasi yapilabilir.
        name = "Ali veli";
        age = 56;
        // Local variable
        String strMethod; // sadece methodun icerisinde gecerli
        // System.out.println(strMethod);baslangic degeri atanmadigindan dolayi hata verir.
    }



    // Initialization-baslangic blogu
    {
        // instance (ornek-nesne) degiskenlere Initialization-baslangic blogu icerisinde veri atamasi yapilabilir.
        name = "Ali Veli Mehmet";
        age = 67;
        // Local variable
        String strMethod; // sadece baslangic blogunun icerisinde gecerli
        // System.out.println(strMethod);baslangic degeri atanmadigindan dolayi hata verir.
    }


    // strMethod = "Method"; --> Local degisken oldugundan ancak tanimlandigi blok icerisinden ulasilabilir.



}

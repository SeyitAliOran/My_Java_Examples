package dersler.gun31_Arrays2;

public class Person {
    //Property, field, state,  data
   public String name;
    String lastName;
    String address;
    int phoneNumber;

    public void showInfo(){
        System.out.println("Name     : " + name);
        System.out.println("Last Name: " + lastName);
        System.out.println("Address  : " + address);
        System.out.println("Phone    : " + phoneNumber);
        System.out.println();
    }

    //Static tanımlandığından bu metod class a ait bir metottur. Nesne oluşturmadan class ismiyle çağrılabilir
    public static void showListOfPerson(Person[] liste){
        for (Person eleman:liste){
            /*System.out.println(eleman.name);
            System.out.println(eleman.address);*/
            eleman.showInfo();
            System.out.println();
        }
    }

    //Static tanımlandığından bu metod class a ait bir metottur. Nesne oluşturmadan class ismiyle çağrılabilir
    public static void findByName(Person[] liste, String isim){
        System.out.println("FindbyName metodu");
        System.out.println("-----------------");
        int counter = 0;
        for (Person eleman:liste){
            if(eleman != null && eleman.name != null && eleman.name.contains(isim.trim())){
                counter++;
                eleman.showInfo();
            }
        }
        if (counter == 0){
            System.out.println("Rehberde " + isim + " isimli kişi kaydı bulunamadı!!!");
        }else System.out.println(counter + " adet kayıt listelendi.");
    }

    public static void findByNameLastName(Person[] liste, String ad, String soyad){
        System.out.println("FindbyNameLastName metodu");
        System.out.println("-------------------------");
        int counter = 0;

        for (Person eleman: liste){
            if(eleman !=null && eleman.name != null && eleman.lastName != null && eleman.name.equals(ad.trim()) && eleman.lastName.equals(soyad.trim())){
                counter++;
                eleman.showInfo();
            }
        }
        if (counter == 0){
            System.out.println("Rehberde " + ad + " "  + soyad + " isimli kişi kaydı bulunamadı!!!");
        }else System.out.println(counter + " adet kayıt listelendi.");
    }
}

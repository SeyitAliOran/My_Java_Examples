package dersler.gun31_Arrays2;

public class PhoneBook {
    public static void main(String[] args) {
            Person person1 = new Person();
            person1.name = "Ahmet";
            person1.lastName = "Smith";
            person1.address = "Falanca yer caddesi";
            person1.phoneNumber = 123456;

            Person person2 = new Person();
            person2.name = "Mehmet";
            person2.address = "London";
            person2.phoneNumber = 446565;

            Person person3 = new Person();
            person3.name = "Ahmet";
            person3.lastName = "Smith";
            person3.address = "Berlin";
            person3.phoneNumber = 4976276;

            // person1.showInfo();

            Person[] rehberim = new Person[10];
            rehberim[0] = person1;
            rehberim[1] = person2;
            rehberim[2] = person3;
            rehberim[3] = new Person();
            rehberim[4] = new Person();
       /* rehberim[3].showInfo();
        rehberim[4].showInfo();*/
            // Person.showListOfPerson(rehberim);
            // Person.findByName(rehberim,"h");

            Person.findByNameLastName(rehberim, "Ahmet", "Smith");

        }
    }


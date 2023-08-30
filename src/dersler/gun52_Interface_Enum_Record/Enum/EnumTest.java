package dersler.gun52_Interface_Enum_Record.Enum;

import java.util.Scanner;

public class EnumTest {
    public static void main(String[] args) {
        Day gun = Day.TUESDAY; //assigning an instance of enum
        System.out.println(gun);
        System.out.println(gun.name());
        System.out.println("-------------------");

        gun = Day.FRIDAY;
        System.out.println(gun); //toString()---prints the value of variable
        System.out.println(gun.name()); //prints the value of variable
        System.out.println(gun.ordinal()); // prints the ordinal(index) number of variable--> starts from 0

        Day[] gunler = Day.values(); //.values() method returns the all possible values of enum type
        //Traversing the enum all possible values
        for (Day gun1 : gunler) {
            System.out.println(gun1.name());
        }
        System.out.println();
        System.out.println(gunler[3]);

        Months ay = Months.AGUSTOS;
        System.out.println();
        for (Months ay1 : Months.values()) {
            System.out.println(ay1.ordinal() + "-" + ay1.name());
        }
        System.out.println("---------------------");

        Scanner scanner = new Scanner(System.in);

        //switch case example of enum type

        while (true){
            System.out.print("Lütfen Gün bilgisini giriniz : ");
            String strGun = scanner.nextLine();
            if (Day.isValidDay(strGun)){
                gun = Day.valueOf(strGun);
                break;
            }
        }

        switch (gun) {
            case MONDAY:
                System.out.println(gun + "-Working day.");
                break;
            case TUESDAY:
                System.out.println(gun + "-Working day.");
                break;
            case WEDNESDAY:
                System.out.println(gun + "-Working day.");
                break;
            case THURSDAY:
                System.out.println(gun + "-Working day.");
                break;
            case FRIDAY:
                System.out.println(gun + "-Working day.");
                break;
            case SATURDAY:
                System.out.println(gun + "-Weekend day.");
                break;
            case SUNDAY:
                System.out.println(gun + "-Weekend day.");
                break;
        }
    }
}

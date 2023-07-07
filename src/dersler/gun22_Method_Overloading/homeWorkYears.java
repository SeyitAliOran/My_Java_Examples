package dersler.gun22_Method_Overloading;

public class homeWorkYears {
    public static void main(String[] args) {
        nameYear("Bekir",1990);
         calculateAge(2023,1990);

    }
    public static int calculateAge(int today, int year){
       int age = today-year;
        System.out.println("yearBirth "+age);
        return age;
    }
    public static void nameYear(String name,int year){
        System.out.println("yearsUntilRetirement (" +name + "," + year+")");
    }

}

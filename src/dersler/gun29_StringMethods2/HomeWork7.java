package dersler.gun29_StringMethods2;

public class HomeWork7 {
    //Write a method that accept the date with time and creates a timeStamp
    //String date = “30/12/2021 17:35:00”
    //timeStamp(date); // 30122021173500
    public static void main(String[] args) {
        String date = "30/12/2021 17:35:00";
        timeStamp(date);
    }
    static public void timeStamp (String date){
        System.out.println("//" +  date.replace(" ", "").replace("/", "").replace(":", ""));
    }
}

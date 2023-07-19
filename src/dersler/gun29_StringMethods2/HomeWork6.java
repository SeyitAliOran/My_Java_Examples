package dersler.gun29_StringMethods2;

public class HomeWork6 {
    //Write a method that accepts 2 strings(str1,str2) and checks if second string exist in first one.
    // if second exists, should print the position index.
    //checkWord(“Your parcel is delivered to your postcode: DA124DA”, “delivered”)
    public static void main(String[] args) {
        String str1 ="Your parcel is delivered to your postcode: DA124DA";
        String str2 = "delivered";
        index(str1,str2);
    }

    public static void index(String str1, String str2) {
        int index = str1.indexOf(str2);
        if (index == -1){
            System.out.println("Str1 " + str2 + " icermiyor.");
        } else{
            System.out.println("Str1 " + str2 + " iceriyor.");
            System.out.println("Index pozisyonu: " + index);
        }

    }
}
